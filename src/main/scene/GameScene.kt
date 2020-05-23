package main.scene

import Phaser.Sound.BaseSound
import Phaser.Types.Scenes.SettingsConfig
import main.UNIT
import main.extension.jsObject
import main.maze.Cell
import main.maze.OrthogonalCell.Companion.NORTH_EAST
import main.maze.OrthogonalCell.Companion.NORTH_WEST
import main.maze.OrthogonalCell.Companion.SOUTH_EAST
import main.maze.OrthogonalCell.Companion.SOUTH_WEST
import main.maze.OrthogonalCell.Side.*
import main.maze.OrthogonalMaze
import main.maze.generator.EllerGenerator
import main.maze.generator.KruskalGenerator
import main.maze.generator.PrimGenerator
import main.maze.generator.WilsonGenerator
import kotlin.math.max

abstract class GameScene(config: SettingsConfig) : BaseScene(config) {

    protected var background: BaseSound? = null

    override fun create() {
        background = sound.add("bg$tag", jsObject {
            loop = true
        })
        //background.play()
    }

    protected fun generateMap(level: Int) {
        val cols = max(level, 2) * (SCALE_Y + 0)
        val rows = max(level, 2) * (SCALE_X + 0)
        //val graphics = add.graphics()
        cameras.main.setSize(UNIT * (cols * SCALE_X + 1), UNIT * (rows * SCALE_Y + 1))
        console.log("${UNIT * (cols * SCALE_X + 1)} ${UNIT * (rows * SCALE_Y + 1)}")
        val maze = OrthogonalMaze(cols, rows)
        when (level) {
            1 -> WilsonGenerator()
            2 -> EllerGenerator()
            3 -> KruskalGenerator()
            else -> PrimGenerator()
        }.generate(maze)
        maze.forEachCellIndexed { col, row, cell ->
            //graphics.lineStyle(16, 0x00ff00)
            //.strokeRect(x, y, UNIT * SCALE_X, UNIT * SCALE_Y)
            val x = UNIT * (col * SCALE_X + 0.5f)
            val y = UNIT * (row * SCALE_Y + 0.5f)
            val top = cell.getCellOnSide(NORTH)
            val right = cell.getCellOnSide(EAST)
            val left = cell.getCellOnSide(WEST)
            val bottom = cell.getCellOnSide(SOUTH)
            val sides = mutableListOf<Cell.Side>()
            if (cell.hasSide(NORTH)) {
                val exists = top?.hasSide(SOUTH) ?: false
                if (!exists) {
                    (1 until SCALE_X).forEach {
                        createBlock(x + UNIT * it, y, NORTH, SOUTH)
                    }
                }
            }
            if (cell.hasSide(WEST)) {
                val exists = left?.hasSide(EAST) ?: false
                if (!exists) {
                    (1 until SCALE_Y).forEach {
                        createBlock(x, y + UNIT * it, WEST, EAST)
                    }
                }
            }
            if (cell.hasSide(EAST)) {
                (1 until SCALE_Y).forEach {
                    createBlock(x + UNIT * SCALE_X, y + UNIT * it, WEST, EAST)
                }
            }
            if (cell.hasSide(SOUTH)) {
                (1 until SCALE_X).forEach {
                    createBlock(x + UNIT * it, y + UNIT * SCALE_Y, NORTH, SOUTH)
                }
            }
            if (cell.hasSide(NORTH) || cell.hasSide(WEST)) {
                val topLeft = cell.getCellOnPoint(NORTH_WEST)
                if (
                    top?.hasSide(SOUTH, WEST) != true &&
                    topLeft?.hasSide(SOUTH, EAST) != true &&
                    left?.hasSide(NORTH, EAST) != true
                ) {
                    createBlock(x, y, NORTH, WEST)
                }
            }
            if (cell.hasSide(NORTH) || cell.hasSide(EAST)) {
                val topRight = cell.getCellOnPoint(NORTH_EAST)
                if (top?.hasSide(SOUTH, EAST) != true) {
                    var east: Cell.Side? = null
                    if (right?.hasSide(NORTH) != true && topRight?.hasSide(SOUTH) != true) {
                        east = EAST
                    }
                    createBlock(x + UNIT * SCALE_X, y, NORTH, east)
                }
            }
            if (cell.hasSide(SOUTH) || cell.hasSide(WEST)) {
                val bottomLeft = cell.getCellOnPoint(SOUTH_WEST)
                if (
                    left?.hasSide(SOUTH, EAST) != true &&
                    bottomLeft?.hasSide(NORTH, EAST) != true
                ) {
                    var south: Cell.Side? = null
                    if (bottom?.hasSide(WEST) != true) {
                        south = SOUTH
                    }
                    createBlock(x, y + UNIT * SCALE_Y, WEST, south)
                }
            }
            if (cell.hasSide(SOUTH) || cell.hasSide(EAST)) {
                val bottomRight = cell.getCellOnPoint(SOUTH_EAST)
                if (cell.hasSide(NORTH) || top?.hasSide(SOUTH) != true) {
                    sides.add(NORTH)
                }
                if (right?.hasSide(SOUTH) != true && bottomRight?.hasSide(NORTH) != true) {
                    sides.add(EAST)
                }
                if (cell.hasSide(NORTH) || top?.hasSide(SOUTH) != true) {
                    sides.add(WEST)
                }
                if (bottom?.hasSide(EAST) != true && bottomRight?.hasSide(WEST) != true) {
                    sides.add(SOUTH)
                }
                createBlock(x + UNIT * SCALE_X, y + UNIT * SCALE_Y, sides)
            }
        }
    }

    abstract fun createBlock(cX: Float, cY: Float, sides: List<Cell.Side>)

    companion object {

        const val SCALE_X = 3
        const val SCALE_Y = 5
    }
}