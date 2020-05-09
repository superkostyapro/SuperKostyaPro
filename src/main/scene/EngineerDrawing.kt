package main.scene

import Phaser.GameObjects.Graphics
import main.UNIT_H
import main.UNIT_W
import main.actor.block.Block
import main.actor.block.CutBlock
import main.extension.jsObject
import main.maze.OrthogonalCell
import main.maze.generateMaze

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
        val width = 100
        val height = 30
        generateMaze(width, height).forEachCellIndexed { index, cell ->
            var x = UNIT_W * (1f + index / width)
            var y = UNIT_H * (1f + index % height)
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                //x += UNIT_W
            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                //y += UNIT_H
            }
            blocks.add(CutBlock(0xffffff, 0x000000, x, y))
            console.log("$x, $y")
        }
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