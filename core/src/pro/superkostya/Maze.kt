package pro.superkostya

import java.util.*

private enum class Cell {
    WALL, SPACE
}

@Suppress("MemberVisibilityCanBePrivate")
class Maze(val width: Int, val height: Int) {

    private val data = Array(width) {
        Array(height) {
            Cell.WALL
        }
    }

    private val rand = Random()

    init {
        generate()
    }

    fun generate() {
        for (x in 0 until width) {
            for (y in 0 until height) {
                data[x][y] = Cell.WALL
            }
        }
        for (x in 0 until width) {
            data[x][0] = Cell.SPACE
            data[x][height - 1] = Cell.SPACE
        }
        for (y in 0 until height) {
            data[0][y] = Cell.SPACE
            data[width - 1][y] = Cell.SPACE
        }
        data[2][2] = Cell.SPACE
        carve(2, 2)
        data[2][1] = Cell.SPACE
        data[width - 3][height - 2] = Cell.SPACE
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
            if (data[x1][y1] == Cell.WALL && data[x2][y2] == Cell.WALL) {
                data[x1][y1] = Cell.SPACE
                data[x2][y2] = Cell.SPACE
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
                if (data[x][y] == Cell.WALL) {
                    print("[]")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}