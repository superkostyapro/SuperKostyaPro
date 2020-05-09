package main.scene.menu

import Phaser.GameObjects.Text
import Phaser.Scene
import main.Preferences
import main.extension.jsObject

@Suppress("SpellCheckingInspection")
class TextMenu(scene: Scene, text: Any, action: (() -> Unit)?) :
    Text(scene, 0, 0, text.toString(), jsObject {
    fontFamily = "sans-serif"
    fontStyle = "bold"
    fontSize = "24px"
}) {

    init {
        val level = when (text) {
            1 -> Preferences.worldLevel1
            2 -> Preferences.worldLevel2
            3 -> Preferences.worldLevel3
            else -> null
        }
        if (level != null) {
            setText("WORLD $text-$level")
        }
        if (level == null || level > 0) {
            setColor("#ffffffdd")
            if (action != null) {
                setInteractive(jsObject {
                    useHandCursor = true
                })
                on("pointerdown", action)
            }
            on("pointerover", {
                setColor("#ffffff")
            })
            on("pointerout", {
                setColor("#ffffffdd")
            })
        } else {
            setColor("#ffffff61")
        }
    }
}