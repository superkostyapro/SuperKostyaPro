package Phaser.Cameras.Scene2D.Effects

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
import Phaser.Cameras.Scene2D.Camera
import integer
import Phaser.Types.Cameras.Scene2D.CameraFadeCallback
import Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline
import Phaser.Types.Cameras.Scene2D.CameraFlashCallback
import Phaser.Math.Vector2
import Phaser.Types.Cameras.Scene2D.CameraPanCallback
import CameraRotateCallback
import Phaser.Types.Cameras.Scene2D.CameraShakeCallback
import Phaser.Types.Cameras.Scene2D.CameraZoomCallback

external open class Fade(camera: Phaser.Cameras.Scene2D.Camera) {
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

external open class Flash(camera: Phaser.Cameras.Scene2D.Camera) {
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

external open class Pan(camera: Phaser.Cameras.Scene2D.Camera) {
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

external open class RotateTo(camera: Phaser.Cameras.Scene2D.Camera) {
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

external open class Shake(camera: Phaser.Cameras.Scene2D.Camera) {
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

external open class Zoom(camera: Phaser.Cameras.Scene2D.Camera) {
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