package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Sound.BaseSound
import Phaser.Types.Scenes.SettingsConfig
import main.UNIT
import main.actor.drawCut
import main.extension.jsObject
import main.maze.OrthogonalCell
import main.maze.generateMaze

abstract class GameScene(config: SettingsConfig) : BaseScene(config) {

    protected var background: BaseSound? = null

    override fun create() {
        background = sound.add("bg$tag", jsObject {
            loop = true
        })
        //background.play()
    }

    protected fun generateMap(cols: Int, rows: Int) {
        val graphics = add.graphics()
        cameras.main.setSize(UNIT * (cols * SCALE_X + 1), UNIT * (rows * SCALE_Y + 1))
        generateMaze(cols, rows).forEachCellIndexed { col, row, cell ->
            val x = UNIT * (col * SCALE_X + 0.5f)
            val y = UNIT * (row * SCALE_Y + 0.5f)
            graphics.lineStyle(16, 0x00ff00)
            graphics.strokeRect(x, y, UNIT * SCALE_X, UNIT * SCALE_Y)
            graphics.lineStyle(4, 0xff0000)
            cell.getCellOnSide(OrthogonalCell.Side.NORTH)
            cell.getCellOnPoint(OrthogonalCell.NORTH_EAST)
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                createBlock().drawCut(x + UNIT, y)
                graphics.lineBetween(x, y, x + UNIT * SCALE_X, y)
            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                createBlock().drawCut(x, y + UNIT)
                createBlock().drawCut(x, y + UNIT * SCALE_X)
                graphics.lineBetween(x, y, x, y + UNIT * SCALE_Y)
            }

            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {

            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH) || cell.hasSide(OrthogonalCell.Side.EAST)) {

            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {

            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH) || cell.hasSide(OrthogonalCell.Side.WEST)) {

            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH) || cell.hasSide(OrthogonalCell.Side.WEST)) {

            }

            if (cell.hasSide(OrthogonalCell.Side.EAST)) {
                (1 until SCALE_Y).forEach {
                    createBlock().drawCut(x + UNIT * SCALE_X, y + UNIT * it)
                }
                graphics.lineBetween(x + UNIT * SCALE_X, y, x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH) || cell.hasSide(OrthogonalCell.Side.EAST)) {
                createBlock().drawCut(x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH)) {
                (1 until SCALE_X).forEach {
                    createBlock().drawCut(x + UNIT * it, y + UNIT * SCALE_Y)
                }
                graphics.lineBetween(x, y + UNIT * SCALE_Y, x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
            }
        }
    }

    abstract fun createBlock(): Graphics

    companion object {

        const val SCALE_X = 2
        const val SCALE_Y = 3
    }
}