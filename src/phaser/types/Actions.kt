package Phaser.Types.Actions

import Phaser.GameObjects.GameObject
import integer

typealias CallCallback = (item: GameObject) -> Unit

external interface GridAlignConfig {
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var cellWidth: integer?
        get() = definedExternally
        set(value) = definedExternally
    var cellHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var position: integer?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}