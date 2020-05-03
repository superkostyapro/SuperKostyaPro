package Phaser.Types.Math

import kotlin.js.*

external interface SinCosTable {
    var sin: Number
    var cos: Number
    var length: Number
}

external interface Vector2Like {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}