@file:JsQualifier("Phaser.Time")

package Phaser.Time

import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Time.TimerEventConfig

open external class Clock(scene: Phaser.Scene) {
    open var scene: Scene
    open var systems: Systems
    open var now: Number
    open var timeScale: Number
    open var paused: Boolean
    open fun addEvent(config: TimerEventConfig): TimerEvent
    open fun delayedCall(delay: Number, callback: Function<*>, args: Array<Any> = definedExternally, callbackScope: Any = definedExternally): TimerEvent
    open fun clearPendingEvents(): Clock
    open fun removeAllEvents(): Clock
    open fun preUpdate(time: Number, delta: Number)
    open fun update(time: Number, delta: Number)
}

open external class TimerEvent(config: Phaser.Types.Time.TimerEventConfig) {
    open var delay: Number
    open var repeat: Number
    open var repeatCount: Number
    open var loop: Boolean
    open var callback: Function<*>
    open var callbackScope: Any?
    open var args: Array<Any>
    open var timeScale: Number
    open var startAt: Number
    open var elapsed: Number
    open var paused: Boolean
    open var hasDispatched: Boolean
    open fun reset(config: TimerEventConfig): TimerEvent
    open fun getProgress(): Number
    open fun getOverallProgress(): Number
    open fun getRepeatCount(): Number
    open fun getElapsed(): Number
    open fun getElapsedSeconds(): Number
    open fun remove(dispatchCallback: Boolean = definedExternally)
    open fun destroy()
}