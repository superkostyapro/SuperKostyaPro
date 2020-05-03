package main

import Phaser.Scene
import Phaser.Types.Scenes.SettingsConfig

class StartScreen : Scene(object : SettingsConfig {
    override var key: String? = "Start"
}) {

    fun create() {
        add.text(50, 50, "Start")
        input.on("pointerdown", {
            scene.stop("Start")
            scene.start("World")
        })
    }
}