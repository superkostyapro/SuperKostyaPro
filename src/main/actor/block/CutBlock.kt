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
        //lineBetween(blockX - halfLine, blockY, blockX - halfLine, blockY + blockHeight)
        val minSize = min(width, height)
        val maxSize = max(width, height)
        val space = minSize / 8
        var s = space
        while (s < maxSize) {
            it.lineBetween(x + s, y, x, y + s)
            s += space
        }
    }
}