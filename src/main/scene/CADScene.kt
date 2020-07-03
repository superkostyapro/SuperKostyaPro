package main.scene

import main.Preferences
import main.UNIT
import main.actor.drawDimension
import main.extension.jsObject
import main.maze.Cell

class CADScene : GameScene(jsObject {
    key = "CAD"
}) {

    override fun preload() {
        load.audio("bg$tag", "sound/03 - Super Mario Bros 2 Main Theme.mp3")
    }

    override fun create() {
        super.create()
        generateMap(Preferences.worldLevel2)
    }

    override fun createBlock(cX: Float, cY: Float, sides: List<Cell.Side>) {
        add.graphics().apply {
            fillStyle(0xf5f5f5)
            lineStyle(2, 0x000000)
            physics.add.existing(this, true)
            body.setSize(UNIT, UNIT)
        }
    }

    override fun createSurface(cX: Float, cY: Float, length: Float, side: Cell.Side) {
        val text = add.text(0, 0, length.toString())
        graphics.lineStyle(2, 0x000000, 0.3f)
            .drawDimension(cX, cY, length, side, text)
    }
}