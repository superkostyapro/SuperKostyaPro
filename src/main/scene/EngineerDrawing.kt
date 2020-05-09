package main.scene

import Phaser.GameObjects.Graphics
import main.actor.block.Block
import main.extension.jsObject

class EngineerDrawing : BaseScene(jsObject {
    key = "Engine"
}) {

    private lateinit var graphics: Graphics

    private val blocks = mutableListOf<Block>()

    init {
    }

    override fun create() {
        graphics = add.graphics()
        physics.world.enable(graphics)
        Phaser.GameObjects.Rectangle(this, 0, 0, 100, 100, 0xff0000, 0)
        var x = 0
        var y = 0
        /*generateMaze(100, 30).forEachCell {
            if (it.hasSide(OrthogonalCell.Side.EAST)) {
                x += UNIT_W
            }
            if (it.hasSide(OrthogonalCell.Side.SOUTH)) {
                y += UNIT_H
            }
            blocks.add(CutBlock(0xff0000, 0x00ff00, x, y))
        }*/
    }

    override fun update(time: Float, delta: Float) {
        with(graphics) {
            clear()
            blocks.forEach {
                it.draw(this)
            }
        }
    }
}