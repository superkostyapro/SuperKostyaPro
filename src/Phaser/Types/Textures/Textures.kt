package Phaser.Types.Textures

import Phaser.integer
import kotlin.js.*

external interface PixelConfig {
    var x: integer
    var y: integer
    var color: integer
    var alpha: Number
}

external interface SpriteSheetConfig {
    var frameWidth: integer
    var frameHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var margin: integer?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpriteSheetFromAtlasConfig {
    var atlas: String
    var frame: String
    var frameWidth: integer
    var frameHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: integer?
        get() = definedExternally
        set(value) = definedExternally
    var margin: integer?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: integer?
        get() = definedExternally
        set(value) = definedExternally
}