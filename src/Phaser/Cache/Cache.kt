@file:JsQualifier("Phaser.Cache")

package Phaser.Cache

import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Structs.Map

open external class BaseCache {
    open var entries: Map<String, Any>
    open var events: EventEmitter
    open fun add(key: String, data: Any): BaseCache /* this */
    open fun has(key: String): Boolean
    open fun exists(key: String): Boolean
    open fun get(key: String): Any
    open fun remove(key: String): BaseCache /* this */
    open fun getKeys(): Array<String>
    open fun destroy()
}

external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): BaseCache?

    @nativeSetter
    operator fun set(key: String, value: BaseCache)
}

open external class CacheManager(game: Phaser.Game) {
    open var game: Game
    open var binary: BaseCache
    open var bitmapFont: BaseCache
    open var json: BaseCache
    open var physics: BaseCache
    open var shader: BaseCache
    open var audio: BaseCache
    open var video: BaseCache
    open var text: BaseCache
    open var html: BaseCache
    open var obj: BaseCache
    open var tilemap: BaseCache
    open var xml: BaseCache
    open var custom: `T$0`
    open fun addCustom(key: String): BaseCache
    open fun destroy()
}