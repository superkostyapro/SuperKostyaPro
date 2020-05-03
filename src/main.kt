import Phaser.Game
import Phaser.Types.Core.GameConfig

fun main() {
    SuperKostyaPro(object : GameConfig {
        override var height = 800
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)