package Phaser.Input.Mouse

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