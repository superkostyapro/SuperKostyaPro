@file:JsQualifier("Phaser.Types.Time")

package Phaser.Types.Time

external interface TimerEventConfig {
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var callback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var args: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}