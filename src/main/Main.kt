package main

import Phaser.Game
import Phaser.Types.Core.GameConfig
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import main.extension.jsObject
import main.scene.EngineerDrawing
import main.scene.FarFarKingdom
import main.scene.MenuScene
import main.scene.ProgrammerDrawing

fun main() {
    SuperKostyaPro(jsObject {
        title = "Super Kostya Pro"
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
        scene = arrayOf(
            MenuScene::class.js,
            EngineerDrawing::class.js,
            ProgrammerDrawing::class.js,
            FarFarKingdom::class.js
        )
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)