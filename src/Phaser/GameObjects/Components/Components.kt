@file:JsQualifier("Phaser.GameObjects.Components")

package Phaser.GameObjects.Components

import Phaser.Animations.AnimationFrame
import Phaser.Animations.AnimationManager
import Phaser.BlendModes
import Phaser.Curves.Path
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.Geom.Point
import Phaser.Geom.Rectangle
import Phaser.Math.Vector2
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Textures.Frame
import Phaser.Types.GameObjects.PathFollower.PathConfig
import Phaser.Types.Tweens.NumberTweenBuilderConfig
import Phaser.integer
import org.khronos.webgl.Float32Array
import org.w3c.dom.CanvasRenderingContext2D

external interface Alpha {
    fun clearAlpha(): Alpha /* this */
    fun setAlpha(topLeft: Number = definedExternally, topRight: Number = definedExternally, bottomLeft: Number = definedExternally, bottomRight: Number = definedExternally): Alpha /* this */
    var alpha: Number
    var alphaTopLeft: Number
    var alphaTopRight: Number
    var alphaBottomLeft: Number
    var alphaBottomRight: Number
}

external interface AlphaSingle {
    fun clearAlpha(): AlphaSingle /* this */
    fun setAlpha(value: Number = definedExternally): AlphaSingle /* this */
    var alpha: Number
}

external interface Animation {
    var parent: GameObject
    var animationManager: AnimationManager
    var isPlaying: Boolean
    var currentAnim: Phaser.Animations.Animation
    var currentFrame: AnimationFrame
    var nextAnim: String
    var frameRate: Number
    var duration: Number
    var msPerFrame: Number
    var skipMissedFrames: Boolean
    var forward: Boolean
    var accumulator: Number
    var nextTick: Number
    var repeatCounter: Number
    var pendingRepeat: Boolean
    fun chain(key: String = definedExternally): GameObject
    fun chain(key: Phaser.Animations.Animation = definedExternally): GameObject
    fun setDelay(value: integer = definedExternally): GameObject
    fun getDelay(): integer
    fun delayedPlay(delay: integer, key: String, startFrame: integer = definedExternally): GameObject
    fun getCurrentKey(): String
    fun load(key: String, startFrame: integer = definedExternally): GameObject
    fun pause(atFrame: AnimationFrame = definedExternally): GameObject
    fun resume(fromFrame: AnimationFrame = definedExternally): GameObject
    var isPaused: Boolean
    fun play(key: String, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): GameObject
    fun play(key: Phaser.Animations.Animation, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): GameObject
    fun playReverse(key: String, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): GameObject
    fun playReverse(key: Phaser.Animations.Animation, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): GameObject
    fun _startAnimation(key: String, startFrame: integer = definedExternally): GameObject
    fun reverse(): GameObject
    fun getProgress(): Number
    fun setProgress(value: Number = definedExternally): GameObject
    fun remove(key: String = definedExternally, animation: Phaser.Animations.Animation = definedExternally)
    fun getRepeat(): integer
    fun setRepeat(value: integer): GameObject
    fun getRepeatDelay(): Number
    fun setRepeatDelay(value: Number): GameObject
    fun restart(includeDelay: Boolean = definedExternally): GameObject
    fun stop(): GameObject
    fun stopAfterDelay(delay: integer): GameObject
    fun stopOnRepeat(): GameObject
    fun stopOnFrame(frame: AnimationFrame): GameObject
    fun setTimeScale(value: Number = definedExternally): GameObject
    fun getTimeScale(): Number
    fun getTotalFrames(): integer
    fun update(time: Number, delta: Number)
    fun setCurrentFrame(animationFrame: AnimationFrame): GameObject
    fun nextFrame(): GameObject
    fun previousFrame(): GameObject
    fun setYoyo(value: Boolean = definedExternally): GameObject
    fun getYoyo(): Boolean
    fun destroy()
    fun chain(): GameObject
}

external interface BlendMode {
    var blendMode: dynamic /* Phaser.BlendModes | String */
        get() = definedExternally
        set(value) = definedExternally
    fun setBlendMode(value: String): BlendMode /* this */
    fun setBlendMode(value: BlendModes): BlendMode /* this */
}

external interface ComputedSize {
    var width: Number
    var height: Number
    var displayWidth: Number
    var displayHeight: Number
    fun setSize(width: Number, height: Number): ComputedSize /* this */
    fun setDisplaySize(width: Number, height: Number): ComputedSize /* this */
}

external interface Crop {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
        get() = definedExternally
        set(value) = definedExternally
    var frame: Frame
    var isCropped: Boolean
    fun setCrop(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): Crop /* this */
    fun setCrop(x: Rectangle = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): Crop /* this */
    fun setCrop(): Crop /* this */
}

external interface Depth {
    var depth: Number
    fun setDepth(value: integer): Depth /* this */
}

external interface Flip {
    var flipX: Boolean
    var flipY: Boolean
    fun toggleFlipX(): Flip /* this */
    fun toggleFlipY(): Flip /* this */
    fun setFlipX(value: Boolean): Flip /* this */
    fun setFlipY(value: Boolean): Flip /* this */
    fun setFlip(x: Boolean, y: Boolean): Flip /* this */
    fun resetFlip(): Flip /* this */
}

external interface GetBounds {
    fun <O : Vector2> getCenter(output: O = definedExternally): O
    fun <O : Vector2> getTopLeft(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getTopCenter(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getTopRight(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getLeftCenter(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getRightCenter(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getBottomLeft(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getBottomCenter(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Vector2> getBottomRight(output: O = definedExternally, includeParent: Boolean = definedExternally): O
    fun <O : Rectangle> getBounds(output: O = definedExternally): O
}

external interface Mask {
    var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
        get() = definedExternally
        set(value) = definedExternally
    fun setMask(mask: BitmapMask): Mask /* this */
    fun setMask(mask: GeometryMask): Mask /* this */
    fun clearMask(destroyMask: Boolean = definedExternally): Mask /* this */
    fun createBitmapMask(renderable: GameObject = definedExternally): BitmapMask
    fun createGeometryMask(graphics: Graphics = definedExternally): GeometryMask
}

external interface Origin {
    var originX: Number
    var originY: Number
    var displayOriginX: Number
    var displayOriginY: Number
    fun setOrigin(x: Number = definedExternally, y: Number = definedExternally): Origin /* this */
    fun setOriginFromFrame(): Origin /* this */
    fun setDisplayOrigin(x: Number = definedExternally, y: Number = definedExternally): Origin /* this */
    fun updateDisplayOrigin(): Origin /* this */
}

external interface PathFollower {
    var path: Path
    var rotateToPath: Boolean
    fun setPath(path: Path, config: Number = definedExternally): PathFollower /* this */
    fun setPath(path: Path, config: PathConfig = definedExternally): PathFollower /* this */
    fun setPath(path: Path, config: NumberTweenBuilderConfig = definedExternally): PathFollower /* this */
    fun setRotateToPath(value: Boolean, offset: Number = definedExternally): PathFollower /* this */
    fun isFollowing(): Boolean
    fun startFollow(config: Number = definedExternally, startAt: Number = definedExternally): PathFollower /* this */
    fun startFollow(config: PathConfig = definedExternally, startAt: Number = definedExternally): PathFollower /* this */
    fun startFollow(config: NumberTweenBuilderConfig = definedExternally, startAt: Number = definedExternally): PathFollower /* this */
    fun pauseFollow(): PathFollower /* this */
    fun resumeFollow(): PathFollower /* this */
    fun stopFollow(): PathFollower /* this */
    fun pathUpdate()
    fun setPath(path: Path): PathFollower /* this */
    fun startFollow(): PathFollower /* this */
}

external interface Pipeline {
    var defaultPipeline: WebGLPipeline
    var pipeline: WebGLPipeline
    fun initPipeline(pipelineName: String = definedExternally): Boolean
    fun setPipeline(pipelineName: String): Pipeline /* this */
    fun resetPipeline(): Boolean
    fun getPipelineName(): String
}

external interface ScrollFactor {
    var scrollFactorX: Number
    var scrollFactorY: Number
    fun setScrollFactor(x: Number, y: Number = definedExternally): ScrollFactor /* this */
}

external interface Size {
    var width: Number
    var height: Number
    var displayWidth: Number
    var displayHeight: Number
    fun setSizeToFrame(frame: Frame): Size /* this */
    fun setSize(width: Number, height: Number): Size /* this */
    fun setDisplaySize(width: Number, height: Number): Size /* this */
}

external interface Texture {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
        get() = definedExternally
        set(value) = definedExternally
    var frame: Frame
    fun setTexture(key: String, frame: String = definedExternally): Texture /* this */
    fun setTexture(key: String, frame: integer = definedExternally): Texture /* this */
    fun setTexture(key: Phaser.Textures.Texture, frame: String = definedExternally): Texture /* this */
    fun setTexture(key: Phaser.Textures.Texture, frame: integer = definedExternally): Texture /* this */
    fun setFrame(frame: String, updateSize: Boolean = definedExternally, updateOrigin: Boolean = definedExternally): Texture /* this */
    fun setFrame(frame: integer, updateSize: Boolean = definedExternally, updateOrigin: Boolean = definedExternally): Texture /* this */
    fun setTexture(key: String): Texture /* this */
    fun setTexture(key: Phaser.Textures.Texture): Texture /* this */
}

external interface TextureCrop {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
        get() = definedExternally
        set(value) = definedExternally
    var frame: Frame
    var isCropped: Boolean
    fun setCrop(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): TextureCrop /* this */
    fun setCrop(x: Rectangle = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): TextureCrop /* this */
    fun setTexture(key: String, frame: String = definedExternally): TextureCrop /* this */
    fun setTexture(key: String, frame: integer = definedExternally): TextureCrop /* this */
    fun setFrame(frame: String, updateSize: Boolean = definedExternally, updateOrigin: Boolean = definedExternally): TextureCrop /* this */
    fun setFrame(frame: integer, updateSize: Boolean = definedExternally, updateOrigin: Boolean = definedExternally): TextureCrop /* this */
    fun setCrop(): TextureCrop /* this */
    fun setTexture(key: String): TextureCrop /* this */
}

external interface Tint {
    var tintFill: Boolean
    fun clearTint(): Tint /* this */
    fun setTint(topLeft: integer = definedExternally, topRight: integer = definedExternally, bottomLeft: integer = definedExternally, bottomRight: integer = definedExternally): Tint /* this */
    fun setTintFill(topLeft: integer = definedExternally, topRight: integer = definedExternally, bottomLeft: integer = definedExternally, bottomRight: integer = definedExternally): Tint /* this */
    var tintTopLeft: integer
    var tintTopRight: integer
    var tintBottomLeft: integer
    var tintBottomRight: integer
    var tint: integer
    var isTinted: Boolean
}

external interface ToJSON

external interface Transform {
    var x: Number
    var y: Number
    var z: Number
    var w: Number
    var scale: Number
    var scaleX: Number
    var scaleY: Number
    var angle: integer
    var rotation: Number
    fun setPosition(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally): Transform /* this */
    fun setRandomPosition(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): Transform /* this */
    fun setRotation(radians: Number = definedExternally): Transform /* this */
    fun setAngle(degrees: Number = definedExternally): Transform /* this */
    fun setScale(x: Number, y: Number = definedExternally): Transform /* this */
    fun setX(value: Number = definedExternally): Transform /* this */
    fun setY(value: Number = definedExternally): Transform /* this */
    fun setZ(value: Number = definedExternally): Transform /* this */
    fun setW(value: Number = definedExternally): Transform /* this */
    fun getLocalTransformMatrix(tempMatrix: TransformMatrix = definedExternally): TransformMatrix
    fun getWorldTransformMatrix(tempMatrix: TransformMatrix = definedExternally, parentMatrix: TransformMatrix = definedExternally): TransformMatrix
    fun getParentRotation(): Number
}

open external class TransformMatrix(a: Number = definedExternally, b: Number = definedExternally, c: Number = definedExternally, d: Number = definedExternally, tx: Number = definedExternally, ty: Number = definedExternally) {
    open var matrix: Float32Array
    open var decomposedMatrix: Any?
    open var a: Number
    open var b: Number
    open var c: Number
    open var d: Number
    open var e: Number
    open var f: Number
    open var tx: Number
    open var ty: Number
    open var rotation: Number
    open var rotationNormalized: Number
    open var scaleX: Number
    open var scaleY: Number
    open fun loadIdentity(): TransformMatrix /* this */
    open fun translate(x: Number, y: Number): TransformMatrix /* this */
    open fun scale(x: Number, y: Number): TransformMatrix /* this */
    open fun rotate(angle: Number): TransformMatrix /* this */
    open fun multiply(rhs: TransformMatrix, out: TransformMatrix = definedExternally): dynamic /* TransformMatrix | Phaser.GameObjects.Components.TransformMatrix */
    open fun multiplyWithOffset(src: TransformMatrix, offsetX: Number, offsetY: Number): TransformMatrix /* this */
    open fun transform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix /* this */
    open fun transformPoint(x: Number, y: Number, point: Point): dynamic /* Phaser.Geom.Point | Phaser.Math.Vector2 | Any? */
    open fun transformPoint(x: Number, y: Number, point: Vector2): dynamic /* Phaser.Geom.Point | Phaser.Math.Vector2 | Any? */
    open fun transformPoint(x: Number, y: Number, point: Any?): dynamic /* Phaser.Geom.Point | Phaser.Math.Vector2 | Any? */
    open fun invert(): TransformMatrix /* this */
    open fun copyFrom(src: TransformMatrix): TransformMatrix /* this */
    open fun copyFromArray(src: Array<Any>): TransformMatrix /* this */
    open fun copyToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D
    open fun setToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D
    open fun copyToArray(out: Array<Any> = definedExternally): Array<Any>
    open fun setTransform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix /* this */
    open fun decomposeMatrix(): Any?
    open fun applyITRS(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number): TransformMatrix /* this */
    open fun applyInverse(x: Number, y: Number, output: Vector2 = definedExternally): Vector2
    open fun getX(x: Number, y: Number): Number
    open fun getY(x: Number, y: Number): Number
    open fun getCSSMatrix(): String
    open fun destroy()
}

external interface Visible {
    var visible: Boolean
    fun setVisible(value: Boolean): Visible /* this */
}