package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Sound.BaseSound
import Phaser.Types.Scenes.SettingsConfig
import main.UNIT
import main.actor.drawCut
import main.extension.jsObject
import main.maze.OrthogonalCell
import main.maze.OrthogonalMaze
import main.maze.generator.*

abstract class GameScene(config: SettingsConfig) : BaseScene(config) {

    protected var background: BaseSound? = null

    override fun create() {
        background = sound.add("bg$tag", jsObject {
            loop = true
        })
        //background.play()
    }

    protected fun generateMap(level: Int) {
        val cols: Int
        val rows: Int
        val generator: Generator
        when (level) {
            1 -> {
                cols = 10
                rows = 10
                generator = WilsonGenerator()
            }
            2 -> {
                cols = 10
                rows = 10
                generator = EllerGenerator()
            }
            3 -> {
                cols = 10
                rows = 10
                generator = KruskalGenerator()
            }
            else -> {
                cols = 10
                rows = 10
                generator = PrimGenerator()
            }
        }
        val graphics = add.graphics()
        cameras.main.setSize(UNIT * (cols * SCALE_X + 1), UNIT * (rows * SCALE_Y + 1))
        val maze = OrthogonalMaze(cols, rows)
        generator.generate(maze)
        maze.forEachCellIndexed { col, row, cell ->
            val x = UNIT * (col * SCALE_X + 0.5f)
            val y = UNIT * (row * SCALE_Y + 0.5f)
            graphics.lineStyle(16, 0x00ff00)
                .strokeRect(x, y, UNIT * SCALE_X, UNIT * SCALE_Y)
                .lineStyle(4, 0xff0000)
            if (cell.hasSide(OrthogonalCell.Side.NORTH) || cell.hasSide(OrthogonalCell.Side.EAST)) {
                val top = cell.getCellOnSide(OrthogonalCell.Side.NORTH)
                if (
                    top == null || (!top.hasSide(OrthogonalCell.Side.SOUTH) && !top.hasSide(
                        OrthogonalCell.Side.EAST
                    ))
                ) {
                    createBlock().drawCut(x + UNIT * SCALE_X, y)
                }
            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH) || cell.hasSide(OrthogonalCell.Side.WEST)) {
                val top = cell.getCellOnSide(OrthogonalCell.Side.NORTH)
                val topLeft = cell.getCellOnPoint(OrthogonalCell.NORTH_WEST)
                val left = cell.getCellOnSide(OrthogonalCell.Side.WEST)
                if (
                    (top == null || (!top.hasSide(OrthogonalCell.Side.SOUTH) && !top.hasSide(
                        OrthogonalCell.Side.WEST
                    ))) &&
                    (topLeft == null || (!topLeft.hasSide(OrthogonalCell.Side.SOUTH) && !topLeft.hasSide(
                        OrthogonalCell.Side.EAST
                    ))) &&
                    (left == null || (!left.hasSide(OrthogonalCell.Side.NORTH) && !left.hasSide(
                        OrthogonalCell.Side.EAST
                    )))
                ) {
                    createBlock().drawCut(x, y)
                }
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH) || cell.hasSide(OrthogonalCell.Side.WEST)) {
                val left = cell.getCellOnSide(OrthogonalCell.Side.WEST)
                val bottomLeft = cell.getCellOnPoint(OrthogonalCell.SOUTH_WEST)
                if (
                    (left == null || (!left.hasSide(OrthogonalCell.Side.SOUTH) && !left.hasSide(
                        OrthogonalCell.Side.EAST
                    ))) &&
                    (bottomLeft == null || (!bottomLeft.hasSide(OrthogonalCell.Side.NORTH) && !bottomLeft.hasSide(
                        OrthogonalCell.Side.EAST
                    )))
                ) {
                    createBlock().drawCut(x, y + UNIT * SCALE_Y)
                }
            }
            if (cell.hasSide(OrthogonalCell.Side.SOUTH) || cell.hasSide(OrthogonalCell.Side.EAST)) {
                createBlock().drawCut(x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH)) {
                val exists = cell.getCellOnSide(OrthogonalCell.Side.NORTH)
                    ?.hasSide(OrthogonalCell.Side.SOUTH) ?: false
                if (!exists) {
                    (1 until SCALE_X).forEach {
                        createBlock().drawCut(x + UNIT * it, y)
                    }
                }
                graphics.lineBetween(x, y, x + UNIT * SCALE_X, y)
            }
            if (cell.hasSide(OrthogonalCell.Side.WEST)) {
                val exists = cell.getCellOnSide(OrthogonalCell.Side.WEST)
                    ?.hasSide(OrthogonalCell.Side.EAST) ?: false
                if (!exists) {
                    (1 until SCALE_Y).forEach {
                        createBlock().drawCut(x, y + UNIT * it)
                    }
                }
                graphics.lineBetween(x, y, x, y + UNIT * SCALE_Y)
            }
            if (cell.hasSide(OrthogonalCell.Side.EAST)) {
                (1 until SCALE_Y).forEach {
                    createBlock().drawCut(x + UNIT * SCALE_X, y + UNIT * it)
                }
                graphics.lineBetween(x + UNIT * SCALE_X, y, x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
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

    @Suppress("ConstantConditionIf")
    companion object {

        const val SCALE_X = 2
        const val SCALE_Y = 4

        init {
            if (SCALE_X <= 1 || SCALE_Y <= 1) {
                throw Throwable("Scale values must be at least 2.")
            }
        }
    }
}