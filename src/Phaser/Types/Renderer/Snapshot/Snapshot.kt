@file:JsQualifier("Phaser.Types.Renderer.Snapshot")

package Phaser.Types.Renderer.Snapshot

import Phaser.integer

external interface SnapshotState {
    var callback: SnapshotCallback
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var encoderOptions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x: integer?
        get() = definedExternally
        set(value) = definedExternally
    var y: integer?
        get() = definedExternally
        set(value) = definedExternally
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var getPixel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isFramebuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bufferWidth: integer?
        get() = definedExternally
        set(value) = definedExternally
    var bufferHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
}