package Phaser.Types.Curves

import Phaser.integer

external interface EllipseCurveConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: integer?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: integer?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONCurve {
    var type: String
    var points: Array<Number>
}

external interface JSONEllipseCurve {
    var type: String
    var x: Number
    var y: Number
    var xRadius: Number
    var yRadius: Number
    var startAngle: integer
    var endAngle: integer
    var clockwise: Boolean
    var rotation: integer
}

external interface JSONPath {
    var type: String
    var x: Number
    var y: Number
    var autoClose: Boolean
    var curves: Array<JSONCurve>
}