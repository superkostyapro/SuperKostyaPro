package Phaser.Types.Create

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

typealias GenerateTextureCallback = (canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit

external interface GenerateTextureConfig {
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var canvas: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var palette: Palette?
        get() = definedExternally
        set(value) = definedExternally
    var pixelWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pixelHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resizeCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clearCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preRender: GenerateTextureCallback?
        get() = definedExternally
        set(value) = definedExternally
    var postRender: GenerateTextureCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Palette {
    operator fun get(key: String): String
    operator fun set(key: String, value: String)
    var A: String
    var B: String
    var C: String
    var D: String
    var E: String
    var F: String
}