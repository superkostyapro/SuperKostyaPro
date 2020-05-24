package main.actor

import Phaser.GameObjects.Graphics
import main.UNIT
import main.maze.Cell
import main.maze.OrthogonalCell
import kotlin.math.max
import kotlin.math.min

fun Graphics.drawCutBlock(cX: Float, cY: Float, sides: List<Cell.Side>) {
    val width = UNIT
    val height = UNIT
    val x = cX - width / 2
    val y = cY - height / 2
    fillRect(x, y, width, height)
    val right = x + width
    val bottom = y + height
    val space = 10f
    var s = space
    while (s < height) {
        val x2 = x + s
        lineBetween(x, y + s, min(x2, right), y + max(0f, x2 - right))
        s += space
    }
    s -= height
    while (s < width) {
        val x2 = x + height + s
        lineBetween(x + s, bottom, min(x2, right), y + max(0f, x2 - right))
        s += space
    }
    if (sides.contains(OrthogonalCell.Side.NORTH)) {
        lineBetween(x, y, right, y)
    }
    if (sides.contains(OrthogonalCell.Side.WEST)) {
        lineBetween(x, y, x, bottom)
    }
    if (sides.contains(OrthogonalCell.Side.EAST)) {
        lineBetween(right, y, right, bottom)
    }
    if (sides.contains(OrthogonalCell.Side.SOUTH)) {
        lineBetween(x, bottom, right, bottom)
    }
}