@file:JsQualifier("Phaser.Types.Display")

package Phaser.Types.Display

external interface ColorObject {
    var r: Number
    var g: Number
    var b: Number
    var a: Number
}

external interface HSVColorObject {
    var h: Number
    var s: Number
    var v: Number
}

external interface InputColorObject {
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var g: Number?
        get() = definedExternally
        set(value) = definedExternally
    var b: Number?
        get() = definedExternally
        set(value) = definedExternally
    var a: Number?
        get() = definedExternally
        set(value) = definedExternally
}