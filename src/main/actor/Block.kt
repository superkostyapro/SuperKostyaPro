package main.actor

import Phaser.GameObjects.Graphics
import main.UNIT
import kotlin.math.max
import kotlin.math.min

fun Graphics.drawCut(
    cX: Float,
    cY: Float,
    width: Float = UNIT,
    height: Float = UNIT
) {
    val x = cX - width / 2
    val y = cY - height / 2
    fillRect(x, y, width, height)
    val right = x + width
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
        lineBetween(x + s, y + height, min(x2, right), y + max(0f, x2 - right))
        s += space
    }
}