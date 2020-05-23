package main.scene

import Phaser.Types.Input.Keyboard.CursorKeys
import main.Preferences
import main.UNIT
import main.actor.drawCut
import main.extension.jsObject
import main.maze.Cell

class FarKingdom : GameScene(jsObject {
    key = "King"
}) {

    private lateinit var cursors: CursorKeys

    override fun preload() {
        load.audio("bg$tag", "sound/01 - Grass Land.mp3")
    }

    override fun create() {
        super.create()
        cameras.main.setBackgroundColor(0xfafafa)
        cursors = input.keyboard.createCursorKeys()
        generateMap(Preferences.worldLevel3)
    }

    override fun createBlock(cX: Float, cY: Float, vararg sides: Cell.Side?) {
        add.graphics().apply {
            fillStyle(0xf5f5f5)
            lineStyle(2, 0x000000)
            physics.add.existing(this, true)
            body.setSize(UNIT, UNIT)
            drawCut(cX, cY, sides)
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