package main.scene.menu

import Phaser.GameObjects.Text
import Phaser.Scene
import main.Preferences
import main.extension.jsObject

class TextMenu(scene: Scene, text: String, action: () -> Unit) : Text(scene, 0, 0, text, jsObject {
    fontFamily = "sans-serif"
    fontStyle = "bold"
    fontSize = "24px"
}) {

    init {
        val level = when {
            text.endsWith("1") -> Preferences.worldLevel1
            text.endsWith("2") -> Preferences.worldLevel2
            text.endsWith("3") -> Preferences.worldLevel3
            else -> null
        }
        if (level != null) {
            setText("$text-$level")
        }
        if (level == null || level > 0) {
            setColor("#ffffffdd")
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