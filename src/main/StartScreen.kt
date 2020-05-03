@file:Suppress("UnsafeCastFromDynamic")

package main

import Phaser.Scene
import Phaser.Types.Scenes.SettingsConfig
import main.extension.jsObject

class StartScreen : Scene(jsObject<SettingsConfig> {
    key = "Start"
}) {

    fun create() {
        add.text(50, 50, "Start", jsObject<dynamic> {
            fill = "#dfdfdf"
            fontSize = "40px"
        })
        input.on("pointerdown", {
            scene.stop("Start")
            scene.start("World")
        })
    }
}