@file:JsQualifier("Phaser.Types.GameObjects")

package Phaser.Types.GameObjects

import Phaser.integer

external interface GameObjectConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Number | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scrollFactor: dynamic /* Number | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var origin: dynamic /* Number | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var add: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONGameObject {
    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any?
        get() = definedExternally
        set(value) = definedExternally
    // todo
    /*var scale.x: Number
    var scale.y: Number*/
    var origin: Any?
        get() = definedExternally
        set(value) = definedExternally
    // todo
    /*var origin.x: Number
    var origin.y: Number*/
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: integer
    var blendMode: dynamic /* integer | String */
        get() = definedExternally
        set(value) = definedExternally
    var textureKey: String
    var frameKey: String
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}