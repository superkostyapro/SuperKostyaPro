package main.scene

import main.Preferences
import main.UNIT
import main.extension.jsObject

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

    override fun createBlock(cX: Float, cY: Float) {
        add.graphics().apply {
            fillStyle(0xf5f5f5)
            lineStyle(2, 0x000000)
            physics.add.existing(this, true)
            body.setSize(UNIT, UNIT)
        }
    }
}