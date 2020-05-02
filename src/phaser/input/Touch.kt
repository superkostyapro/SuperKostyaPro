package phaser.input

import Phaser.Input.InputManager

open external class TouchManager(inputManager: Phaser.Input.InputManager) {
    open var manager: InputManager
    open var capture: Boolean
    open var enabled: Boolean
    open var target: Any
    open var onTouchStart: Function<*>
    open var onTouchStartWindow: Function<*>
    open var onTouchMove: Function<*>
    open var onTouchEnd: Function<*>
    open var onTouchEndWindow: Function<*>
    open var onTouchCancel: Function<*>
    open var onTouchCancelWindow: Function<*>
    open var onTouchOver: Function<*>
    open var onTouchOut: Function<*>
    open fun disableContextMenu(): TouchManager /* this */
    open fun startListeners()
    open fun stopListeners()
    open fun destroy()
}