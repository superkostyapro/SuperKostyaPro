package main.extension

import Phaser.Geom.Rectangle
import main.UNIT_H
import main.UNIT_W

inline fun <T> jsObject(init: T.() -> Unit): T {
    val obj = js("{}") as T
    init(obj)
    return obj
}

@Suppress("UnsafeCastFromDynamic")
fun createRect(x: Number, y: Number, width: Number = UNIT_W, height: Number = UNIT_H): Rectangle {
    val rect = js("new Phaser.Geom.Rectangle()")
    rect.x = x
    rect.y = y
    rect.width = width
    rect.height = height
    return rect
}