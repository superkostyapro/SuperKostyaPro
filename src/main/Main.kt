package main

import FontFace
import Phaser.AUTO
import Phaser.Game
import Phaser.Types.Core.GameConfig
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Core.ScaleConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import main.extension.jsObject
import main.scene.EngineerDrawing
import main.scene.FarFarKingdom
import main.scene.MenuScene
import main.scene.ProgrammerDrawing
import kotlin.browser.document

fun main() {
    FontFace("NSMBWii", "url(NSMBWii.ttf)").load().then {
        document.asDynamic().fonts.add(it)
        SuperKostyaPro(jsObject {
            type = AUTO
            title = "Super Kostya Pro"
            backgroundColor = "#5c93fa"
            scale = jsObject<ScaleConfig> {
                mode = 5 // RESIZE
                parent = "game" // id of div
                width = "100%"
                height = "100%"
            }
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
}

class SuperKostyaPro(config: GameConfig) : Game(config)