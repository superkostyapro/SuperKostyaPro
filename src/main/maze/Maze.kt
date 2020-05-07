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
    }

    /**
     * Sets all sides of all cells in the maze, resets all visited and distance map flags.
     */
    fun fillAll() {
        forEachCell {
            it.value = it.allSidesValue
            it.visited = false
        }
    }
}
