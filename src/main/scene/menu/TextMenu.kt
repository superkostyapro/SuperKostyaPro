package main.scene.menu

import Phaser.GameObjects.Text
import Phaser.Scene
import main.extension.jsObject

open class TextMenu(scene: Scene, text: Any, action: () -> Unit) :
    Text(scene, 0, 0, text, jsObject {
        fontFamily = "sans-serif"
        fontStyle = "bold"
        fontSize = "24px"
        color = "#ffffff99"
    }) {

    init {
        setInteractive(jsObject {
            useHandCursor = true
        })
        on("pointerover", {
            setColor("#ffffffdd")
        })
        on("pointerout", {
            setColor("#ffffff99")
        })
        on("pointerdown", {
            setColor("#ffffff")
            action()
        })
        on("pointerup", {
            setColor("#ffffffdd")
        })
    }
}