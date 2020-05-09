package main.actor.block

import Phaser.GameObjects.Graphics
import Phaser.Geom.Rectangle

abstract class Block(cX: Float, cY: Float, width: Float, height: Float) :
    Rectangle(cX - width / 2, cY - height / 2, width, height) {

    open fun draw(graphics: Graphics): Any? = null
}