package main.actor.block

import Phaser.GameObjects.Graphics
import Phaser.Geom.Rectangle

abstract class Block(x: Number, y: Number, width: Number, height: Number) :
    Rectangle(x, y, width, height) {

    open fun draw(graphics: Graphics): Any? = null
}