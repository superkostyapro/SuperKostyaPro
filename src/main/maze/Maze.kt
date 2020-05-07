/*
 * Copyright (c) 2019 Nicolas Maltais
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to
 * deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom
 * the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package main.maze

import kotlin.math.min
import kotlin.math.round
import kotlin.random.Random

/**
 * Base class for a maze.
 */
abstract class Maze {

    /**
     * The list of cell with openings in the maze.
     */
    private val openings = mutableListOf<Cell>()

    /**
     * The maze solution, a list of the path's cells starting from the first
     * opening and ending on the second. Null if no solution was found yet.
     */
    var solution: List<Cell>? = null
        private set

    /**
     * Whether a distance map has been generated or not.
     */
    var hasDistanceMap = false
        protected set

    /**
     * Get the total number of cells in this maze.
     */
    abstract val cellCount: Int

    /**
     * Returns the cell at [pos] if it exists, otherwise returns null.
     */
    abstract fun cellAt(pos: Position): Cell?

    /**
     * Returns a random cell in the maze.
     */
    abstract fun getRandomCell(): Cell

    /**
     * Creates and returns a list containing all the cells in this maze.
     */
    abstract fun getAllCells(): MutableList<out Cell>

    /**
     * Call [action] on every cell.
     */
    abstract fun forEachCell(action: (Cell) -> Unit)

    /**
     * Clears all sides of all cells in the maze, resets all visited and distance map flags.
     */
    fun resetAll() {
        forEachCell {
            it.value = 0
            it.visited = false
            it.distanceMapValue = -1
        }
        solution = null
        openings.clear()
    }

    /**
     * Sets all sides of all cells in the maze, resets all visited and distance map flags.
     */
    fun fillAll() {
        forEachCell {
            it.value = it.allSidesValue
            it.visited = false
            it.distanceMapValue = -1
        }
        solution = null
        openings.clear()
    }

    /**
     * Create an [opening] in the maze. An exception is thrown if the opening position
     * doesn't match any cell or if the opening already exists.
     */
    fun createOpening(opening: Position) {
        val cell = getOpeningCell(opening)
        if (cell != null) {
            if (openings.contains(cell)) {
                throw Throwable("Duplicate opening for position ${cell.position}.")
            }

            for (side in cell.allSides) {
                if (cell.getCellOnSide(side) == null) {
                    cell.openSide(side)
                    break
                }
            }

            openings.add(cell)
        } else {
            throw Throwable("Opening describes no cell in the maze.")
        }
    }

    /**
     * Get the cell described by the [opening] position.
     */
    abstract fun getOpeningCell(opening: Position): Cell?

    /**
     * If maze was previously solved, clear the solution.
     */
    fun clearSolution() {
        solution = null
    }

    /**
     * Open a number of deadends set by the braiding [setting].
     * Distance map is cleared and will need to be regenerated after braiding.
     */
    fun braid(setting: Braiding) {
        clearDistanceMap()

        val deadends = mutableListOf<Cell>()
        forEachCell {
            if (it.sidesCount == it.allSides.size - 1) {
                // A cell is a deadend if it has only one side opened.
                deadends.add(it)
            }
        }

        val count = setting.getNumberOfDeadendsToRemove(deadends.size)

        var removed = 0
        while (deadends.isNotEmpty() && removed < count) {
            val index = Random.nextInt(deadends.size)
            val deadend = deadends[index]
            deadends.removeAt(index)

            for (side in deadend.allSides) {
                if (!deadend.hasSide(side)) {
                    val deadside = side.opposite
                    val other = deadend.getCellOnSide(deadside)
                    if (other != null) {
                        // If the deadside is not a border, open it.
                        deadend.connectWith(other)
                    }
                    break
                }
            }
            removed++
        }
    }

    /**
     * Braiding setting for a maze.
     */
    class Braiding {

        private val value: Number
        private val byCount: Boolean

        /**
         * Braiding setting to remove [count] deadends.
         */
        constructor(count: Int) {
            if (count < 0) {
                throw Throwable("Braiding parameter must be a positive number.")
            }

            value = count
            byCount = true
        }

        /**
         * Braiding setting to remove a percentage, [percent], of the total number of deadends.
         */
        constructor(percent: Double) {
            if (percent < 0 || percent > 1) {
                throw Throwable("Braiding percentage must be between 0 and 1 inclusive.")
            }

            value = percent
            byCount = false
        }

        /**
         * Get the number of deadends to remove with this braiding
         * setting out of the [total] number of deadends.
         */
        fun getNumberOfDeadendsToRemove(total: Int) = if (byCount) {
            min(value.toInt(), total)
        } else {
            round(total * value.toDouble()).toInt()
        }

        override fun toString() = "Remove " + if (byCount) {
            "$value deadends"
        } else {
            "${value.toDouble() * 100}% of deadends"
        }
    }

    /**
     * Generate the distance map on this maze, using Dijkstra's algorithm to find
     * the shortest distance to every cell in the map, starting from [startPos].
     * See [this page](https://en.wikipedia.org/wiki/Dijkstra's_algorithm) for the algorithm.
     *
     * 1. Assign an arbitrarly high distance to all cells but the start cell, which is assigned a distance of 0.
     * 2. Create a list of unvisited cells containing all cells.
     * 3. Remove the cell with the lowest distance in the list. For each of its accessible
     *      neighbors, take the smallest distance between their current one and the
     *      one calculated from the removed cell.
     * 4. Repeat step 3 until the list is empty.
     *
     * Runtime complexity is O(n²) and memory space is O(n).
     * Implementation would be probably faster using a Fibonnaci heap.
     *
     * @param startPos Starting position (distance of zero), can be `null` for a random cell.
     */
    open fun generateDistanceMap(startPos: Position? = null) {
        val inf = Int.MAX_VALUE - 1
        forEachCell {
            it.visited = false
            it.distanceMapValue = inf
        }

        val startCell = if (startPos == null) {
            getRandomCell()
        } else {
            getOpeningCell(startPos) ?: throw Throwable(
                "Distance map start position describes no cell in the maze."
            )
        }
        startCell.distanceMapValue = 0

        val cellList = getAllCells()
        while (cellList.isNotEmpty()) {
            // Get and remove the cell with the lowest distance
            var minIndex = 0
            for (i in 1 until cellList.size) {
                val cell = cellList[i]
                if (cell.distanceMapValue < cellList[minIndex].distanceMapValue) {
                    minIndex = i
                }
            }

            val minCell = cellList.removeAt(minIndex)
            minCell.visited = true

            if (minCell.distanceMapValue == inf) {
                // This means the only cells left are inaccessible from the start cell.
                // The distance map can't be generated completely.
                error("Could not generate distance map, maze has inaccessible cells.")
            }

            // Compare unvisited accessible neighbors distance calculated from this cell with
            // their current distance. If new distance is smaller, update it.
            for (neighbor in minCell.findAccessibleNeighbors()) {
                if (!neighbor.visited) {
                    val newDistance = minCell.distanceMapValue + 1
                    if (newDistance < neighbor.distanceMapValue) {
                        neighbor.distanceMapValue = newDistance
                    }
                }
            }
        }

        hasDistanceMap = true
    }

    /**
     * Clear the distance map values on all cells.
     */
    open fun clearDistanceMap() {
        if (hasDistanceMap) {
            forEachCell {
                it.distanceMapValue = -1
            }
            hasDistanceMap = false
        }
    }

    companion object {
        const val OPENING_POS_START = Int.MIN_VALUE
        const val OPENING_POS_CENTER = Int.MIN_VALUE + 1
        const val OPENING_POS_END = Int.MIN_VALUE + 2
    }
}