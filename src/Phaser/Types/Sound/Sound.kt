@file:JsQualifier("Phaser.Types.Sound")

package Phaser.Types.Sound

external interface AudioSpriteSound {
    var spritemap: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DecodeAudioConfig {
    var key: String
    var data: dynamic /* ArrayBuffer | String */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SoundConfig {
    var mute: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var detune: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seek: Number?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SoundMarker {
    var name: String
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var config: SoundConfig?
        get() = definedExternally
        set(value) = definedExternally
}