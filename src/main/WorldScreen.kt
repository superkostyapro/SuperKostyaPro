@file:Suppress("UnsafeCastFromDynamic")

package main

import Phaser.Physics.Arcade.Sprite
import Phaser.Scene
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Scenes.SettingsConfig
import main.extension.jsObject

class WorldScreen : Scene(jsObject<SettingsConfig> {
    key = "World"
}) {

    fun preload() {
        load.spritesheet("bg", "backgrounds/Overworld.png", jsObject {
            frameWidth = 768
            frameHeight = 240
        })
        load.spritesheet("tiles", "tiles/tiles.png", jsObject {
            frameWidth = 16
            frameHeight = 16
        })
        load.spritesheet("mario", "players/mario_small.png", jsObject {
            frameWidth = 16
            frameHeight = 16
        })
        load.spritesheet("item_overworld", "blocks/item_overworld.png", jsObject {
            frameWidth = 16
            frameHeight = 16
        })
        load.spritesheet("brick", "blocks/bricks_ow.png", jsObject {
            frameWidth = 16
            frameHeight = 16
        })
    }

    fun create() {
        input.keyboard.createCursorKeys()
        add.image(0, 0, "bg").setOrigin(0, 0).setScale(2)
        val tiles = physics.add.staticGroup()
        (0..768 / 16).forEach {
            (tiles.create(it * 16 * 2, 416, "tiles", 0) as Sprite).setOrigin(0, 0).setScale(2)
                .refreshBody()
            (tiles.create(it * 16 * 2, 448, "tiles", 0) as Sprite).setOrigin(0, 0).setScale(2)
                .refreshBody()
        }
        val blocks = physics.add.staticGroup()
        arrayOf<Vector2Like>(
            jsObject { x = 16; y = 9 },
            jsObject { x = 21; y = 9 },
            jsObject { x = 22; y = 5 },
            jsObject { x = 23; y = 9 }
        ).forEach {
            (blocks.create(
                it.x!!.toInt() * 16 * 2,
                it.y!!.toInt() * 16 * 2,
                "item_overworld",
                0
            ) as Sprite).setOrigin(0, 0).setScale(2).refreshBody()
        }
    }
}