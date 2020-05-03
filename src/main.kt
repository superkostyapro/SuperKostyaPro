import Phaser.Game
import Phaser.Types.Core.GameConfig
import Phaser.Types.Core.PhysicsConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Physics.Arcade.ArcadeWorldConfig

fun main() {
    SuperKostyaPro(object : GameConfig {
        override var title: String? = "Super Mario Bros."
        override var width = 480
        override var height = 480
        override var parent = "game"
        override var backgroundColor = "#18216D"
        override var physics: PhysicsConfig? = object : PhysicsConfig {
            override var default: String? = "arcade"
            override var arcade: ArcadeWorldConfig? = object : ArcadeWorldConfig {
                override var gravity: Vector2Like? = object : Vector2Like {
                    override var y: Number? = 2000
                }
            }
        }
    })
}

class SuperKostyaPro(config: GameConfig) : Game(config)