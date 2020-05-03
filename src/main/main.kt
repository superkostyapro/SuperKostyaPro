package main

import Phaser.Game
import Phaser.Types.Core.GameConfig
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import main.extension.jsObject

fun main() {
    SuperKostyaPro(jsObject {
        title = "Super Mario Bros."
        width = 480
        height = 480
        parent = "game"
        backgroundColor = "#18216D"
        physics = jsObject<PhysicsConfig> {
            default = "arcade"
            arcade = jsObject<ArcadeWorldConfig> {
                gravity = jsObject<Vector2Like> {
                    y = 2000
                }
            }
        }
        scene = arrayOf(StartScreen::class.js)
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)