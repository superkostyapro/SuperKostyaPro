package main.actor.block

import Phaser.GameObjects.Graphics
import main.UNIT_H
import main.UNIT_W
import kotlin.math.max
import kotlin.math.min

class CutBlock(
    private val backgroundColor: Int,
    private val lineColor: Int,
    cX: Float,
    cY: Float,
    width: Float = UNIT_W,
    height: Float = UNIT_H
) : Block(cX, cY, width, height) {

    override fun draw(graphics: Graphics) = graphics.let {
        it.fillStyle(backgroundColor)
        it.fillRectShape(this)
        it.lineStyle(2, lineColor)
        val space = 10f
        var s = space
        while (s < height) {
            val x2 = x + s
            it.lineBetween(x, y + s, min(x2, right), y + max(0f, x2 - right))
            s += space
        }
        s -= height
        while (s < width) {
            val x2 = x + height + s
            it.lineBetween(x + s, bottom, min(x2, right), y + max(0f, x2 - right))
            s += space
        }
    }
}