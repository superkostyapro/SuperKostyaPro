package Phaser.Input.Gamepad

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import Phaser.Events.EventEmitter
import integer
import Phaser.Math.Vector2
import Phaser.Scene
import Phaser.Types.Scenes.SettingsObject
import Phaser.Input.InputPlugin

open external class Axis(pad: Phaser.Input.Gamepad.Gamepad, index: integer) {
    open var pad: Gamepad
    open var events: EventEmitter
    open var index: integer
    open var value: Number
    open var threshold: Number
    open fun getValue(): Number
    open fun destroy()
}

open external class Button(pad: Phaser.Input.Gamepad.Gamepad, index: integer) {
    open var pad: Gamepad
    open var events: EventEmitter
    open var index: integer
    open var value: Number
    open var threshold: Number
    open var pressed: Boolean
    open fun destroy()
}

open external class Gamepad(manager: Phaser.Input.Gamepad.GamepadPlugin, pad: Phaser.Types.Input.Gamepad.Pad) : EventEmitter {
    open var manager: GamepadPlugin
    open var pad: Any
    open var id: String
    open var index: Number
    open var buttons: Array<Button>
    open var axes: Array<Axis>
    open var vibration: Any
    open var leftStick: Vector2
    open var rightStick: Vector2
    open fun getAxisTotal(): integer
    open fun getAxisValue(index: integer): Number
    open fun setAxisThreshold(value: Number)
    open fun getButtonTotal(): integer
    open fun getButtonValue(index: integer): Number
    open fun isButtonDown(index: integer): Boolean
    override fun destroy()
    open var connected: Boolean
    open var timestamp: Number
    open var left: Boolean
    open var right: Boolean
    open var up: Boolean
    open var down: Boolean
    open var A: Boolean
    open var Y: Boolean
    open var X: Boolean
    open var B: Boolean
    open var L1: Number
    open var L2: Number
    open var R1: Number
    open var R2: Number
}

open external class GamepadPlugin(sceneInputPlugin: Phaser.Input.InputPlugin) : EventEmitter {
    open var scene: Scene
    open var settings: SettingsObject
    open var sceneInputPlugin: InputPlugin
    open var enabled: Boolean
    open var target: Any
    open var gamepads: Array<Gamepad>
    open fun isActive(): Boolean
    open fun disconnectAll()
    open fun getAll(): Array<Gamepad>
    open fun getPad(index: Number): Gamepad
    open var total: integer
    open var pad1: Gamepad
    open var pad2: Gamepad
    open var pad3: Gamepad
    open var pad4: Gamepad
}