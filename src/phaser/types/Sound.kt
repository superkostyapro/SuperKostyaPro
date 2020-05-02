package Phaser.Types.Sound

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

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