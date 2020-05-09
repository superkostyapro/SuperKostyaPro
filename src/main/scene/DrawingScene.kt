package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Types.Input.Keyboard.CursorKeys
import main.UNIT
import main.extension.jsObject
import main.maze.OrthogonalCell
import main.maze.generateMaze

class DrawingScene : BaseScene(jsObject {
    key = "Draw"
}) {

    private lateinit var graphics: Graphics

    private lateinit var cursors: CursorKeys

    override fun preload() {
        load.audio("bg$tag", "sound/01 - Super Mario Bros.mp3")
    }

    override fun create() {
        super.create()
        cameras.main.setBackgroundColor(0xfafafa)
        cursors = input.keyboard.createCursorKeys()
        graphics = add.graphics()
        //physics.world.enable(graphics)
        val cols = 30
        val rows = 10
        cameras.main.setSize(UNIT * (cols * 2 + 1), UNIT * (rows * 3 + 1))
        generateMaze(cols, rows).forEachCellIndexed { col, row, cell ->
            val x = UNIT * (col * 2 + 0.5f)
            val y = UNIT * (row * 3 + 0.5f)
            //console.log("$x $y")
            graphics.lineStyle(16, 0x00ff00)
            graphics.strokeRect(x, y, UNIT * 2, UNIT * 3)
            graphics.lineStyle(4, 0xff0000)
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT, y))
                graphics.lineBetween(x, y, x + UNIT * 2, y)
            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x, y + UNIT))
                blocks.add(CutBlock(0xffffff, 0x000000, x, y + UNIT * 2))
                graphics.lineBetween(x, y, x, y + UNIT * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.EAST)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT * 2, y + UNIT))
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT * 2, y + UNIT * 2))
                graphics.lineBetween(x + UNIT * 2, y, x + UNIT * 2, y + UNIT * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT, y + UNIT * 3))
                graphics.lineBetween(x, y + UNIT * 3, x + UNIT * 2, y + UNIT * 3)
            }
        }
    }

    private fun createBlock(): Graphics {
        physics.add.sta
        val block = add.graphics()
        block.fillStyle(0xffffff, 1)
        block.fillRect(0, 0, 100, 100)
        physics.world.enable(block)
        block.body.setSize(100, 100)
        block.body.setBounce(0.1, 0.1)
        block.body.return block
    }

    override fun update(time: Float, delta: Float) {
        if (cursors.up?.isDown == true) {
            cameras.main.y += 40
        } else if (cursors.down?.isDown == true) {
            cameras.main.y -= 40
        }
        if (cursors.left?.isDown == true) {
            cameras.main.x += 40
        } else if (cursors.right?.isDown == true) {
            cameras.main.x -= 40
        }
    }
}