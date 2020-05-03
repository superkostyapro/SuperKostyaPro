package main

import Phaser.Game
import Phaser.Types.Core.GameConfig
import main.extension.jsObject

fun main() {
    SuperKostyaPro(jsObject {
        title = "Super Mario Bros."
        width = 480
        height = 480
        parent = "game"
        backgroundColor = "#18216D"
        physics = jsObject {

        }
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)