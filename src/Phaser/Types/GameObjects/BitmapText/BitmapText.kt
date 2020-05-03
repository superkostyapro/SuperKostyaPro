package Phaser.Types.GameObjects.BitmapText

import Phaser.GameObjects.DynamicBitmapText

typealias DisplayCallback = (display: DisplayCallbackConfig) -> Unit

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
    // todo
    /*var offset.x: Number
    var offset.y: Number*/
    var width: Number
    var height: Number
    var chars: String
    var charsPerRow: Number
    // todo
    /*var spacing.x: Number
    var spacing.y: Number*/
    var lineSpacing: Number
}

external interface TintConfig {
    var topLeft: Number
    var topRight: Number
    var bottomLeft: Number
    var bottomRight: Number
}