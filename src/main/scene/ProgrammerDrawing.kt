@file:Suppress("UnsafeCastFromDynamic")

package main.scene

import Phaser.Physics.Arcade.Sprite
import Phaser.Scene
import Phaser.Types.Input.Keyboard.CursorKeys
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Scenes.SettingsConfig
import main.extension.jsObject

class ProgrammerDrawing : Scene(jsObject<SettingsConfig> {
    key = "World"
}) {

    private lateinit var cursors: CursorKeys

    private lateinit var mario: Sprite

    private var jumping = false

    private var airborne = false

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
        cursors = input.keyboard.createCursorKeys()
        add.image(0, 0, "bg").setOrigin(0, 0).setScale(2)
        val tiles = physics.add.staticGroup()
        (0..768 / 16).forEach {
            (tiles.create(it * 16 * 2, 416, "tiles", 0)).setOrigin(0, 0).setScale(2)
                .refreshBody()
            (tiles.create(it * 16 * 2, 448, "tiles", 0)).setOrigin(0, 0).setScale(2)
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
            )).setOrigin(0, 0).setScale(2).refreshBody()
        }
        val bricks = physics.add.staticGroup()
        arrayOf<Vector2Like>(
            jsObject { x = 20; y = 9 },
            jsObject { x = 22; y = 9 },
            jsObject { x = 24; y = 9 }
        ).forEach {
            (bricks.create(
                it.x!!.toInt() * 16 * 2,
                it.y!!.toInt() * 16 * 2,
                "brick",
                0
            )).setOrigin(0, 0).setScale(2).refreshBody()
        }
        mario = physics.add.sprite(32, 300, "mario", 0).setOrigin(0, 0).setScale(2)
        mario.setCollideWorldBounds(true)
        physics.add.collider(mario, tiles)
        physics.add.collider(mario, blocks)
        physics.add.collider(mario, bricks)
        cameras.main.setBounds(0, 0, 1500, 480)
        physics.world.setBounds(0, 0, 1500, 480)
        cameras.main.startFollow(mario, true, 0.5, 0.5, -100);
    }

    override fun update(time: Number, delta: Number) {
        super.update(time, delta)
        val pace = 200 * (if (cursors.shift?.isDown == true) 2 else 1)
        // Reset jumping flag when Mario touches the ground
        if (mario.body.touching.down) {
            jumping = false
            airborne = false
        } else {
            airborne = true
        }

        // Walking/running direction
        if (cursors.right?.isDown == true) {
            mario.setVelocityX(pace)
            mario.flipX = false
        } else if (cursors.left?.isDown == true) {
            mario.setVelocityX(-1 * pace)
            mario.flipX = true
        } else {
            mario.setVelocityX(0);
        }

        // Enable jumping, only if Mario is on the ground
        if (cursors.up?.isDown == true && !jumping) {
            mario.setVelocityY(-1 * 750);
            jumping = true
        }

        // Handle player animation
        if (jumping) {
            mario.anims.play("mario_jump", true);
        } else if (cursors.right?.isDown == true || cursors.left?.isDown == true) {
            if (airborne) mario.anims.stop();
            else mario.anims.play("mario_run", true);
        } else {
            mario.anims.play("mario_idle", true);
        }
    }
}