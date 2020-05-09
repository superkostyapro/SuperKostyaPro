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

    private lateinit var graphics: Graphics

    private lateinit var cursors: CursorKeys

    private val blocks = mutableListOf<Block>()

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
        cameras.main.setSize(UNIT_W * (cols * 2 + 1), UNIT_H * (rows * 3 + 1))
        generateMaze(cols, rows).forEachCellIndexed { col, row, cell ->
            val x = UNIT_W * (col * 2 + 0.5f)
            val y = UNIT_H * (row * 3 + 0.5f)
            //console.log("$x $y")
            graphics.lineStyle(16, 0x00ff00)
            graphics.strokeRect(x, y, UNIT_W * 2, UNIT_H * 3)
            graphics.lineStyle(4, 0xff0000)
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT_W, y))
                graphics.lineBetween(x, y, x + UNIT_W * 2, y)
            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x, y + UNIT_H))
                blocks.add(CutBlock(0xffffff, 0x000000, x, y + UNIT_H * 2))
                graphics.lineBetween(x, y, x, y + UNIT_H * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.EAST)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT_W * 2, y + UNIT_H))
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT_W * 2, y + UNIT_H * 2))
                graphics.lineBetween(x + UNIT_W * 2, y, x + UNIT_W * 2, y + UNIT_H * 3)
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH)) {
                blocks.add(CutBlock(0xffffff, 0x000000, x + UNIT_W, y + UNIT_H * 3))
                graphics.lineBetween(x, y + UNIT_H * 3, x + UNIT_W * 2, y + UNIT_H * 3)
            }
            /*if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                //y += UNIT_H
                blocks.add(CutBlock(0xffffff, 0x000000, col * UNIT_W, row * UNIT_H))
            }*/
        }
        with(graphics) {
            blocks.forEach {
                it.draw(this)
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