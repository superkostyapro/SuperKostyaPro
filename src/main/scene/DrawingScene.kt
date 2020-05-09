package main.scene

import Phaser.GameObjects.Graphics
import Phaser.Types.Input.Keyboard.CursorKeys
import main.UNIT
import main.extension.jsObject

class DrawingScene : GameScene(jsObject {
    key = "Draw"
}) {

    private lateinit var cursors: CursorKeys

    override fun preload() {
        load.audio("bg$tag", "sound/01 - Super Mario Bros.mp3")
    }

    override fun create() {
        super.create()
        cameras.main.setBackgroundColor(0xfafafa)
        cursors = input.keyboard.createCursorKeys()
        generateMap(30, 10)
    }

    override fun createBlock(): Graphics {
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