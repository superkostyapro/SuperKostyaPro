package main.maze

import kotlin.random.Random

/**
 * Recursive backtracking algorithm
 */
class MazeGenerator(private val width: Int, private val height: Int) {

    private val data = Array(width) {
        Array(height) {
            WALL
        }
    }

    fun generate(): List<MazeCell> {
        for (x in 0 until width) {
            for (y in 0 until height) {
                data[x][y] = WALL
            }
        }
        for (x in 0 until width) {
            data[x][0] = SPACE
            data[x][height - 1] = SPACE
        }
        for (y in 0 until height) {
            data[0][y] = SPACE
            data[width - 1][y] = SPACE
        }
        data[2][2] = SPACE
        carve(2, 2)
        data[width - 2][height - 3] = SPACE
        val cells = mutableListOf<MazeCell>()
        data.forEachIndexed { row, subdata ->
            subdata.forEachIndexed { col, value ->
                if (value == WALL) {
                    cells.add(MazeCell(col, row).apply {
                        setBorders(
                            data[col][row - 1],
                            subdata[col - 1],
                            subdata[col + 1],
                            data[col][row + 1]
                        )
                    })
                }
            }
        }
        return cells
    }

    private fun carve(x: Int, y: Int) {
        val upX = intArrayOf(1, -1, 0, 0)
        val upY = intArrayOf(0, 0, 1, -1)
        var dir = Random.nextInt(4)
        var count = 0
        while (count < 4) {
            val x1 = x + upX[dir]
            val y1 = y + upY[dir]
            val x2 = x1 + upX[dir]
            val y2 = y1 + upY[dir]
            if (data[x1][y1] == WALL && data[x2][y2] == WALL) {
                data[x1][y1] = SPACE
                data[x2][y2] = SPACE
                carve(x2, y2)
            } else {
                dir = (dir + 1) % 4
                count += 1
            }
        }
    }

    @Suppress("unused")
    fun print() {
        for (y in 0 until height) {
            for (x in 0 until width) {
                print(
                    when (data[x][y]) {
                        WALL -> "[]"
                        else -> "  "
                    }
                )
            }
            println()
        }
    }

    companion object {

        const val SPACE = 0
        const val WALL = 1
    }
}