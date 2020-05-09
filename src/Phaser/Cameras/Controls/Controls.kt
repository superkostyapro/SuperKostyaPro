@file:JsQualifier("Phaser.Cameras.Controls")

package Phaser.Cameras.Controls

import Phaser.Cameras.Scene2D.Camera
import Phaser.Input.Keyboard.Key

open external class FixedKeyControl(config: Phaser.Types.Cameras.Controls.FixedKeyControlConfig) {
    open var camera: Camera
    open var left: Key
    open var right: Key
    open var up: Key
    open var down: Key
    open var zoomIn: Key
    open var zoomOut: Key
    open var zoomSpeed: Number
    open var speedX: Number
    open var speedY: Number
    open var active: Boolean
    open fun start(): FixedKeyControl /* this */
    open fun stop(): FixedKeyControl /* this */
    open fun setCamera(camera: Camera): FixedKeyControl /* this */
    open fun update(delta: Number)
    open fun destroy()
}

open external class SmoothedKeyControl(config: Phaser.Types.Cameras.Controls.SmoothedKeyControlConfig) {
    open var camera: Camera
    open var left: Key
    open var right: Key
    open var up: Key
    open var down: Key
    open var zoomIn: Key
    open var zoomOut: Key
    open var zoomSpeed: Number
    open var accelX: Number
    open var accelY: Number
    open var dragX: Number
    open var dragY: Number
    open var maxSpeedX: Number
    open var maxSpeedY: Number
    open var active: Boolean
    open fun start(): SmoothedKeyControl /* this */
    open fun stop(): SmoothedKeyControl /* this */
    open fun setCamera(camera: Camera): SmoothedKeyControl /* this */
    open fun update(delta: Number)
    open fun destroy()
}