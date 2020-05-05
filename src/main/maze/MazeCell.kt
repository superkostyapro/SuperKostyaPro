package main.maze

/**
 * The coordinate system
 * 0 -> col
 * |
 * v
 * row
 */
class MazeCell(val col: Int, val row: Int) {

    /**
     * 0x0000(top)(left)(right)(bottom)
     */
    var mask = 0x0

    fun updateMask(top: Int, left: Int, right: Int, bottom: Int) {
        mask = 0x0
        if (top == MazeGenerator.WALL) {
            mask = mask.or(0x1000)
        }
        if (left == MazeGenerator.WALL) {
            mask = mask.or(0x0100)
        }
        if (right == MazeGenerator.WALL) {
            mask = mask.or(0x0010)
        }
        if (bottom == MazeGenerator.WALL) {
            mask = mask.or(0x0001)
        }
    }
}