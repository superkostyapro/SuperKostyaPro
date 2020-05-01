package pro.superkostya

import java.util.*

class Maze(private val width: Int, private val height: Int) {

    private val data = Array(width) {
        Array(height) {
            WALL_ID
        }
    }

    private val rand = Random()

    init {
        generate()
    }

    fun generate() {
        for (x in 0 until width) {
            for (y in 0 until height) {
                data[x][y] = WALL_ID
            }
        }
        for (x in 0 until width) {
            data[x][0] = SPACE_ID
            data[x][height - 1] = SPACE_ID
        }
        for (y in 0 until height) {
            data[0][y] = SPACE_ID
            data[width - 1][y] = SPACE_ID
        }
        data[2][2] = SPACE_ID
        carve(2, 2)
        data[width - 2][height - 3] = SPACE_ID
    }

    private fun carve(x: Int, y: Int) {
        val upX = intArrayOf(1, -1, 0, 0)
        val upY = intArrayOf(0, 0, 1, -1)
        var dir = rand.nextInt(4)
        var count = 0
        while (count < 4) {
            val x1 = x + upX[dir]
            val y1 = y + upY[dir]
            val x2 = x1 + upX[dir]
            val y2 = y1 + upY[dir]
            if (data[x1][y1] == WALL_ID && data[x2][y2] == WALL_ID) {
                data[x1][y1] = SPACE_ID
                data[x2][y2] = SPACE_ID
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
                print(when (data[x][y]) {
                    WALL_ID -> "[]"
                    else -> "  "
                })
            }
            println()
        }
    }

    companion object {

        const val SPACE_ID = 0
        const val WALL_ID = -1
    }
}

fun main() {
    val maze = Maze(33, 11)
    maze.generate()
    maze.print()
}