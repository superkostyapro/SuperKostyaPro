package main.scene.menu

import Phaser.GameObjects.Text
import Phaser.Scene
import main.Preferences
import main.extension.jsObject

@Suppress("SpellCheckingInspection")
class TextWorld(scene: Scene, index: Int, action: () -> Unit) : Text(scene, 0, 0, "", jsObject {
    fontFamily = "sans-serif"
    fontStyle = "bold"
    fontSize = "24px"
}) {

    init {
        val level = when (index) {
            1 -> Preferences.worldLevel1
            2 -> Preferences.worldLevel2
            else -> Preferences.worldLevel3
        }
        setText("WORLD $index-$level")
        if (level > 0) {
            setColor("#ddffffff")
            setInteractive(jsObject {
                useHandCursor = true
            })
            on("pointerover", {
                setColor("#ffffff")
            })
            on("pointerdown", action)
            on("pointerout", {
                setColor("#ffffffdd")
            })
        } else {
            setColor("#ffffff61")
        }
    }
}