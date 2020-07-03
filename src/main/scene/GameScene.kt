package main.scene

import Phaser.GameObjects.Graphics
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

    protected lateinit var background: BaseSound

    protected lateinit var graphics: Graphics

    override fun create() {
        background = sound.add("bg$tag", jsObject {
            loop = true
        })
        //background.play()
        graphics = add.graphics()
    }

    protected fun generateMap(level: Int) {
        val cols = max(level, 2) * (SCALE_Y + 0)
        val rows = max(level, 2) * (SCALE_X + 0)
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
            //graphics.lineStyle(16, 0x00ff00).strokeRect(x, y, UNIT * SCALE_X, UNIT * SCALE_Y)
            val x = UNIT * (col * SCALE_X + 0.5f)
            val y = UNIT * (row * SCALE_Y + 0.5f)
            val width = UNIT * SCALE_X
            val height = UNIT * SCALE_Y
            val top = cell.getCellOnSide(NORTH)
            val right = cell.getCellOnSide(EAST)
            val left = cell.getCellOnSide(WEST)
            val bottom = cell.getCellOnSide(SOUTH)
            if (cell.hasSide(NORTH)) {
                val exists = top?.hasSide(SOUTH) ?: false
                if (!exists) {
                    (1 until SCALE_X).forEach {
                        createBlock(x + UNIT * it, y, listOf(NORTH, SOUTH))
                    }
                }
            }
            if (cell.hasSide(WEST)) {
                val exists = left?.hasSide(EAST) ?: false
                if (!exists) {
                    (1 until SCALE_Y).forEach {
                        createBlock(x, y + UNIT * it, listOf(WEST, EAST))
                    }
                }
            }
            if (cell.hasSide(EAST)) {
                (1 until SCALE_Y).forEach {
                    createBlock(x + width, y + UNIT * it, listOf(WEST, EAST))
                }
            }
            if (cell.hasSide(SOUTH)) {
                (1 until SCALE_X).forEach {
                    createBlock(x + UNIT * it, y + height, listOf(NORTH, SOUTH))
                }
                createSurface(x + width / 2, y + height - UNIT / 2, width - UNIT, SOUTH)
            }
            if (cell.hasSide(NORTH) || cell.hasSide(WEST)) {
                val topLeft = cell.getCellOnPoint(NORTH_WEST)
                if (
                    top?.hasSide(SOUTH, WEST) != true &&
                    topLeft?.hasSide(SOUTH, EAST) != true &&
                    left?.hasSide(NORTH, EAST) != true
                ) {
                    val sides = mutableListOf(NORTH, WEST)
                    if (!cell.hasSide(NORTH) && top?.hasSide(SOUTH) != true) {
                        sides.add(EAST)
                    }
                    if (!cell.hasSide(WEST) && left?.hasSide(EAST) != true) {
                        sides.add(SOUTH)
                    }
                    createBlock(x, y, sides)
                }
            }
            if (cell.hasSide(NORTH) || cell.hasSide(EAST)) {
                val topRight = cell.getCellOnPoint(NORTH_EAST)
                if (top?.hasSide(SOUTH, EAST) != true) {
                    val sides = mutableListOf(NORTH)
                    if (right?.hasSide(NORTH) != true && topRight?.hasSide(SOUTH) != true) {
                        sides.add(EAST)
                    }
                    if (!cell.hasSide(NORTH) && top?.hasSide(SOUTH) != true) {
                        sides.add(WEST)
                    }
                    if (!cell.hasSide(EAST) && right?.hasSide(WEST) != true) {
                        sides.add(SOUTH)
                    }
                    createBlock(x + width, y, sides)
                }
            }
            if (cell.hasSide(SOUTH) || cell.hasSide(WEST)) {
                val bottomLeft = cell.getCellOnPoint(SOUTH_WEST)
                if (
                    left?.hasSide(SOUTH, EAST) != true &&
                    bottomLeft?.hasSide(NORTH, EAST) != true
                ) {
                    val sides = mutableListOf(WEST)
                    if (!cell.hasSide(WEST) && left?.hasSide(EAST) != true) {
                        sides.add(NORTH)
                    }
                    if (!cell.hasSide(SOUTH) && bottom?.hasSide(NORTH) != true) {
                        sides.add(EAST)
                    }
                    if (bottom?.hasSide(WEST) != true) {
                        sides.add(SOUTH)
                    }
                    createBlock(x, y + height, sides)
                }
            }
            if (cell.hasSide(SOUTH) || cell.hasSide(EAST)) {
                val sides = mutableListOf<Cell.Side>()
                val bottomRight = cell.getCellOnPoint(SOUTH_EAST)
                if (!cell.hasSide(EAST) && right?.hasSide(WEST) != true) {
                    sides.add(NORTH)
                }
                if (right?.hasSide(SOUTH) != true && bottomRight?.hasSide(NORTH) != true) {
                    sides.add(EAST)
                }
                if (!cell.hasSide(SOUTH) && bottom?.hasSide(NORTH) != true) {
                    sides.add(WEST)
                }
                if (bottom?.hasSide(EAST) != true && bottomRight?.hasSide(WEST) != true) {
                    sides.add(SOUTH)
                }
                createBlock(x + width, y + height, sides)
            }
        }
    }

    abstract fun createBlock(cX: Float, cY: Float, sides: List<Cell.Side>)

    abstract fun createSurface(cX: Float, cY: Float, length: Float, side: Cell.Side)

    companion object {

        const val SCALE_X = 3
        const val SCALE_Y = 5
    }
}