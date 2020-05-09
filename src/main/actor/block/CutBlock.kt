package main.actor.block

import Phaser.GameObjects.Graphics
import main.UNIT_H
import main.UNIT_W
import kotlin.math.max
import kotlin.math.min

class CutBlock(
    private val backgroundColor: Int,
    private val lineColor: Int,
    x: Number,
    y: Number,
    width: Number = UNIT_W,
    height: Number = UNIT_H
) : Block(x, y, width, height) {

    override fun draw(graphics: Graphics) = graphics.let {
        it.fillStyle(backgroundColor)
        it.fillRectShape(this)
        it.lineStyle(2, lineColor)
        val space = min(width, height) / 8
        var s = space
        while (s < 2 * max(width, height)) {
            val y1 = y + s
            val x2 = x + s
            it.lineBetween(
                x + max(0f, y1 - bottom),
                min(y1, bottom),
                min(x2, right),
                y + max(0f, x2 - right)
            )
            s += space
        }
    }
}