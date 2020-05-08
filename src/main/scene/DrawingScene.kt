package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Types.Input.Keyboard.CursorKeys
import main.UNIT_H
import main.UNIT_W
import main.actor.block.Block
import main.actor.block.CutBlock
import main.extension.jsObject
import main.maze.OrthogonalCell
import main.maze.generateMaze

class DrawingScene : BaseScene(jsObject {
    key = "Draw"
}) {

    override val tag = this::class.js.name

    private lateinit var graphics: Graphics

    private lateinit var cursors: CursorKeys

    private val blocks = mutableListOf<Block>()

    override fun preload() {
        load.audio("bg${this::class.js.name}", "sound/01 - Super Mario Bros.mp3")
    }

    override fun create() {
        super.create()
        cameras.main.setSize(6000, 6000)
        physics.world.setBounds(0, 0, 6000, 6000)
        cameras.main.setBackgroundColor(0xfafafa)
        cursors = input.keyboard.createCursorKeys()
        graphics = add.graphics()
        //physics.world.enable(graphics)
        val width = 100
        val height = 30
        generateMaze(width, height).forEachCellIndexed { col, row, cell ->
            console.log("$row $col")
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                //y += UNIT_H
                blocks.add(CutBlock(0xffffff, 0x000000, col * UNIT_W, row * UNIT_H))
            }
        }
        /*generateMaze(width, height).forEachCellIndexed { index, cell ->
            var x = UNIT_W * (1f + index / width)
            var y = UNIT_H * (1f + index % height)
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                //x += UNIT_W
            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                //y += UNIT_H
            }
            console.log("$x, $y")
        }*/
    }

    override fun update(time: Float, delta: Float) {
        with(graphics) {
            clear()
            blocks.forEach {
                it.draw(this)
            }
        }
        if (cursors.up?.isDown == true) {
            cameras.main.y -= 4
        } else if (cursors.down?.isDown == true) {
            cameras.main.y += 4
        }

        if (cursors.left?.isDown == true) {
            cameras.main.x -= 4
        } else if (cursors.right?.isDown == true) {
            cameras.main.x += 4
        }
    }
}