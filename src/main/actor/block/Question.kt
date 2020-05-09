package main.actor.block

import Phaser.GameObjects.Graphics
import main.UNIT_H
import main.UNIT_W

class Question(
    private val backgroundColor: Int,
    private val lineColor: Int,
    x: Number,
    y: Number,
    width: Number = UNIT_W,
    height: Number = UNIT_H
) : Block(x, y, width, height) {

    override fun draw(graphics: Graphics) = with(graphics) {
        fillStyle(backgroundColor)
        fillRectShape(this@Question)
        /*if (mMask.and(MazeCell.TOP)) {

        }
        lineStyle(4, lineColor)
        lineBetween(blockX - halfLine, blockY, blockX - halfLine, blockY + blockHeight)
        while () {

            lineBetween(blockX, blockY - halfLine, blockX + blockWidth, blockY - halfLine)
        }*/
    }
}