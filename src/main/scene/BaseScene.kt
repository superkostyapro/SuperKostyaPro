package main.scene

import Phaser.Scene
import Phaser.Types.Scenes.SettingsConfig

abstract class BaseScene(config: SettingsConfig) : Scene(config) {

    open fun preload() {
    }

    open fun create() {
    }

    override fun update(time: Float, delta: Float) {
    }
}