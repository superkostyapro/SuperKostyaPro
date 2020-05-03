package Phaser.Renderer.Canvas

import Phaser.Cameras.Scene2D.Camera
import Phaser.Game
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.GameObjects.DisplayList
import Phaser.GameObjects.GameObject
import Phaser.Scene
import Phaser.Structs.Size
import Phaser.Textures.Frame
import Phaser.Types.Renderer.Snapshot.SnapshotCallback
import Phaser.Types.Renderer.Snapshot.SnapshotState
import Phaser.integer
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

open external class CanvasRenderer(game: Phaser.Game) {
    open var game: Game
    open var type: integer
    open var drawCount: Number
    open var width: integer
    open var height: integer
    open var config: Any?
    open var gameCanvas: HTMLCanvasElement
    open var gameContext: CanvasRenderingContext2D
    open var currentContext: CanvasRenderingContext2D
    open var antialias: Boolean
    open var blendModes: Array<Any>
    open var snapshotState: SnapshotState
    open fun init()
    open fun onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Number = definedExternally)
    open fun resize(width: Number = definedExternally, height: Number = definedExternally)
    open fun resetTransform()
    open fun setBlendMode(blendMode: String): CanvasRenderer /* this */
    open fun setContext(ctx: CanvasRenderingContext2D = definedExternally): CanvasRenderer /* this */
    open fun setAlpha(alpha: Number): CanvasRenderer /* this */
    open fun preRender()
    open fun render(scene: Scene, children: DisplayList, interpolationPercentage: Number, camera: Camera)
    open fun postRender()
    open fun snapshotCanvas(canvas: HTMLCanvasElement, callback: SnapshotCallback, getPixel: Boolean = definedExternally, x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshot(callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): CanvasRenderer /* this */
    open fun snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): CanvasRenderer /* this */
    open fun batchSprite(sprite: GameObject, frame: Frame, camera: Camera, parentTransformMatrix: TransformMatrix = definedExternally)
    open fun destroy()
}

external fun GetBlendModes(): Array<Any>

external fun SetTransform(renderer: CanvasRenderer, ctx: CanvasRenderingContext2D, src: GameObject, camera: Camera, parentMatrix: TransformMatrix = definedExternally): Boolean