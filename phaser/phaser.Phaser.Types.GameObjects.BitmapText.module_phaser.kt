@file:JsQualifier("Phaser.Types.GameObjects.BitmapText")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package Phaser.Types.GameObjects.BitmapText

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
import Phaser.GameObjects.DynamicBitmapText

external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external interface BitmapFontCharacterData {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var centerX: Number
    var centerY: Number
    var xOffset: Number
    var yOffset: Number
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    var kerning: `T$1`
}

external interface `T$2` {
    @nativeGetter
    operator fun get(key: Number): BitmapFontCharacterData?
    @nativeSetter
    operator fun set(key: Number, value: BitmapFontCharacterData)
}

external interface BitmapFontData {
    var font: String
    var size: Number
    var lineHeight: Number
    var retroFont: Boolean
    var chars: `T$2`
}

external interface BitmapTextSize {
    var global: GlobalBitmapTextSize
    var local: LocalBitmapTextSize
}

external interface DisplayCallbackConfig {
    var parent: DynamicBitmapText
    var tint: TintConfig
    var index: Number
    var charCode: Number
    var x: Number
    var y: Number
    var scale: Number
    var rotation: Number
    var data: Any
}

external interface GlobalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface LocalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface RetroFontConfig {
    var image: String
    var offset.x: Number
    var offset.y: Number
    var width: Number
    var height: Number
    var chars: String
    var charsPerRow: Number
    var spacing.x: Number
    var spacing.y: Number
    var lineSpacing: Number
}

external interface TintConfig {
    var topLeft: Number
    var topRight: Number
    var bottomLeft: Number
    var bottomRight: Number
}