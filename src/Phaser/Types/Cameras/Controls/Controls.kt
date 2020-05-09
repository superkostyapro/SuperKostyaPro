@file:JsQualifier("Phaser.Types.Cameras.Controls")

package Phaser.Types.Cameras.Controls

import Phaser.Cameras.Scene2D.Camera
import Phaser.Input.Keyboard.Key

external interface FixedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var speed: dynamic /* Number | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SmoothedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var acceleration: dynamic /* Number | Any */
        get() = definedExternally
        set(value) = definedExternally
    var drag: dynamic /* Number | Any */
        get() = definedExternally
        set(value) = definedExternally
    var maxSpeed: dynamic /* Number | Any */
        get() = definedExternally
        set(value) = definedExternally
}