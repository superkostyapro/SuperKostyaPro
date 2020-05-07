package main

import FontFace
import Phaser.AUTO
import Phaser.Game
import Phaser.Scale.ScaleModeType
import Phaser.Types.Core.GameConfig
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Core.ScaleConfig
import main.extension.jsObject
import main.scene.CADScene
import main.scene.DrawingScene
import main.scene.FarKingdom
import main.scene.menu.MenuScene
import kotlin.browser.document

fun main() {
    console.log(
        """
____▒▒▒▒▒
—-▒▒▒▒▒▒▒▒▒
—–▓▓▓░░▓░
—▓░▓░░░▓░░░
—▓░▓▓░░░▓░░░
—▓▓░░░░▓▓▓▓
——░░░░░░░░
—-▓▓▒▓▓▓▒▓▓
–▓▓▓▒▓▓▓▒▓▓▓
▓▓▓▓▒▒▒▒▒▓▓▓▓
░░▓▒░▒▒▒░▒▓░░
░░░▒▒▒▒▒▒▒░░░
░░▒▒▒▒▒▒▒▒▒░░
—-▒▒▒ ——▒▒▒
–▓▓▓———-▓▓▓
▓▓▓▓———-▓▓▓▓
    """.trimIndent()
    )
    FontFace("NSMBWii", "url(NSMBWii.ttf)").load().then {
        document.asDynamic().fonts.add(it)
        startGame()
    }.catch {
        console.error(it)
        startGame()
    }
}

private fun startGame() {
    SuperKostyaPro(jsObject {
        type = AUTO
        title = "Super Kostya Pro"
        version = "1.0"
        backgroundColor = "#5c93fa"
        scale = jsObject<ScaleConfig> {
            mode = ScaleModeType.RESIZE
            parent = "game" // id of div
            width = "100%"
            height = "100%"
        }
        physics = jsObject<PhysicsConfig> {
            default = "arcade"
        }
        scene = arrayOf(
            MenuScene::class.js,
            DrawingScene::class.js,
            CADScene::class.js,
            FarKingdom::class.js
        )
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)