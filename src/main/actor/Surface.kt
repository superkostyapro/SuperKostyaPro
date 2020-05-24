package main.actor

import Phaser.GameObjects.Graphics
import main.UNIT
import main.maze.Cell
import main.maze.OrthogonalCell

fun Graphics.drawDimension(cX: Float, cY: Float, length: Float, side: Cell.Side) {
    val size = UNIT * 0.3f
    val offset = 10
    if (side == OrthogonalCell.Side.NORTH) {
        lineBetween(cX, cY, cX, cY + size)
        lineBetween(cX + length, cY, cX + length, cY + size)
        lineBetween(cX, cY + size - offset, cX + length, cY + size - offset)
    }
    if (side == OrthogonalCell.Side.WEST) {
        lineBetween(cX, cY, cX + size, cY)
        lineBetween(cX, cY + length, cX + size, cY + length)
        lineBetween(cX + size - offset, cY, cX + size - offset, cY + length)
    }
    if (side == OrthogonalCell.Side.EAST) {
        lineBetween(cX, cY, cX, cY + size)
        lineBetween(cX + length, cY, cX + length, cY + size)
        lineBetween(cX, cY + offset, cX + length, cY + offset)
    }
    if (side == OrthogonalCell.Side.SOUTH) {
        lineBetween(cX, cY, cX, cY + size)
        lineBetween(cX + length, cY, cX + length, cY + size)
        lineBetween(cX, cY + offset, cX + length, cY + offset)
    }
}