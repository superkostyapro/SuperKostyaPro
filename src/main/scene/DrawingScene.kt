package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Types.Input.Keyboard.CursorKeys
import main.UNIT
import main.actor.drawCut
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
        val cols = 30
        val rows = 10
        cameras.main.setSize(UNIT * (cols * 2 + 1), UNIT * (rows * 3 + 1))
        graphics = add.graphics()
        generateMaze(cols, rows).forEachCellIndexed { col, row, cell ->
            val x = UNIT * (col * 2 + 0.5f)
            val y = UNIT * (row * 3 + 0.5f)
            //console.log("$x $y")
            graphics.lineStyle(16, 0x00ff00)
            graphics.strokeRect(x, y, UNIT * 2, UNIT * 3)
            graphics.lineStyle(4, 0xff0000)
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                createBlock().drawCut(x + UNIT, y)
                graphics.lineBetween(x, y, x + UNIT * 2, y)
            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                createBlock().drawCut(x, y + UNIT)
                createBlock().drawCut(x, y + UNIT * 2)
                graphics.lineBetween(x, y, x, y + UNIT * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.EAST)) {
                createBlock().drawCut(x + UNIT * 2, y + UNIT)
                createBlock().drawCut(x + UNIT * 2, y + UNIT * 2)
                graphics.lineBetween(x + UNIT * 2, y, x + UNIT * 2, y + UNIT * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH)) {
                createBlock().drawCut(x + UNIT, y + UNIT * 3)
                graphics.lineBetween(x, y + UNIT * 3, x + UNIT * 2, y + UNIT * 3)
            }
        }
    }

    private fun createBlock(): Graphics {
        return add.graphics().apply {
            fillStyle(0xf5f5f5)
            lineStyle(2, 0x000000)
            physics.add.existing(this, true)
            body.setSize(UNIT, UNIT)
        }
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