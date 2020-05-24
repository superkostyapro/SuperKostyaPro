package main.actor

import Phaser.GameObjects.Graphics
import main.UNIT
import main.maze.Cell
import main.maze.OrthogonalCell

fun Graphics.drawDimension(cX: Float, cY: Float, length: Float, side: Cell.Side) {
    val size = UNIT * 0.3f
    val offset = 10
    when (side) {
        OrthogonalCell.Side.NORTH -> {
            lineBetween(cX - length / 2, cY, cX - length / 2, cY + size)
            lineBetween(cX + length / 2, cY, cX + length / 2, cY + size)
            lineBetween(cX - length / 2, cY + size - offset, cX + length / 2, cY + size - offset)
        }
        OrthogonalCell.Side.WEST -> {
            lineBetween(cX, cY - length / 2, cX + size, cY - length / 2)
            lineBetween(cX, cY + length / 2, cX + size, cY + length / 2)
            lineBetween(cX + size - offset, cY - length / 2, cX + size - offset, cY + length / 2)
        }
        OrthogonalCell.Side.EAST -> {
            lineBetween(cX, cY - length / 2, cX - size, cY - length / 2)
            lineBetween(cX, cY + length / 2, cX - size, cY + length / 2)
            lineBetween(cX - size + offset, cY - length / 2, cX - size + offset, cY + length / 2)
        }
        OrthogonalCell.Side.SOUTH -> {
            lineBetween(cX - length / 2, cY, cX - length / 2, cY - size)
            lineBetween(cX + length / 2, cY, cX + length / 2, cY - size)
            lineBetween(cX - length / 2, cY - size + offset, cX + length / 2, cY - size + offset)
        }
    }
}