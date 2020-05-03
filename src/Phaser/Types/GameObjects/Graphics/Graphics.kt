package Phaser.Types.GameObjects.Graphics

import kotlin.js.*

external interface FillStyle {
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStyle {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RoundedRectRadius {
    var tl: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tr: Number?
        get() = definedExternally
        set(value) = definedExternally
    var br: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bl: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Styles {
    var lineStyle: LineStyle?
        get() = definedExternally
        set(value) = definedExternally
    var fillStyle: FillStyle?
        get() = definedExternally
        set(value) = definedExternally
}