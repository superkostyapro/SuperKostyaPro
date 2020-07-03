package main.actor

import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Text
import Phaser.Geom.Rectangle
import main.UNIT
import main.maze.Cell
import main.maze.OrthogonalCell

fun Graphics.drawDimension(cX: Float, cY: Float, length: Float, side: Cell.Side, text: Text) {
    val size = UNIT * 0.6f
    val offset = 6
    val arrowW = 6
    val arrowH = 6
    val textBounds = text.getBounds<Rectangle>()
    when (side) {
        OrthogonalCell.Side.NORTH -> {
            lineBetween(cX - length / 2, cY, cX - length / 2, cY + size)
            lineBetween(cX + length / 2, cY, cX + length / 2, cY + size)
            lineBetween(cX - length / 2, cY + size - offset, cX + length / 2, cY + size - offset)
            text.setX(cX - textBounds.width / 2)
            text.setY(cY + size)
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
            //fillTriangle(cX)
            text.setX(cX - textBounds.width / 2)
            text.setY(cY - size - textBounds.height)
        }
    }
}