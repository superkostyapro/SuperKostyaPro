package main.maze

class MazeCell(val col: Int, val row: Int) {

    /**
     * Mask from left to right
     * top - left - right - bottom
     *  0
     * 1 2
     *  3
     */
    var borders = 0x0000

    fun setBorders(top: Int, left: Int, right: Int, bottom: Int) {
        if (top == MazeGenerator.WALL) {
            borders = borders.or(0x1000)
        }
        if (left == MazeGenerator.WALL) {
            borders = borders.or(0x0100)
        }
        if (right == MazeGenerator.WALL) {
            borders = borders.or(0x0010)
        }
        if (bottom == MazeGenerator.WALL) {
            borders = borders.or(0x0001)
        }
        println("$top $left $right $bottom $borders")
    }
}