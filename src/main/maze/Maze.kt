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

/**
 * Base class for a maze.
 */
abstract class Maze {

    /**
     * The list of cell with openings in the maze.
     */
    private val openings = mutableListOf<Cell>()

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
        }
        openings.clear()
    }

    /**
     * Sets all sides of all cells in the maze, resets all visited and distance map flags.
     */
    fun fillAll() {
        forEachCell {
            it.value = it.allSidesValue
            it.visited = false
        }
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

    companion object {
        const val OPENING_POS_START = Int.MIN_VALUE
        const val OPENING_POS_CENTER = Int.MIN_VALUE + 1
        const val OPENING_POS_END = Int.MIN_VALUE + 2
    }
}
