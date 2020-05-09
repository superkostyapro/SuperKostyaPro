@file:JsQualifier("Phaser.Types.Animations")

package Phaser.Types.Animations

import Phaser.integer

external interface Animation {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frames: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var defaultTextureKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameRate: integer?
        get() = definedExternally
        set(value) = definedExternally
    var duration: integer?
        get() = definedExternally
        set(value) = definedExternally
    var skipMissedFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: integer?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showOnStart: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnComplete: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationFrame {
    var key: String
    var frame: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNames {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var start: integer?
        get() = definedExternally
        set(value) = definedExternally
    var end: integer?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var zeroPad: integer?
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean | Array<integer> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNumbers {
    var start: integer?
        get() = definedExternally
        set(value) = definedExternally
    var end: integer?
        get() = definedExternally
        set(value) = definedExternally
    var first: dynamic /* Boolean | integer */
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean | Array<integer> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONAnimation {
    var key: String
    var type: String
    var frames: Array<JSONAnimationFrame>
    var frameRate: integer
    var duration: integer
    var skipMissedFrames: Boolean
    var delay: integer
    var repeat: integer
    var repeatDelay: integer
    var yoyo: Boolean
    var showOnStart: Boolean
    var hideOnComplete: Boolean
}

external interface JSONAnimationFrame {
    var key: String
    var frame: dynamic /* String | integer */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number
}

external interface JSONAnimations {
    var anims: Array<JSONAnimation>
    var globalTimeScale: Number
}