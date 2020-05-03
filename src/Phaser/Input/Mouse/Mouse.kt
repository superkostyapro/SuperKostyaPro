package Phaser.Input.Mouse

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
import Phaser.Input.InputManager

open external class MouseManager(inputManager: Phaser.Input.InputManager) {
    open var manager: InputManager
    open var capture: Boolean
    open var enabled: Boolean
    open var target: Any
    open var locked: Boolean
    open var onMouseMove: Function<*>
    open var onMouseDown: Function<*>
    open var onMouseUp: Function<*>
    open var onMouseDownWindow: Function<*>
    open var onMouseUpWindow: Function<*>
    open var onMouseOver: Function<*>
    open var onMouseOut: Function<*>
    open var onMouseWheel: Function<*>
    open var pointerLockChange: Function<*>
    open fun disableContextMenu(): MouseManager /* this */
    open fun requestPointerLock()
    open fun releasePointerLock()
    open fun startListeners()
    open fun stopListeners()
    open fun destroy()
}