@file:JsQualifier("Phaser.Events")

package Phaser.Events

open external class EventEmitter {
    open fun shutdown()
    open fun destroy()
    open fun eventNames(): Array<dynamic /* String | Any */>
    open fun listeners(event: String): Array<Function<*>>
    open fun listeners(event: Any): Array<Function<*>>
    open fun listenerCount(event: String): Number
    open fun listenerCount(event: Any): Number
    open fun emit(event: String, vararg args: Any): Boolean
    open fun emit(event: Any, vararg args: Any): Boolean
    open fun on(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun on(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun addListener(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun addListener(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun once(event: Any, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */
    open fun removeListener(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeListener(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun off(event: String, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun off(event: Any, fn: Function<*> = definedExternally, context: Any = definedExternally, once: Boolean = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(event: String = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(event: Any = definedExternally): EventEmitter /* this */
    open fun removeAllListeners(): EventEmitter /* this */
}