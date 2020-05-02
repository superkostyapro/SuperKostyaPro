package phaser.cameras.scene2d

import CameraRotateCallback
import Phaser.Math.Vector2
import Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline
import Phaser.Types.Cameras.Scene2D.*
import integer
import org.w3c.dom.CanvasRenderingContext2D
import phaser.cameras.Camera

open external class Fade(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var isComplete: Boolean
    open var direction: Boolean
    open var duration: integer
    open var progress: Number
    open fun start(direction: Boolean = definedExternally, duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, force: Boolean = definedExternally, callback: CameraFadeCallback = definedExternally, context: Any = definedExternally): Camera
    open fun update(time: integer, delta: Number)
    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean
    open fun postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: Function<*>): Boolean
    open fun effectComplete()
    open fun reset()
    open fun destroy()
}

open external class Flash(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var duration: integer
    open var progress: Number
    open fun start(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, force: Boolean = definedExternally, callback: CameraFlashCallback = definedExternally, context: Any = definedExternally): Camera
    open fun update(time: integer, delta: Number)
    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean
    open fun postRenderWebGL(pipeline: TextureTintPipeline, getTintFunction: Function<*>): Boolean
    open fun effectComplete()
    open fun reset()
    open fun destroy()
}

open external class Pan(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var duration: integer
    open var source: Vector2
    open var current: Vector2
    open var destination: Vector2
    open var ease: Function<*>
    open var progress: Number
    open fun start(x: Number, y: Number, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera
    open fun start(x: Number, y: Number, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera
    open fun update(time: integer, delta: Number)
    open fun effectComplete()
    open fun reset()
    open fun destroy()
    open fun start(x: Number, y: Number): Camera
}

open external class RotateTo(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var duration: integer
    open var source: Number
    open var current: Number
    open var destination: Number
    open var ease: Function<*>
    open var progress: Number
    open var clockwise: Boolean
    open var shortestPath: Boolean
    open fun start(radians: Number, shortestPath: Boolean = definedExternally, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraRotateCallback = definedExternally, context: Any = definedExternally): Camera
    open fun start(radians: Number, shortestPath: Boolean = definedExternally, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraRotateCallback = definedExternally, context: Any = definedExternally): Camera
    open fun update(time: integer, delta: Number)
    open fun effectComplete()
    open fun reset()
    open fun destroy()
    open fun start(radians: Number): Camera
}

open external class Shake(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var duration: integer
    open var intensity: Vector2
    open var progress: Number
    open fun start(duration: integer = definedExternally, intensity: Number = definedExternally, force: Boolean = definedExternally, callback: CameraShakeCallback = definedExternally, context: Any = definedExternally): Camera
    open fun start(duration: integer = definedExternally, intensity: Vector2 = definedExternally, force: Boolean = definedExternally, callback: CameraShakeCallback = definedExternally, context: Any = definedExternally): Camera
    open fun preRender()
    open fun update(time: integer, delta: Number)
    open fun effectComplete()
    open fun reset()
    open fun destroy()
    open fun start(): Camera
}

open external class Zoom(camera: Camera) {
    open var camera: Camera
    open var isRunning: Boolean
    open var duration: integer
    open var source: Number
    open var destination: Number
    open var ease: Function<*>
    open var progress: Number
    open fun start(zoom: Number, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraZoomCallback = definedExternally, context: Any = definedExternally): Camera
    open fun start(zoom: Number, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraZoomCallback = definedExternally, context: Any = definedExternally): Camera
    open fun update(time: integer, delta: Number)
    open fun effectComplete()
    open fun reset()
    open fun destroy()
    open fun start(zoom: Number): Camera
}