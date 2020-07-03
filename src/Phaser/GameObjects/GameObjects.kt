@file:JsQualifier("Phaser.GameObjects")

package Phaser.GameObjects

import Phaser.*
import Phaser.Cache.BaseCache
import Phaser.Cameras.Scene2D.BaseCamera
import Phaser.Cameras.Scene2D.Camera
import Phaser.Curves.Path
import Phaser.Data.DataManager
import Phaser.Display.BaseShader
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.Particles.ParticleEmitterManager
import Phaser.Geom.Circle
import Phaser.Geom.Point
import Phaser.Input.Pointer
import Phaser.Math.Vector2
import Phaser.Math.Vector4
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scenes.Systems
import Phaser.Structs.List
import Phaser.Structs.ProcessQueue
import Phaser.Structs.Set
import Phaser.Textures.*
import Phaser.Textures.Texture
import Phaser.Tilemaps.Tilemap
import Phaser.Tweens.Tween
import Phaser.Types.GameObjects.BitmapText.BitmapFontData
import Phaser.Types.GameObjects.BitmapText.BitmapTextSize
import Phaser.Types.GameObjects.BitmapText.DisplayCallback
import Phaser.Types.GameObjects.BitmapText.DisplayCallbackConfig
import Phaser.Types.GameObjects.GameObjectConfig
import Phaser.Types.GameObjects.Graphics.RoundedRectRadius
import Phaser.Types.GameObjects.Graphics.Styles
import Phaser.Types.GameObjects.Group.GroupCallback
import Phaser.Types.GameObjects.Group.GroupConfig
import Phaser.Types.GameObjects.Group.GroupCreateConfig
import Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import Phaser.Types.GameObjects.JSONGameObject
import Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import Phaser.Types.GameObjects.PathFollower.PathConfig
import Phaser.Types.GameObjects.RenderTexture.RenderTextureConfig
import Phaser.Types.GameObjects.Text.TextMetrics
import Phaser.Types.GameObjects.Text.TextPadding
import Phaser.Types.Input.HitAreaCallback
import Phaser.Types.Input.InputConfiguration
import Phaser.Types.Input.InteractiveObject
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Renderer.Snapshot.SnapshotCallback
import Phaser.Types.Tilemaps.TilemapConfig
import Phaser.Types.Tweens.NumberTweenBuilderConfig
import Phaser.Types.Tweens.TweenBuilderConfig
import org.khronos.webgl.*
import org.w3c.dom.*

open external class DynamicBitmapText : BitmapText {
    constructor(scene: Scene, x: Number, y: Number, font: String, text: String, size: Number, align: integer)
    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String>, size: Number, align: integer)
    open var scrollX: Number
    open var scrollY: Number
    open var cropWidth: Number
    open var cropHeight: Number
    open var displayCallback: DisplayCallback
    open var callbackData: DisplayCallbackConfig
    open fun setSize(width: Number, height: Number): DynamicBitmapText /* this */
    open fun setDisplayCallback(callback: DisplayCallback): DynamicBitmapText /* this */
    open fun setScrollX(value: Number): DynamicBitmapText /* this */
    open fun setScrollY(value: Number): DynamicBitmapText /* this */
    override fun clearAlpha(): DynamicBitmapText /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): DynamicBitmapText /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): DynamicBitmapText /* this */
    override fun setBlendMode(value: BlendModes): DynamicBitmapText /* this */
    override var depth: Number
    override fun setDepth(value: integer): DynamicBitmapText /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): DynamicBitmapText /* this */
    override fun setMask(mask: GeometryMask): DynamicBitmapText /* this */
    override fun clearMask(destroyMask: Boolean): DynamicBitmapText /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): DynamicBitmapText /* this */
    override fun setOriginFromFrame(): DynamicBitmapText /* this */
    override fun setDisplayOrigin(x: Number, y: Number): DynamicBitmapText /* this */
    override fun updateDisplayOrigin(): DynamicBitmapText /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): DynamicBitmapText /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): DynamicBitmapText /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): DynamicBitmapText /* this */
    override fun setTexture(key: String, frame: integer): DynamicBitmapText /* this */
    override fun setTexture(key: Texture, frame: String): DynamicBitmapText /* this */
    override fun setTexture(key: Texture, frame: integer): DynamicBitmapText /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): DynamicBitmapText /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): DynamicBitmapText /* this */
    override var tintFill: Boolean
    override fun clearTint(): DynamicBitmapText /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): DynamicBitmapText /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): DynamicBitmapText /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): DynamicBitmapText /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): DynamicBitmapText /* this */
    override fun setRotation(radians: Number): DynamicBitmapText /* this */
    override fun setAngle(degrees: Number): DynamicBitmapText /* this */
    override fun setScale(x: Number, y: Number): DynamicBitmapText /* this */
    override fun setX(value: Number): DynamicBitmapText /* this */
    override fun setY(value: Number): DynamicBitmapText /* this */
    override fun setZ(value: Number): DynamicBitmapText /* this */
    override fun setW(value: Number): DynamicBitmapText /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): DynamicBitmapText /* this */
    override fun setTexture(key: String): DynamicBitmapText /* this */
    override fun setTexture(key: Texture): DynamicBitmapText /* this */
}

open external class BitmapText : GameObject, Alpha, BlendMode, Depth, Mask, Origin, Pipeline, ScrollFactor, Phaser.GameObjects.Components.Texture, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, font: String, text: String, size: Number, align: integer)
    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String>, size: Number, align: integer)
    open var font: String
    open var fontData: BitmapFontData
    open var wordWrapCharCode: Number
    open fun setLeftAlign(): BitmapText /* this */
    open fun setCenterAlign(): BitmapText /* this */
    open fun setRightAlign(): BitmapText /* this */
    open fun setFontSize(size: Number): BitmapText /* this */
    open fun setLetterSpacing(spacing: Number = definedExternally): BitmapText /* this */
    open fun setText(value: String): BitmapText /* this */
    open fun setText(value: Array<String>): BitmapText /* this */
    open fun getTextBounds(round: Boolean = definedExternally): BitmapTextSize
    open fun setFont(font: String, size: Number = definedExternally, align: integer = definedExternally): BitmapText /* this */
    open fun setMaxWidth(value: Number, wordWrapCharCode: Number = definedExternally): BitmapText /* this */
    open var align: integer
    open var text: String
    open var fontSize: Number
    open var letterSpacing: Number
    open var maxWidth: Number
    open var width: Number
    open var height: Number
    override fun toJSON(): JSONGameObject /* Phaser.Types.GameObjects.JSONGameObject & `T$4` */
    override fun clearAlpha(): BitmapText /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): BitmapText /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): BitmapText /* this */
    override fun setBlendMode(value: BlendModes): BitmapText /* this */
    override var depth: Number
    override fun setDepth(value: integer): BitmapText /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): BitmapText /* this */
    override fun setMask(mask: GeometryMask): BitmapText /* this */
    override fun clearMask(destroyMask: Boolean): BitmapText /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): BitmapText /* this */
    override fun setOriginFromFrame(): BitmapText /* this */
    override fun setDisplayOrigin(x: Number, y: Number): BitmapText /* this */
    override fun updateDisplayOrigin(): BitmapText /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): BitmapText /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): BitmapText /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): BitmapText /* this */
    override fun setTexture(key: String, frame: integer): BitmapText /* this */
    override fun setTexture(key: Texture, frame: String): BitmapText /* this */
    override fun setTexture(key: Texture, frame: integer): BitmapText /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): BitmapText /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): BitmapText /* this */
    override var tintFill: Boolean
    override fun clearTint(): BitmapText /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): BitmapText /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): BitmapText /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): BitmapText /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): BitmapText /* this */
    override fun setRotation(radians: Number): BitmapText /* this */
    override fun setAngle(degrees: Number): BitmapText /* this */
    override fun setScale(x: Number, y: Number): BitmapText /* this */
    override fun setX(value: Number): BitmapText /* this */
    override fun setY(value: Number): BitmapText /* this */
    override fun setZ(value: Number): BitmapText /* this */
    override fun setW(value: Number): BitmapText /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): BitmapText /* this */
    override fun setTexture(key: String): BitmapText /* this */
    override fun setTexture(key: Texture): BitmapText /* this */

    companion object {
        var ALIGN_LEFT: integer
        var ALIGN_CENTER: integer
        var ALIGN_RIGHT: integer
        fun ParseFromAtlas(scene: Scene, fontName: String, textureKey: String, frameKey: String, xmlKey: String, xSpacing: integer = definedExternally, ySpacing: integer = definedExternally): Boolean
        fun ParseXMLBitmapFont(xml: XMLDocument, xSpacing: integer = definedExternally, ySpacing: integer = definedExternally, frame: Frame = definedExternally): BitmapFontData
    }
}

open external class Blitter : GameObject, Alpha, BlendMode, Depth, Mask, Pipeline, ScrollFactor, Size, Phaser.GameObjects.Components.Texture, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer)
    open var children: List<Bob>
    open var dirty: Boolean
    open fun create(x: Number, y: Number, frame: String = definedExternally, visible: Boolean = definedExternally, index: integer = definedExternally): Bob
    open fun create(x: Number, y: Number, frame: integer = definedExternally, visible: Boolean = definedExternally, index: integer = definedExternally): Bob
    open fun create(x: Number, y: Number, frame: Frame = definedExternally, visible: Boolean = definedExternally, index: integer = definedExternally): Bob
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: String = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: integer = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: Frame = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: Array<String> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: Array<integer> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createFromCallback(callback: CreateCallback, quantity: integer, frame: Array<Frame> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: String = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: integer = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: Frame = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: Array<String> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: Array<integer> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun createMultiple(quantity: integer, frame: Array<Frame> = definedExternally, visible: Boolean = definedExternally): Array<Bob>
    open fun childCanRender(child: Bob): Boolean
    open fun getRenderList(): Array<Bob>
    open fun clear()
    open fun preDestroy()
    override fun clearAlpha(): Blitter /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Blitter /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Blitter /* this */
    override fun setBlendMode(value: BlendModes): Blitter /* this */
    override var depth: Number
    override fun setDepth(value: integer): Blitter /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Blitter /* this */
    override fun setMask(mask: GeometryMask): Blitter /* this */
    override fun clearMask(destroyMask: Boolean): Blitter /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Blitter /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Blitter /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Blitter /* this */
    override fun setSize(width: Number, height: Number): Blitter /* this */
    override fun setDisplaySize(width: Number, height: Number): Blitter /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): Blitter /* this */
    override fun setTexture(key: String, frame: integer): Blitter /* this */
    override fun setTexture(key: Texture, frame: String): Blitter /* this */
    override fun setTexture(key: Texture, frame: integer): Blitter /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Blitter /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Blitter /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Blitter /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Blitter /* this */
    override fun setRotation(radians: Number): Blitter /* this */
    override fun setAngle(degrees: Number): Blitter /* this */
    override fun setScale(x: Number, y: Number): Blitter /* this */
    override fun setX(value: Number): Blitter /* this */
    override fun setY(value: Number): Blitter /* this */
    override fun setZ(value: Number): Blitter /* this */
    override fun setW(value: Number): Blitter /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Blitter /* this */
    open fun create(x: Number, y: Number): Bob
    open fun createFromCallback(callback: CreateCallback, quantity: integer): Array<Bob>
    open fun createMultiple(quantity: integer): Array<Bob>
    override fun setTexture(key: String): Blitter /* this */
    override fun setTexture(key: Texture): Blitter /* this */
}

open external class Bob {
    constructor(blitter: Blitter, x: Number, y: Number, frame: String, visible: Boolean)
    constructor(blitter: Blitter, x: Number, y: Number, frame: integer, visible: Boolean)
    open var parent: Blitter
    open var x: Number
    open var y: Number
    open var frame: Frame
    open var data: Any?
    open var tint: Number
    open var flipX: Boolean
    open var flipY: Boolean
    open fun setFrame(frame: String = definedExternally): Bob /* this */
    open fun setFrame(frame: integer = definedExternally): Bob /* this */
    open fun setFrame(frame: Frame = definedExternally): Bob /* this */
    open fun resetFlip(): Bob /* this */
    open fun reset(x: Number, y: Number, frame: String = definedExternally): Bob /* this */
    open fun reset(x: Number, y: Number, frame: integer = definedExternally): Bob /* this */
    open fun reset(x: Number, y: Number, frame: Frame = definedExternally): Bob /* this */
    open fun setPosition(x: Number, y: Number): Bob /* this */
    open fun setFlipX(value: Boolean): Bob /* this */
    open fun setFlipY(value: Boolean): Bob /* this */
    open fun setFlip(x: Boolean, y: Boolean): Bob /* this */
    open fun setVisible(value: Boolean): Bob /* this */
    open fun setAlpha(value: Number): Bob /* this */
    open fun setTint(value: Number): Bob /* this */
    open fun destroy()
    open var visible: Boolean
    open var alpha: Number
    open fun setFrame(): Bob /* this */
    open fun reset(x: Number, y: Number): Bob /* this */
}

external fun BuildGameObject(scene: Scene, gameObject: GameObject, config: GameObjectConfig): GameObject

external fun BuildGameObjectAnimation(sprite: Sprite, config: Any?): Sprite

open external class Container(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, children: Array<Phaser.GameObjects.GameObject> = definedExternally) : GameObject, AlphaSingle, BlendMode, ComputedSize, Depth, Mask, Transform, Visible {
    open var list: Array<GameObject>
    open var exclusive: Boolean
    open var maxSize: integer
    open var position: integer
    open var localTransform: TransformMatrix
    open var scrollFactorX: Number
    open var scrollFactorY: Number
    open var originX: Number
    open var originY: Number
    open var displayOriginX: Number
    open var displayOriginY: Number
    open fun setExclusive(value: Boolean = definedExternally): Container /* this */
    open fun getBounds(output: Phaser.Geom.Rectangle = definedExternally): Phaser.Geom.Rectangle
    open fun pointToContainer(source: Any?, output: Any? = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Any?, output: Point = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Any?, output: Vector2 = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Point, output: Any? = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Point, output: Point = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Point, output: Vector2 = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Vector2, output: Any? = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Vector2, output: Point = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Vector2, output: Vector2 = definedExternally): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun getBoundsTransformMatrix(): TransformMatrix
    open fun add(child: GameObject): Container /* this */
    open fun add(child: Array<GameObject>): Container /* this */
    open fun addAt(child: GameObject, index: integer = definedExternally): Container /* this */
    open fun addAt(child: Array<GameObject>, index: integer = definedExternally): Container /* this */
    open fun getAt(index: integer): GameObject
    open fun getIndex(child: GameObject): integer
    open fun sort(property: String, handler: Function<*> = definedExternally): Container /* this */
    open fun getByName(name: String): GameObject
    open fun getRandom(startIndex: integer = definedExternally, length: integer = definedExternally): GameObject
    open fun getFirst(property: String, value: Any, startIndex: integer = definedExternally, endIndex: integer = definedExternally): GameObject
    open fun getAll(property: String = definedExternally, value: Any = definedExternally, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Array<GameObject>
    open fun count(property: String, value: Any, startIndex: integer = definedExternally, endIndex: integer = definedExternally): integer
    open fun swap(child1: GameObject, child2: GameObject): Container /* this */
    open fun moveTo(child: GameObject, index: integer): Container /* this */
    open fun remove(child: GameObject, destroyChild: Boolean = definedExternally): Container /* this */
    open fun remove(child: Array<GameObject>, destroyChild: Boolean = definedExternally): Container /* this */
    open fun removeAt(index: integer, destroyChild: Boolean = definedExternally): Container /* this */
    open fun removeBetween(startIndex: integer = definedExternally, endIndex: integer = definedExternally, destroyChild: Boolean = definedExternally): Container /* this */
    open fun removeAll(destroyChild: Boolean = definedExternally): Container /* this */
    open fun bringToTop(child: GameObject): Container /* this */
    open fun sendToBack(child: GameObject): Container /* this */
    open fun moveUp(child: GameObject): Container /* this */
    open fun moveDown(child: GameObject): Container /* this */
    open fun reverse(): Container /* this */
    open fun shuffle(): Container /* this */
    open fun replace(oldChild: GameObject, newChild: GameObject, destroyChild: Boolean = definedExternally): Container /* this */
    open fun exists(child: GameObject): Boolean
    open fun setAll(property: String, value: Any, startIndex: integer = definedExternally, endIndex: integer = definedExternally): Container /* this */
    open fun each(callback: Function<*>, context: Any? = definedExternally, vararg args: Any): Container /* this */
    open fun iterate(callback: Function<*>, context: Any? = definedExternally, vararg args: Any): Container /* this */
    open fun setScrollFactor(x: Number, y: Number = definedExternally, updateChildren: Boolean = definedExternally): Container /* this */
    open var length: integer
    open var first: GameObject
    open var last: GameObject
    open var next: GameObject
    open var previous: GameObject
    open fun preDestroy()
    override fun clearAlpha(): Container /* this */
    override fun setAlpha(value: Number): Container /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Container /* this */
    override fun setBlendMode(value: BlendModes): Container /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Container /* this */
    override fun setDisplaySize(width: Number, height: Number): Container /* this */
    override var depth: Number
    override fun setDepth(value: integer): Container /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Container /* this */
    override fun setMask(mask: GeometryMask): Container /* this */
    override fun clearMask(destroyMask: Boolean): Container /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Container /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Container /* this */
    override fun setRotation(radians: Number): Container /* this */
    override fun setAngle(degrees: Number): Container /* this */
    override fun setScale(x: Number, y: Number): Container /* this */
    override fun setX(value: Number): Container /* this */
    override fun setY(value: Number): Container /* this */
    override fun setZ(value: Number): Container /* this */
    override fun setW(value: Number): Container /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Container /* this */
    open fun pointToContainer(source: Any?): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Point): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
    open fun pointToContainer(source: Vector2): dynamic /* Any? | Phaser.Geom.Point | Phaser.Math.Vector2 */
}

open external class DisplayList(scene: Phaser.Scene) : List<GameObject> {
    open var sortChildrenFlag: Boolean
    open var scene: Scene
    open var systems: Systems
    open fun queueDepthSort()
    open fun depthSort()
    open fun sortByDepth(childA: GameObject, childB: GameObject): integer
    open fun getChildren(): Array<GameObject>
}

open external class DOMElement : GameObject, AlphaSingle, BlendMode, Depth, Origin, ScrollFactor, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, element: Element, style: String, innerText: String)
    constructor(scene: Scene, x: Number, y: Number, element: Element, style: Any, innerText: String)
    constructor(scene: Scene, x: Number, y: Number, element: String, style: String, innerText: String)
    constructor(scene: Scene, x: Number, y: Number, element: String, style: Any, innerText: String)
    open var parent: Element
    open var cache: BaseCache
    open var node: Element
    open var transformOnly: Boolean
    open var skewX: Number
    open var skewY: Number
    open var rotate3d: Vector4
    open var rotate3dAngle: String
    open var width: Number
    open var height: Number
    open var displayWidth: Number
    open var displayHeight: Number
    open fun setSkew(x: Number = definedExternally, y: Number = definedExternally): DOMElement /* this */
    open fun setPerspective(value: Number): DOMElement /* this */
    open var perspective: Number
    open fun addListener(events: String): DOMElement /* this */
    open fun removeListener(events: String): DOMElement /* this */
    open fun createElement(tagName: String, style: String = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun createElement(tagName: String, style: Any = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun setElement(element: String, style: String = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun setElement(element: String, style: Any = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun setElement(element: Element, style: String = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun setElement(element: Element, style: Any = definedExternally, innerText: String = definedExternally): DOMElement /* this */
    open fun createFromCache(The: String, tagName: String = definedExternally): DOMElement /* this */
    open fun createFromHTML(A: String, tagName: String = definedExternally): DOMElement /* this */
    open fun removeElement(): DOMElement /* this */
    open fun updateSize(): DOMElement /* this */
    open fun getChildByProperty(property: String, value: String): Element
    open fun getChildByID(id: String): Element
    open fun getChildByName(name: String): Element
    open fun setClassName(className: String): DOMElement /* this */
    open fun setText(text: String): DOMElement /* this */
    open fun setHTML(html: String): DOMElement /* this */
    open fun willRender(): Boolean
    override fun clearAlpha(): DOMElement /* this */
    override fun setAlpha(value: Number): DOMElement /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): DOMElement /* this */
    override fun setBlendMode(value: BlendModes): DOMElement /* this */
    override var depth: Number
    override fun setDepth(value: integer): DOMElement /* this */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): DOMElement /* this */
    override fun setOriginFromFrame(): DOMElement /* this */
    override fun setDisplayOrigin(x: Number, y: Number): DOMElement /* this */
    override fun updateDisplayOrigin(): DOMElement /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): DOMElement /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): DOMElement /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): DOMElement /* this */
    override fun setRotation(radians: Number): DOMElement /* this */
    override fun setAngle(degrees: Number): DOMElement /* this */
    override fun setScale(x: Number, y: Number): DOMElement /* this */
    override fun setX(value: Number): DOMElement /* this */
    override fun setY(value: Number): DOMElement /* this */
    override fun setZ(value: Number): DOMElement /* this */
    override fun setW(value: Number): DOMElement /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): DOMElement /* this */
    open fun createElement(tagName: String): DOMElement /* this */
    open fun setElement(element: String): DOMElement /* this */
    open fun setElement(element: Element): DOMElement /* this */
}

open external class Extern(scene: Phaser.Scene) : GameObject, Alpha, BlendMode, Depth, Flip, Origin, ScrollFactor, Size, Phaser.GameObjects.Components.Texture, Tint, Transform, Visible {
    override fun clearAlpha(): Extern /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Extern /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Extern /* this */
    override fun setBlendMode(value: BlendModes): Extern /* this */
    override var depth: Number
    override fun setDepth(value: integer): Extern /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Extern /* this */
    override fun toggleFlipY(): Extern /* this */
    override fun setFlipX(value: Boolean): Extern /* this */
    override fun setFlipY(value: Boolean): Extern /* this */
    override fun setFlip(x: Boolean, y: Boolean): Extern /* this */
    override fun resetFlip(): Extern /* this */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Extern /* this */
    override fun setOriginFromFrame(): Extern /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Extern /* this */
    override fun updateDisplayOrigin(): Extern /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Extern /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Extern /* this */
    override fun setSize(width: Number, height: Number): Extern /* this */
    override fun setDisplaySize(width: Number, height: Number): Extern /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): Extern /* this */
    override fun setTexture(key: String, frame: integer): Extern /* this */
    override fun setTexture(key: Texture, frame: String): Extern /* this */
    override fun setTexture(key: Texture, frame: integer): Extern /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Extern /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Extern /* this */
    override var tintFill: Boolean
    override fun clearTint(): Extern /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Extern /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Extern /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Extern /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Extern /* this */
    override fun setRotation(radians: Number): Extern /* this */
    override fun setAngle(degrees: Number): Extern /* this */
    override fun setScale(x: Number, y: Number): Extern /* this */
    override fun setX(value: Number): Extern /* this */
    override fun setY(value: Number): Extern /* this */
    override fun setZ(value: Number): Extern /* this */
    override fun setW(value: Number): Extern /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Extern /* this */
    override fun setTexture(key: String): Extern /* this */
    override fun setTexture(key: Texture): Extern /* this */
}

open external class GameObject(scene: Phaser.Scene, type: String) : EventEmitter {
    open var scene: Scene
    open var type: String
    open var state: dynamic /* integer | String */
    open var parentContainer: Container
    open var name: String
    open var active: Boolean
    open var tabIndex: integer
    open var data: DataManager
    open var renderFlags: integer
    open var cameraFilter: Number
    open var input: InteractiveObject
    open var body: Phaser.Physics.Arcade.Body /* Any? | Phaser.Physics.Arcade.Body | MatterJS.BodyType */
    open var ignoreDestroy: Boolean
    open fun setActive(value: Boolean): GameObject /* this */
    open fun setName(value: String): GameObject /* this */
    open fun setState(value: integer): GameObject /* this */
    open fun setState(value: String): GameObject /* this */
    open fun setDataEnabled(): GameObject /* this */
    open fun setData(key: String, data: Any = definedExternally): GameObject /* this */
    open fun setData(key: Any?, data: Any = definedExternally): GameObject /* this */
    open fun incData(key: String, data: Any = definedExternally): GameObject /* this */
    open fun incData(key: Any?, data: Any = definedExternally): GameObject /* this */
    open fun toggleData(key: String): GameObject /* this */
    open fun toggleData(key: Any?): GameObject /* this */
    open fun getData(key: String): Any
    open fun getData(key: Array<String>): Any
    open fun setInteractive(shape: InputConfiguration = definedExternally, callback: HitAreaCallback = definedExternally, dropZone: Boolean = definedExternally): GameObject /* this */
    open fun setInteractive(shape: Any = definedExternally, callback: HitAreaCallback = definedExternally, dropZone: Boolean = definedExternally): GameObject /* this */
    open fun disableInteractive(): GameObject /* this */
    open fun removeInteractive(): GameObject /* this */
    open fun update(vararg args: Any)
    open fun toJSON(): JSONGameObject
    open fun willRender(camera: Camera): Boolean
    open fun getIndexList(): Array<integer>
    open fun destroy(fromScene: Boolean = definedExternally)
    open fun setInteractive(): GameObject /* this */

    companion object {
        var RENDER_MASK: integer
    }
}

open external class GameObjectCreator(scene: Phaser.Scene) {
    open fun dynamicBitmapText(config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$3` */, addToScene: Boolean = definedExternally): DynamicBitmapText
    open fun bitmapText(config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$3` */, addToScene: Boolean = definedExternally): BitmapText
    open fun blitter(config: Any?, addToScene: Boolean = definedExternally): Blitter
    open fun container(config: Any?, addToScene: Boolean = definedExternally): Container
    open var scene: Scene
    open var systems: Systems
    open var displayList: DisplayList
    open var updateList: UpdateList
    open fun graphics(config: Any?, addToScene: Boolean = definedExternally): Graphics
    open fun group(config: GroupConfig): Group
    open fun group(config: GroupCreateConfig): Group
    open fun image(config: Any?, addToScene: Boolean = definedExternally): Image
    open fun mesh(config: Any?, addToScene: Boolean = definedExternally): Mesh
    open fun particles(config: Any?, addToScene: Boolean = definedExternally): ParticleEmitterManager
    open fun quad(config: Any?, addToScene: Boolean = definedExternally): Quad
    open fun renderTexture(config: RenderTextureConfig, addToScene: Boolean = definedExternally): RenderTexture
    open fun rope(config: Any?, addToScene: Boolean = definedExternally): Rope
    open fun shader(config: Any?, addToScene: Boolean = definedExternally): Shader
    open fun sprite(config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, addToScene: Boolean = definedExternally): Sprite
    open fun text(config: Any?, addToScene: Boolean = definedExternally): Text
    open fun tileSprite(config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$7` */, addToScene: Boolean = definedExternally): TileSprite
    open fun video(config: Any?, addToScene: Boolean = definedExternally): Video
    open fun zone(config: Any?): Zone
    open fun tilemap(config: TilemapConfig = definedExternally): Tilemap
    open fun tween(config: TweenBuilderConfig): Tween
    open fun tween(config: Any?): Tween
}

open external class GameObjectFactory(scene: Phaser.Scene) {
    open fun path(x: Number, y: Number): Path
    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: String = definedExternally, size: Number = definedExternally): DynamicBitmapText
    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: Array<String> = definedExternally, size: Number = definedExternally): DynamicBitmapText
    open fun bitmapText(x: Number, y: Number, font: String, text: String = definedExternally, size: Number = definedExternally, align: integer = definedExternally): BitmapText
    open fun bitmapText(x: Number, y: Number, font: String, text: Array<String> = definedExternally, size: Number = definedExternally, align: integer = definedExternally): BitmapText
    open fun blitter(x: Number, y: Number, key: String, frame: String = definedExternally): Blitter
    open fun blitter(x: Number, y: Number, key: String, frame: integer = definedExternally): Blitter
    open fun container(x: Number, y: Number, children: GameObject = definedExternally): Container
    open fun container(x: Number, y: Number, children: Array<GameObject> = definedExternally): Container
    open fun dom(x: Number, y: Number, element: HTMLElement = definedExternally, style: String = definedExternally, innerText: String = definedExternally): DOMElement
    open fun dom(x: Number, y: Number, element: HTMLElement = definedExternally, style: Any = definedExternally, innerText: String = definedExternally): DOMElement
    open fun dom(x: Number, y: Number, element: String = definedExternally, style: String = definedExternally, innerText: String = definedExternally): DOMElement
    open fun dom(x: Number, y: Number, element: String = definedExternally, style: Any = definedExternally, innerText: String = definedExternally): DOMElement
    open fun extern(): Extern
    open var scene: Scene
    open var systems: Systems
    open var displayList: DisplayList
    open var updateList: UpdateList
    open fun existing(child: GameObject): GameObject
    open fun existing(child: Group): GameObject
    open fun graphics(config: Styles /* Phaser.Types.GameObjects.Graphics.Styles & `T$5` */ = definedExternally): Graphics
    open fun group(children: Array<GameObject> = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(children: Array<GameObject> = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun group(children: GroupConfig = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(children: GroupConfig = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun group(children: Array<GroupConfig> = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(children: Array<GroupConfig> = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun image(x: Number, y: Number, texture: String, frame: String = definedExternally): Image
    open fun image(x: Number, y: Number, texture: String, frame: integer = definedExternally): Image
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String = definedExternally): Mesh
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: integer = definedExternally): Mesh
    open fun particles(texture: String, frame: String = definedExternally, emitters: ParticleEmitterConfig = definedExternally): ParticleEmitterManager
    open fun particles(texture: String, frame: String = definedExternally, emitters: Array<ParticleEmitterConfig> = definedExternally): ParticleEmitterManager
    open fun particles(texture: String, frame: integer = definedExternally, emitters: ParticleEmitterConfig = definedExternally): ParticleEmitterManager
    open fun particles(texture: String, frame: integer = definedExternally, emitters: Array<ParticleEmitterConfig> = definedExternally): ParticleEmitterManager
    open fun particles(texture: String, frame: Any? = definedExternally, emitters: ParticleEmitterConfig = definedExternally): ParticleEmitterManager
    open fun particles(texture: String, frame: Any? = definedExternally, emitters: Array<ParticleEmitterConfig> = definedExternally): ParticleEmitterManager
    open fun follower(path: Path, x: Number, y: Number, texture: String, frame: String = definedExternally): PathFollower
    open fun follower(path: Path, x: Number, y: Number, texture: String, frame: integer = definedExternally): PathFollower
    open fun quad(x: Number, y: Number, texture: String, frame: String = definedExternally): Quad
    open fun quad(x: Number, y: Number, texture: String, frame: integer = definedExternally): Quad
    open fun renderTexture(x: Number, y: Number, width: integer = definedExternally, height: integer = definedExternally): RenderTexture
    open fun rope(x: Number, y: Number, texture: String, frame: String = definedExternally, points: Array<Vector2Like> = definedExternally, horizontal: Boolean = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope
    open fun rope(x: Number, y: Number, texture: String, frame: integer = definedExternally, points: Array<Vector2Like> = definedExternally, horizontal: Boolean = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope
    open fun shader(key: String, x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, textures: Array<String> = definedExternally, textureData: Any? = definedExternally): Shader
    open fun shader(key: BaseShader, x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, textures: Array<String> = definedExternally, textureData: Any? = definedExternally): Shader
    open fun arc(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally, startAngle: integer = definedExternally, endAngle: integer = definedExternally, anticlockwise: Boolean = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Arc
    open fun circle(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Arc
    open fun curve(x: Number = definedExternally, y: Number = definedExternally, curve: Phaser.Curves.Curve = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Curve
    open fun ellipse(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Ellipse
    open fun grid(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, cellWidth: Number = definedExternally, cellHeight: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally, outlineFillColor: Number = definedExternally, outlineFillAlpha: Number = definedExternally): Grid
    open fun isobox(x: Number = definedExternally, y: Number = definedExternally, size: Number = definedExternally, height: Number = definedExternally, fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally): IsoBox
    open fun isotriangle(x: Number = definedExternally, y: Number = definedExternally, size: Number = definedExternally, height: Number = definedExternally, reversed: Boolean = definedExternally, fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally): IsoTriangle
    open fun line(x: Number = definedExternally, y: Number = definedExternally, x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, strokeColor: Number = definedExternally, strokeAlpha: Number = definedExternally): Line
    open fun polygon(x: Number = definedExternally, y: Number = definedExternally, points: Any = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Polygon
    open fun rectangle(x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Rectangle
    open fun star(x: Number = definedExternally, y: Number = definedExternally, points: Number = definedExternally, innerRadius: Number = definedExternally, outerRadius: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Star
    open fun triangle(x: Number = definedExternally, y: Number = definedExternally, x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, x3: Number = definedExternally, y3: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Triangle
    open fun sprite(x: Number, y: Number, texture: String, frame: String = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, texture: String, frame: integer = definedExternally): Sprite
    open fun text(x: Number, y: Number, text: String, style: Any? = definedExternally): Text
    open fun text(x: Number, y: Number, text: Array<String>, style: Any? = definedExternally): Text
    open fun tileSprite(x: Number, y: Number, width: integer, height: integer, texture: String, frame: String = definedExternally): TileSprite
    open fun tileSprite(x: Number, y: Number, width: integer, height: integer, texture: String, frame: integer = definedExternally): TileSprite
    open fun video(x: Number, y: Number, key: String = definedExternally): Video
    open fun zone(x: Number, y: Number, width: Number, height: Number): Zone
    open fun tilemap(key: String = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, data: Array<Array<integer>> = definedExternally, insertNull: Boolean = definedExternally): Tilemap
    open fun tween(config: TweenBuilderConfig): Tween
    open fun tween(config: Any?): Tween
    open fun dynamicBitmapText(x: Number, y: Number, font: String): DynamicBitmapText
    open fun bitmapText(x: Number, y: Number, font: String): BitmapText
    open fun blitter(x: Number, y: Number, key: String): Blitter
    open fun container(x: Number, y: Number): Container
    open fun dom(x: Number, y: Number): DOMElement
    open fun group(): Group
    open fun image(x: Number, y: Number, texture: String): Image
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String): Mesh
    open fun particles(texture: String): ParticleEmitterManager
    open fun follower(path: Path, x: Number, y: Number, texture: String): PathFollower
    open fun quad(x: Number, y: Number, texture: String): Quad
    open fun rope(x: Number, y: Number, texture: String): Rope
    open fun sprite(x: Number, y: Number, texture: String): Sprite
    open fun tileSprite(x: Number, y: Number, width: integer, height: integer, texture: String): TileSprite

    companion object {
        fun register(factoryType: String, factoryFunction: Function<*>)
        fun remove(factoryType: String)
    }
}

open external class Graphics(scene: Phaser.Scene, options: Phaser.Types.GameObjects.Graphics.Styles /* Phaser.Types.GameObjects.Graphics.Styles & `T$5` */ = definedExternally) : GameObject, AlphaSingle, BlendMode, Depth, Mask, Pipeline, Transform, Visible, ScrollFactor {
    open var displayOriginX: Number
    open var displayOriginY: Number
    open var commandBuffer: Array<Any>
    open var defaultFillColor: Number
    open var defaultFillAlpha: Number
    open var defaultStrokeWidth: Number
    open var defaultStrokeColor: Number
    open var defaultStrokeAlpha: Number
    open fun setDefaultStyles(options: Styles): Graphics /* this */
    open fun lineStyle(lineWidth: Number, color: Number, alpha: Number = definedExternally): Graphics /* this */
    open fun fillStyle(color: Number, alpha: Number = definedExternally): Graphics /* this */
    open fun fillGradientStyle(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer, alpha: Number = definedExternally): Graphics /* this */
    open fun lineGradientStyle(lineWidth: Number, topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer, alpha: Number = definedExternally): Graphics /* this */
    open fun setTexture(key: String = definedExternally, frame: String = definedExternally, mode: Number = definedExternally): Graphics /* this */
    open fun setTexture(key: String = definedExternally, frame: integer = definedExternally, mode: Number = definedExternally): Graphics /* this */
    open fun beginPath(): Graphics /* this */
    open fun closePath(): Graphics /* this */
    open fun fillPath(): Graphics /* this */
    open fun fill(): Graphics /* this */
    open fun strokePath(): Graphics /* this */
    open fun stroke(): Graphics /* this */
    open fun fillCircleShape(circle: Circle): Graphics /* this */
    open fun strokeCircleShape(circle: Circle): Graphics /* this */
    open fun fillCircle(x: Number, y: Number, radius: Number): Graphics /* this */
    open fun strokeCircle(x: Number, y: Number, radius: Number): Graphics /* this */
    open fun fillRectShape(rect: Phaser.Geom.Rectangle): Graphics /* this */
    open fun strokeRectShape(rect: Phaser.Geom.Rectangle): Graphics /* this */
    open fun fillRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun strokeRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun fillRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: RoundedRectRadius = definedExternally): Graphics /* this */
    open fun fillRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number = definedExternally): Graphics /* this */
    open fun strokeRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: RoundedRectRadius = definedExternally): Graphics /* this */
    open fun strokeRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Point, size: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Vector2, size: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Any?, size: Number = definedExternally): Graphics /* this */
    open fun fillPoint(x: Number, y: Number, size: Number = definedExternally): Graphics /* this */
    open fun fillTriangleShape(triangle: Phaser.Geom.Triangle): Graphics /* this */
    open fun strokeTriangleShape(triangle: Phaser.Geom.Triangle): Graphics /* this */
    open fun fillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun strokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun strokeLineShape(line: Phaser.Geom.Line): Graphics /* this */
    open fun lineBetween(x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun lineTo(x: Number, y: Number): Graphics /* this */
    open fun moveTo(x: Number, y: Number): Graphics /* this */
    open fun strokePoints(points: Array<Any>, closeShape: Boolean = definedExternally, closePath: Boolean = definedExternally, endIndex: integer = definedExternally): Graphics /* this */
    open fun strokePoints(points: Array<Point>, closeShape: Boolean = definedExternally, closePath: Boolean = definedExternally, endIndex: integer = definedExternally): Graphics /* this */
    open fun fillPoints(points: Array<Any>, closeShape: Boolean = definedExternally, closePath: Boolean = definedExternally, endIndex: integer = definedExternally): Graphics /* this */
    open fun fillPoints(points: Array<Point>, closeShape: Boolean = definedExternally, closePath: Boolean = definedExternally, endIndex: integer = definedExternally): Graphics /* this */
    open fun strokeEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: integer = definedExternally): Graphics /* this */
    open fun strokeEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: integer = definedExternally): Graphics /* this */
    open fun fillEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: integer = definedExternally): Graphics /* this */
    open fun fillEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: integer = definedExternally): Graphics /* this */
    open fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean = definedExternally, overshoot: Number = definedExternally): Graphics /* this */
    open fun slice(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean = definedExternally, overshoot: Number = definedExternally): Graphics /* this */
    open fun save(): Graphics /* this */
    open fun restore(): Graphics /* this */
    open fun translateCanvas(x: Number, y: Number): Graphics /* this */
    open fun scaleCanvas(x: Number, y: Number): Graphics /* this */
    open fun rotateCanvas(radians: Number): Graphics /* this */
    open fun clear(): Graphics /* this */
    open fun generateTexture(key: String, width: integer = definedExternally, height: integer = definedExternally): Graphics /* this */
    open fun generateTexture(key: HTMLCanvasElement, width: integer = definedExternally, height: integer = definedExternally): Graphics /* this */
    open fun preDestroy()
    override fun clearAlpha(): Graphics /* this */
    override fun setAlpha(value: Number): Graphics /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Graphics /* this */
    override fun setBlendMode(value: BlendModes): Graphics /* this */
    override var depth: Number
    override fun setDepth(value: integer): Graphics /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Graphics /* this */
    override fun setMask(mask: GeometryMask): Graphics /* this */
    override fun clearMask(destroyMask: Boolean): Graphics /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Graphics /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Graphics /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    override fun setRotation(radians: Number): Graphics /* this */
    override fun setAngle(degrees: Number): Graphics /* this */
    override fun setScale(x: Number, y: Number): Graphics /* this */
    override fun setX(value: Number): Graphics /* this */
    override fun setY(value: Number): Graphics /* this */
    override fun setZ(value: Number): Graphics /* this */
    override fun setW(value: Number): Graphics /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Graphics /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Graphics /* this */
    open fun setTexture(): Graphics /* this */
    open fun fillRoundedRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun strokeRoundedRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */

    companion object {
        var TargetCamera: Camera
    }
}

open external class Group {
    constructor(scene: Scene, children: Array<GameObject>, config: GroupConfig)
    constructor(scene: Scene, children: Array<GameObject>, config: GroupCreateConfig)
    constructor(scene: Scene, children: GroupConfig, config: GroupConfig)
    constructor(scene: Scene, children: GroupConfig, config: GroupCreateConfig)
    constructor(scene: Scene, children: GroupCreateConfig, config: GroupConfig)
    constructor(scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig)
    open var scene: Scene
    open var children: Set<GameObject>
    open var isParent: Boolean
    open var type: String
    open var classType: Function<*>
    open var name: String
    open var active: Boolean
    open var maxSize: integer
    open var defaultKey: String
    open var defaultFrame: dynamic /* String | integer */
    open var runChildUpdate: Boolean
    open var createCallback: GroupCallback
    open var removeCallback: GroupCallback
    open var createMultipleCallback: GroupMultipleCreateCallback
    open fun create(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally, active: Boolean = definedExternally): Any
    open fun create(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally, active: Boolean = definedExternally): Any
    open fun createMultiple(config: GroupCreateConfig): Array<Any>
    open fun createMultiple(config: Array<GroupCreateConfig>): Array<Any>
    open fun createFromConfig(options: GroupCreateConfig): Array<Any>
    open fun preUpdate(time: Number, delta: Number)
    open fun add(child: GameObject, addToScene: Boolean = definedExternally): Group /* this */
    open fun addMultiple(children: Array<GameObject>, addToScene: Boolean = definedExternally): Group /* this */
    open fun remove(child: GameObject, removeFromScene: Boolean = definedExternally, destroyChild: Boolean = definedExternally): Group /* this */
    open fun clear(removeFromScene: Boolean = definedExternally, destroyChild: Boolean = definedExternally): Group /* this */
    open fun contains(child: GameObject): Boolean
    open fun getChildren(): Array<GameObject>
    open fun getLength(): integer
    open fun getFirst(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirst(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstNth(nth: integer, state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstNth(nth: integer, state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun getLast(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getLast(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun getLastNth(nth: integer, state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getLastNth(nth: integer, state: Boolean = definedExternally, createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun get(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun get(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstAlive(createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstAlive(createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstDead(createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: String = definedExternally, visible: Boolean = definedExternally): Any
    open fun getFirstDead(createIfNull: Boolean = definedExternally, x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally, frame: integer = definedExternally, visible: Boolean = definedExternally): Any
    open fun playAnimation(key: String, startFrame: String = definedExternally): Group /* this */
    open fun isFull(): Boolean
    open fun countActive(value: Boolean = definedExternally): integer
    open fun getTotalUsed(): integer
    open fun getTotalFree(): integer
    open fun propertyValueSet(key: String, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): Group /* this */
    open fun propertyValueInc(key: String, value: Number, step: Number = definedExternally, index: integer = definedExternally, direction: integer = definedExternally): Group /* this */
    open fun setX(value: Number, step: Number = definedExternally): Group /* this */
    open fun setY(value: Number, step: Number = definedExternally): Group /* this */
    open fun setXY(x: Number, y: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally): Group /* this */
    open fun incX(value: Number, step: Number = definedExternally): Group /* this */
    open fun incY(value: Number, step: Number = definedExternally): Group /* this */
    open fun incXY(x: Number, y: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally): Group /* this */
    open fun shiftPosition(x: Number, y: Number, direction: integer = definedExternally): Group /* this */
    open fun angle(value: Number, step: Number = definedExternally): Group /* this */
    open fun rotate(value: Number, step: Number = definedExternally): Group /* this */
    open fun rotateAround(point: Vector2Like, angle: Number): Group /* this */
    open fun rotateAroundDistance(point: Vector2Like, angle: Number, distance: Number): Group /* this */
    open fun setAlpha(value: Number, step: Number = definedExternally): Group /* this */
    open fun setTint(topLeft: Number, topRight: Number = definedExternally, bottomLeft: Number = definedExternally, bottomRight: Number = definedExternally): Group /* this */
    open fun setOrigin(originX: Number, originY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally): Group /* this */
    open fun scaleX(value: Number, step: Number = definedExternally): Group /* this */
    open fun scaleY(value: Number, step: Number = definedExternally): Group /* this */
    open fun scaleXY(scaleX: Number, scaleY: Number = definedExternally, stepX: Number = definedExternally, stepY: Number = definedExternally): Group /* this */
    open fun setDepth(value: Number, step: Number = definedExternally): Group /* this */
    open fun setBlendMode(value: Number): Group /* this */
    open fun setHitArea(hitArea: Any, hitAreaCallback: HitAreaCallback): Group /* this */
    open fun shuffle(): Group /* this */
    open fun kill(gameObject: GameObject)
    open fun killAndHide(gameObject: GameObject)
    open fun setVisible(value: Boolean, index: integer = definedExternally, direction: integer = definedExternally): Group /* this */
    open fun toggleVisible(): Group /* this */
    open fun destroy(destroyChildren: Boolean = definedExternally)
    open fun create(): Any
    open fun getFirst(): Any
    open fun getFirstNth(nth: integer): Any
    open fun getLast(): Any
    open fun getLastNth(nth: integer): Any
    open fun get(): Any
    open fun getFirstAlive(): Any
    open fun getFirstDead(): Any
}

open external class Image : GameObject, Alpha, BlendMode, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Size, TextureCrop, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer)
    override fun clearAlpha(): Image /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Image /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Image /* this */
    override fun setBlendMode(value: BlendModes): Image /* this */
    override var depth: Number
    override fun setDepth(value: integer): Image /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Image /* this */
    override fun toggleFlipY(): Image /* this */
    override fun setFlipX(value: Boolean): Image /* this */
    override fun setFlipY(value: Boolean): Image /* this */
    override fun setFlip(x: Boolean, y: Boolean): Image /* this */
    override fun resetFlip(): Image /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Image /* this */
    override fun setMask(mask: GeometryMask): Image /* this */
    override fun clearMask(destroyMask: Boolean): Image /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Image /* this */
    override fun setOriginFromFrame(): Image /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Image /* this */
    override fun updateDisplayOrigin(): Image /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Image /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Image /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Image /* this */
    override fun setSize(width: Number, height: Number): Image /* this */
    override fun setDisplaySize(width: Number, height: Number): Image /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): Image /* this */
    override fun setTexture(key: String, frame: String): Image /* this */
    override fun setTexture(key: String, frame: integer): Image /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Image /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Image /* this */
    override var tintFill: Boolean
    override fun clearTint(): Image /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Image /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Image /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Image /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setRotation(radians: Number): Image /* this */
    override fun setAngle(degrees: Number): Image /* this */
    override fun setScale(x: Number, y: Number): Image /* this */
    override fun setX(value: Number): Image /* this */
    override fun setY(value: Number): Image /* this */
    override fun setZ(value: Number): Image /* this */
    override fun setW(value: Number): Image /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Image /* this */
    override fun setCrop(): Image /* this */
    override fun setTexture(key: String): Image /* this */
}

open external class Light(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number) {
    open var x: Number
    open var y: Number
    open var radius: Number
    open var r: Number
    open var g: Number
    open var b: Number
    open var intensity: Number
    open var scrollFactorX: Number
    open var scrollFactorY: Number
    open fun set(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number): Light /* this */
    open fun setScrollFactor(x: Number, y: Number): Light /* this */
    open fun setColor(rgb: Number): Light /* this */
    open fun setIntensity(intensity: Number): Light /* this */
    open fun setPosition(x: Number, y: Number): Light /* this */
    open fun setRadius(radius: Number): Light /* this */
}

open external class LightsManager {
    open var lightPool: Array<Light>
    open var lights: Array<Light>
    open var culledLights: Array<Light>
    open var ambientColor: Any
    open var active: Boolean
    open var maxLights: integer
    open fun enable(): LightsManager
    open fun disable(): LightsManager
    open fun cull(camera: Camera): Array<Light>
    open fun forEachLight(callback: LightForEach): LightsManager
    open fun setAmbientColor(rgb: Number): LightsManager
    open fun getMaxVisibleLights(): integer
    open fun getLightCount(): integer
    open fun addLight(x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally, rgb: Number = definedExternally, intensity: Number = definedExternally): Light
    open fun removeLight(light: Light): LightsManager
    open fun shutdown()
    open fun destroy()
}

open external class LightsPlugin(scene: Phaser.Scene) : LightsManager {
    open var scene: Scene
    open var systems: Systems
    open fun boot()
    override fun destroy()
}

open external class Mesh : GameObject, BlendMode, Depth, Mask, Pipeline, Size, Phaser.GameObjects.Components.Texture, Transform, Visible, ScrollFactor {
    constructor(scene: Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: integer)
    open var vertices: Float32Array
    open var uv: Float32Array
    open var colors: Uint32Array
    open var alphas: Float32Array
    open var tintFill: Boolean
    open fun setAlpha()
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Mesh /* this */
    override fun setBlendMode(value: BlendModes): Mesh /* this */
    override var depth: Number
    override fun setDepth(value: integer): Mesh /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Mesh /* this */
    override fun setMask(mask: GeometryMask): Mesh /* this */
    override fun clearMask(destroyMask: Boolean): Mesh /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Mesh /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Mesh /* this */
    override fun setSize(width: Number, height: Number): Mesh /* this */
    override fun setDisplaySize(width: Number, height: Number): Mesh /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): Mesh /* this */
    override fun setTexture(key: String, frame: integer): Mesh /* this */
    override fun setTexture(key: Texture, frame: String): Mesh /* this */
    override fun setTexture(key: Texture, frame: integer): Mesh /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Mesh /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Mesh /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Mesh /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Mesh /* this */
    override fun setRotation(radians: Number): Mesh /* this */
    override fun setAngle(degrees: Number): Mesh /* this */
    override fun setScale(x: Number, y: Number): Mesh /* this */
    override fun setX(value: Number): Mesh /* this */
    override fun setY(value: Number): Mesh /* this */
    override fun setZ(value: Number): Mesh /* this */
    override fun setW(value: Number): Mesh /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Mesh /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Mesh /* this */
    override fun setTexture(key: String): Mesh /* this */
    override fun setTexture(key: Texture): Mesh /* this */
}

open external class PathFollower : Sprite, Phaser.GameObjects.Components.PathFollower {
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: String, frame: integer)
    open var pathRotationOffset: Number
    open var pathOffset: Vector2
    open var pathVector: Vector2
    open var pathDelta: Vector2
    open var pathTween: Tween
    open var pathConfig: PathConfig
    override fun preUpdate(time: integer, delta: Number)
    override fun clearAlpha(): PathFollower /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): PathFollower /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): PathFollower /* this */
    override fun setBlendMode(value: BlendModes): PathFollower /* this */
    override var depth: Number
    override fun setDepth(value: integer): PathFollower /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): PathFollower /* this */
    override fun toggleFlipY(): PathFollower /* this */
    override fun setFlipX(value: Boolean): PathFollower /* this */
    override fun setFlipY(value: Boolean): PathFollower /* this */
    override fun setFlip(x: Boolean, y: Boolean): PathFollower /* this */
    override fun resetFlip(): PathFollower /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): PathFollower /* this */
    override fun setMask(mask: GeometryMask): PathFollower /* this */
    override fun clearMask(destroyMask: Boolean): PathFollower /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): PathFollower /* this */
    override fun setOriginFromFrame(): PathFollower /* this */
    override fun setDisplayOrigin(x: Number, y: Number): PathFollower /* this */
    override fun updateDisplayOrigin(): PathFollower /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): PathFollower /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): PathFollower /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): PathFollower /* this */
    override fun setSize(width: Number, height: Number): PathFollower /* this */
    override fun setDisplaySize(width: Number, height: Number): PathFollower /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setTexture(key: String, frame: String): PathFollower /* this */
    override fun setTexture(key: String, frame: integer): PathFollower /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): PathFollower /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): PathFollower /* this */
    override var tintFill: Boolean
    override fun clearTint(): PathFollower /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): PathFollower /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): PathFollower /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): PathFollower /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setRotation(radians: Number): PathFollower /* this */
    override fun setAngle(degrees: Number): PathFollower /* this */
    override fun setScale(x: Number, y: Number): PathFollower /* this */
    override fun setX(value: Number): PathFollower /* this */
    override fun setY(value: Number): PathFollower /* this */
    override fun setZ(value: Number): PathFollower /* this */
    override fun setW(value: Number): PathFollower /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): PathFollower /* this */
    override var path: Path
    override var rotateToPath: Boolean
    override fun setPath(path: Path, config: Number): PathFollower /* this */
    override fun setPath(path: Path, config: PathConfig): PathFollower /* this */
    override fun setPath(path: Path, config: NumberTweenBuilderConfig): PathFollower /* this */
    override fun setRotateToPath(value: Boolean, offset: Number): PathFollower /* this */
    override fun isFollowing(): Boolean
    override fun startFollow(config: Number, startAt: Number): PathFollower /* this */
    override fun startFollow(config: PathConfig, startAt: Number): PathFollower /* this */
    override fun startFollow(config: NumberTweenBuilderConfig, startAt: Number): PathFollower /* this */
    override fun pauseFollow(): PathFollower /* this */
    override fun resumeFollow(): PathFollower /* this */
    override fun stopFollow(): PathFollower /* this */
    override fun pathUpdate()
    override fun setCrop(): PathFollower /* this */
    override fun setTexture(key: String): PathFollower /* this */
    override fun setPath(path: Path): PathFollower /* this */
    override fun startFollow(): PathFollower /* this */
}

open external class Quad : Mesh {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer)
    open fun setFrame(frame: String): Quad /* this */
    open fun setFrame(frame: integer): Quad /* this */
    open var topLeftX: Number
    open var topLeftY: Number
    open var topRightX: Number
    open var topRightY: Number
    open var bottomLeftX: Number
    open var bottomLeftY: Number
    open var bottomRightX: Number
    open var bottomRightY: Number
    open var topLeftAlpha: Number
    open var topRightAlpha: Number
    open var bottomLeftAlpha: Number
    open var bottomRightAlpha: Number
    open var topLeftColor: Number
    open var topRightColor: Number
    open var bottomLeftColor: Number
    open var bottomRightColor: Number
    open fun setTopLeft(x: Number, y: Number): Quad /* this */
    open fun setTopRight(x: Number, y: Number): Quad /* this */
    open fun setBottomLeft(x: Number, y: Number): Quad /* this */
    open fun setBottomRight(x: Number, y: Number): Quad /* this */
    open fun resetPosition(): Quad /* this */
    open fun resetAlpha(): Quad /* this */
    open fun resetColors(): Quad /* this */
    open fun reset(): Quad /* this */
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Quad /* this */
    override fun setBlendMode(value: BlendModes): Quad /* this */
    override var depth: Number
    override fun setDepth(value: integer): Quad /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Quad /* this */
    override fun setMask(mask: GeometryMask): Quad /* this */
    override fun clearMask(destroyMask: Boolean): Quad /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Quad /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Quad /* this */
    override fun setSize(width: Number, height: Number): Quad /* this */
    override fun setDisplaySize(width: Number, height: Number): Quad /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): Quad /* this */
    override fun setTexture(key: String, frame: integer): Quad /* this */
    override fun setTexture(key: Texture, frame: String): Quad /* this */
    override fun setTexture(key: Texture, frame: integer): Quad /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Quad /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Quad /* this */
    override fun setRotation(radians: Number): Quad /* this */
    override fun setAngle(degrees: Number): Quad /* this */
    override fun setScale(x: Number, y: Number): Quad /* this */
    override fun setX(value: Number): Quad /* this */
    override fun setY(value: Number): Quad /* this */
    override fun setZ(value: Number): Quad /* this */
    override fun setW(value: Number): Quad /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Quad /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Quad /* this */
    override fun setTexture(key: String): Quad /* this */
    override fun setTexture(key: Texture): Quad /* this */
}

open external class RenderTexture(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, width: integer = definedExternally, height: integer = definedExternally) : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Tint, Transform, Visible {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var textureManager: TextureManager
    open var globalTint: Number
    open var globalAlpha: Number
    open var canvas: HTMLCanvasElement
    open var framebuffer: WebGLFramebuffer
    open var dirty: Boolean
    override var texture: Texture
    override var frame: Frame
    open var context: CanvasRenderingContext2D
    open var camera: BaseCamera
    open var gl: WebGLRenderingContext
    open var glTexture: WebGLTexture
    override fun setSize(width: Number, height: Number): RenderTexture /* this */
    open fun resize(width: Number, height: Number = definedExternally): RenderTexture /* this */
    open fun setGlobalTint(tint: integer): RenderTexture /* this */
    open fun setGlobalAlpha(alpha: Number): RenderTexture /* this */
    open fun saveTexture(key: String): Texture
    open fun fill(rgb: Number, alpha: Number = definedExternally, x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally): RenderTexture /* this */
    open fun clear(): RenderTexture /* this */
    open fun erase(entries: Any, x: Number = definedExternally, y: Number = definedExternally): RenderTexture /* this */
    open fun draw(entries: Any, x: Number = definedExternally, y: Number = definedExternally, alpha: Number = definedExternally, tint: Number = definedExternally): RenderTexture /* this */
    open fun drawFrame(key: String, frame: String = definedExternally, x: Number = definedExternally, y: Number = definedExternally, alpha: Number = definedExternally, tint: Number = definedExternally): RenderTexture /* this */
    open fun drawFrame(key: String, frame: integer = definedExternally, x: Number = definedExternally, y: Number = definedExternally, alpha: Number = definedExternally, tint: Number = definedExternally): RenderTexture /* this */
    open fun snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): RenderTexture /* this */
    open fun snapshot(callback: SnapshotCallback, type: String = definedExternally, encoderOptions: Number = definedExternally): RenderTexture /* this */
    open fun snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): RenderTexture /* this */
    open fun preDestroy()
    override fun clearAlpha(): RenderTexture /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): RenderTexture /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): RenderTexture /* this */
    override fun setBlendMode(value: BlendModes): RenderTexture /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setDisplaySize(width: Number, height: Number): RenderTexture /* this */
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): RenderTexture /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): RenderTexture /* this */
    override var depth: Number
    override fun setDepth(value: integer): RenderTexture /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): RenderTexture /* this */
    override fun toggleFlipY(): RenderTexture /* this */
    override fun setFlipX(value: Boolean): RenderTexture /* this */
    override fun setFlipY(value: Boolean): RenderTexture /* this */
    override fun setFlip(x: Boolean, y: Boolean): RenderTexture /* this */
    override fun resetFlip(): RenderTexture /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): RenderTexture /* this */
    override fun setMask(mask: GeometryMask): RenderTexture /* this */
    override fun clearMask(destroyMask: Boolean): RenderTexture /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): RenderTexture /* this */
    override fun setOriginFromFrame(): RenderTexture /* this */
    override fun setDisplayOrigin(x: Number, y: Number): RenderTexture /* this */
    override fun updateDisplayOrigin(): RenderTexture /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): RenderTexture /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): RenderTexture /* this */
    override var tintFill: Boolean
    override fun clearTint(): RenderTexture /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): RenderTexture /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): RenderTexture /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): RenderTexture /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): RenderTexture /* this */
    override fun setRotation(radians: Number): RenderTexture /* this */
    override fun setAngle(degrees: Number): RenderTexture /* this */
    override fun setScale(x: Number, y: Number): RenderTexture /* this */
    override fun setX(value: Number): RenderTexture /* this */
    override fun setY(value: Number): RenderTexture /* this */
    override fun setZ(value: Number): RenderTexture /* this */
    override fun setW(value: Number): RenderTexture /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): RenderTexture /* this */
    open fun drawFrame(key: String): RenderTexture /* this */
    override fun setCrop(): RenderTexture /* this */
}

open external class Rope : GameObject, AlphaSingle, BlendMode, Depth, Flip, Mask, Pipeline, Size, Phaser.GameObjects.Components.Texture, Transform, Visible, ScrollFactor {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String, points: integer, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String, points: Array<Vector2Like>, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer, points: integer, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer, points: Array<Vector2Like>, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Nothing?, points: integer, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Nothing?, points: Array<Vector2Like>, horizontal: Boolean, colors: Array<Number>, alphas: Array<Number>)
    open var anims: Animation
    open var points: Array<Vector2Like>
    open var vertices: Float32Array
    open var uv: Float32Array
    open var colors: Uint32Array
    open var alphas: Float32Array
    open var tintFill: integer
    open var dirty: Boolean
    open var horizontal: Boolean
    open var debugCallback: Function<*>
    open var debugGraphic: Graphics
    open fun preUpdate(time: Number, delta: Number)
    open fun play(key: String, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): Rope /* this */
    open fun setDirty(): Rope /* this */
    open fun setHorizontal(points: integer = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setHorizontal(points: integer = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setHorizontal(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setHorizontal(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setHorizontal(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setHorizontal(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setHorizontal(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setHorizontal(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setVertical(points: integer = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setVertical(points: integer = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setVertical(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setVertical(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setVertical(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setVertical(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setVertical(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setVertical(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setTintFill(value: integer = definedExternally): Rope /* this */
    open fun setAlphas(alphas: Number = definedExternally, bottomAlpha: Number = definedExternally): Rope /* this */
    open fun setAlphas(alphas: Array<Number> = definedExternally, bottomAlpha: Number = definedExternally): Rope /* this */
    open fun setColors(colors: Number = definedExternally): Rope /* this */
    open fun setColors(colors: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(points: integer = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setPoints(points: integer = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setPoints(points: integer = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setPoints(points: Array<Vector2Like> = definedExternally, colors: Number = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Number = definedExternally): Rope /* this */
    open fun setPoints(points: Array<Vector2Like> = definedExternally, colors: Array<Number> = definedExternally, alphas: Array<Number> = definedExternally): Rope /* this */
    open fun updateUVs(): Rope /* this */
    open fun resizeArrays(newSize: integer): Rope /* this */
    open fun updateVertices(): Rope /* this */
    open fun setDebug(graphic: Graphics = definedExternally, callback: Function<*> = definedExternally): Rope /* this */
    open fun renderDebugVerts(src: Rope, meshLength: integer, verts: Array<Number>)
    override var flipX: Boolean
    override var flipY: Boolean
    override fun clearAlpha(): Rope /* this */
    override fun setAlpha(value: Number): Rope /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Rope /* this */
    override fun setBlendMode(value: BlendModes): Rope /* this */
    override var depth: Number
    override fun setDepth(value: integer): Rope /* this */
    override fun toggleFlipX(): Rope /* this */
    override fun toggleFlipY(): Rope /* this */
    override fun setFlipX(value: Boolean): Rope /* this */
    override fun setFlipY(value: Boolean): Rope /* this */
    override fun setFlip(x: Boolean, y: Boolean): Rope /* this */
    override fun resetFlip(): Rope /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Rope /* this */
    override fun setMask(mask: GeometryMask): Rope /* this */
    override fun clearMask(destroyMask: Boolean): Rope /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Rope /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Rope /* this */
    override fun setSize(width: Number, height: Number): Rope /* this */
    override fun setDisplaySize(width: Number, height: Number): Rope /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): Rope /* this */
    override fun setTexture(key: String, frame: integer): Rope /* this */
    override fun setTexture(key: Texture, frame: String): Rope /* this */
    override fun setTexture(key: Texture, frame: integer): Rope /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Rope /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Rope /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Rope /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Rope /* this */
    override fun setRotation(radians: Number): Rope /* this */
    override fun setAngle(degrees: Number): Rope /* this */
    override fun setScale(x: Number, y: Number): Rope /* this */
    override fun setX(value: Number): Rope /* this */
    override fun setY(value: Number): Rope /* this */
    override fun setZ(value: Number): Rope /* this */
    override fun setW(value: Number): Rope /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Rope /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Rope /* this */
    open fun setHorizontal(): Rope /* this */
    open fun setVertical(): Rope /* this */
    open fun setAlphas(): Rope /* this */
    open fun setColors(): Rope /* this */
    open fun setPoints(): Rope /* this */
    override fun setTexture(key: String): Rope /* this */
    override fun setTexture(key: Texture): Rope /* this */
}

open external class Shader : GameObject, ComputedSize, Depth, GetBounds, Mask, Origin, ScrollFactor, Transform, Visible {
    constructor(scene: Scene, key: String, x: Number, y: Number, width: Number, height: Number, textures: Array<String>, textureData: Any)
    constructor(scene: Scene, key: BaseShader, x: Number, y: Number, width: Number, height: Number, textures: Array<String>, textureData: Any)
    open var shader: BaseShader
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var gl: WebGLRenderingContext
    open var vertexData: ArrayBuffer
    open var vertexBuffer: WebGLBuffer
    open var program: WebGLProgram
    open var bytes: Uint8Array
    open var vertexViewF32: Float32Array
    open var viewMatrix: Float32Array
    open var projectionMatrix: Float32Array
    open var uniforms: Any
    open var pointer: Pointer
    open var framebuffer: WebGLFramebuffer
    open var glTexture: WebGLTexture
    open var renderToTexture: Boolean
    open var texture: Texture
    override fun willRender(camera: Camera): Boolean
    open fun setRenderToTexture(key: String = definedExternally, flipY: Boolean = definedExternally): Shader /* this */
    open fun setShader(key: String, textures: Array<String> = definedExternally, textureData: Any = definedExternally): Shader /* this */
    open fun setShader(key: BaseShader, textures: Array<String> = definedExternally, textureData: Any = definedExternally): Shader /* this */
    open fun setPointer(pointer: Pointer = definedExternally): Shader /* this */
    open fun projOrtho(left: Number, right: Number, bottom: Number, top: Number)
    open fun setSampler2DBuffer(uniformKey: String, texture: WebGLTexture, width: integer, height: integer, textureIndex: integer = definedExternally, textureData: Any = definedExternally): Shader /* this */
    open fun setSampler2D(uniformKey: String, textureKey: String, textureIndex: integer = definedExternally, textureData: Any = definedExternally): Shader /* this */
    open fun setUniform(key: String, value: Any): Shader /* this */
    open fun getUniform(key: String): Any
    open fun setChannel0(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel1(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel2(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel3(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun load(matrix2D: TransformMatrix = definedExternally)
    open fun flush()
    open fun preDestroy()
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Shader /* this */
    override fun setDisplaySize(width: Number, height: Number): Shader /* this */
    override var depth: Number
    override fun setDepth(value: integer): Shader /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Shader /* this */
    override fun setMask(mask: GeometryMask): Shader /* this */
    override fun clearMask(destroyMask: Boolean): Shader /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Shader /* this */
    override fun setOriginFromFrame(): Shader /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Shader /* this */
    override fun updateDisplayOrigin(): Shader /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Shader /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Shader /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Shader /* this */
    override fun setRotation(radians: Number): Shader /* this */
    override fun setAngle(degrees: Number): Shader /* this */
    override fun setScale(x: Number, y: Number): Shader /* this */
    override fun setX(value: Number): Shader /* this */
    override fun setY(value: Number): Shader /* this */
    override fun setZ(value: Number): Shader /* this */
    override fun setW(value: Number): Shader /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Shader /* this */
}

open external class Arc(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, radius: Number = definedExternally, startAngle: integer = definedExternally, endAngle: integer = definedExternally, anticlockwise: Boolean = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open var iterations: Number
    open var radius: Number
    open var startAngle: integer
    open var endAngle: integer
    open var anticlockwise: Boolean
    open fun setRadius(value: Number): Arc /* this */
    open fun setIterations(value: Number): Arc /* this */
    open fun setStartAngle(value: integer): Arc /* this */
    open fun setEndAngle(value: integer): Arc /* this */
    override fun clearAlpha(): Arc /* this */
    override fun setAlpha(value: Number): Arc /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Arc /* this */
    override fun setBlendMode(value: BlendModes): Arc /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Arc /* this */
    override fun setDisplaySize(width: Number, height: Number): Arc /* this */
    override var depth: Number
    override fun setDepth(value: integer): Arc /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Arc /* this */
    override fun setMask(mask: GeometryMask): Arc /* this */
    override fun clearMask(destroyMask: Boolean): Arc /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Arc /* this */
    override fun setOriginFromFrame(): Arc /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Arc /* this */
    override fun updateDisplayOrigin(): Arc /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Arc /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Arc /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Arc /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Arc /* this */
    override fun setRotation(radians: Number): Arc /* this */
    override fun setAngle(degrees: Number): Arc /* this */
    override fun setScale(x: Number, y: Number): Arc /* this */
    override fun setX(value: Number): Arc /* this */
    override fun setY(value: Number): Arc /* this */
    override fun setZ(value: Number): Arc /* this */
    override fun setW(value: Number): Arc /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Arc /* this */
}

open external class Curve(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, curve: Phaser.Curves.Curve = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open var smoothness: integer
    open fun setSmoothness(value: integer): Curve /* this */
    override fun clearAlpha(): Curve /* this */
    override fun setAlpha(value: Number): Curve /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Curve /* this */
    override fun setBlendMode(value: BlendModes): Curve /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Curve /* this */
    override fun setDisplaySize(width: Number, height: Number): Curve /* this */
    override var depth: Number
    override fun setDepth(value: integer): Curve /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Curve /* this */
    override fun setMask(mask: GeometryMask): Curve /* this */
    override fun clearMask(destroyMask: Boolean): Curve /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Curve /* this */
    override fun setOriginFromFrame(): Curve /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Curve /* this */
    override fun updateDisplayOrigin(): Curve /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Curve /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Curve /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Curve /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Curve /* this */
    override fun setRotation(radians: Number): Curve /* this */
    override fun setAngle(degrees: Number): Curve /* this */
    override fun setScale(x: Number, y: Number): Curve /* this */
    override fun setX(value: Number): Curve /* this */
    override fun setY(value: Number): Curve /* this */
    override fun setZ(value: Number): Curve /* this */
    override fun setW(value: Number): Curve /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Curve /* this */
}

open external class Ellipse(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open var smoothness: integer
    override fun setSize(width: Number, height: Number): Ellipse /* this */
    open fun setSmoothness(value: integer): Ellipse /* this */
    override fun clearAlpha(): Ellipse /* this */
    override fun setAlpha(value: Number): Ellipse /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Ellipse /* this */
    override fun setBlendMode(value: BlendModes): Ellipse /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setDisplaySize(width: Number, height: Number): Ellipse /* this */
    override var depth: Number
    override fun setDepth(value: integer): Ellipse /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Ellipse /* this */
    override fun setMask(mask: GeometryMask): Ellipse /* this */
    override fun clearMask(destroyMask: Boolean): Ellipse /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Ellipse /* this */
    override fun setOriginFromFrame(): Ellipse /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Ellipse /* this */
    override fun updateDisplayOrigin(): Ellipse /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Ellipse /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Ellipse /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Ellipse /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Ellipse /* this */
    override fun setRotation(radians: Number): Ellipse /* this */
    override fun setAngle(degrees: Number): Ellipse /* this */
    override fun setScale(x: Number, y: Number): Ellipse /* this */
    override fun setX(value: Number): Ellipse /* this */
    override fun setY(value: Number): Ellipse /* this */
    override fun setZ(value: Number): Ellipse /* this */
    override fun setW(value: Number): Ellipse /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Ellipse /* this */
}

open external class Grid(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, width: Number = definedExternally, height: Number = definedExternally, cellWidth: Number = definedExternally, cellHeight: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally, outlineFillColor: Number = definedExternally, outlineFillAlpha: Number = definedExternally) : Shape {
    open var cellWidth: Number
    open var cellHeight: Number
    open var showCells: Boolean
    open var outlineFillColor: Number
    open var outlineFillAlpha: Number
    open var showOutline: Boolean
    open var showAltCells: Boolean
    open var altFillColor: Number
    open var altFillAlpha: Number
    override fun setFillStyle(fillColor: Number, fillAlpha: Number): Grid /* this */
    open fun setAltFillStyle(fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Grid /* this */
    open fun setOutlineStyle(fillColor: Number = definedExternally, fillAlpha: Number = definedExternally): Grid /* this */
    override fun clearAlpha(): Grid /* this */
    override fun setAlpha(value: Number): Grid /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Grid /* this */
    override fun setBlendMode(value: BlendModes): Grid /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Grid /* this */
    override fun setDisplaySize(width: Number, height: Number): Grid /* this */
    override var depth: Number
    override fun setDepth(value: integer): Grid /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Grid /* this */
    override fun setMask(mask: GeometryMask): Grid /* this */
    override fun clearMask(destroyMask: Boolean): Grid /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Grid /* this */
    override fun setOriginFromFrame(): Grid /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Grid /* this */
    override fun updateDisplayOrigin(): Grid /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Grid /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Grid /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Grid /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Grid /* this */
    override fun setRotation(radians: Number): Grid /* this */
    override fun setAngle(degrees: Number): Grid /* this */
    override fun setScale(x: Number, y: Number): Grid /* this */
    override fun setX(value: Number): Grid /* this */
    override fun setY(value: Number): Grid /* this */
    override fun setZ(value: Number): Grid /* this */
    override fun setW(value: Number): Grid /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Grid /* this */
}

open external class IsoBox(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, size: Number = definedExternally, height: Number = definedExternally, fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally) : Shape {
    open var projection: integer
    open var fillTop: Number
    open var fillLeft: Number
    open var fillRight: Number
    open var showTop: Boolean
    open var showLeft: Boolean
    open var showRight: Boolean
    open fun setProjection(value: integer): IsoBox /* this */
    open fun setFaces(showTop: Boolean = definedExternally, showLeft: Boolean = definedExternally, showRight: Boolean = definedExternally): IsoBox /* this */
    open fun setFillStyle(fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally): IsoBox /* this */
    override fun clearAlpha(): IsoBox /* this */
    override fun setAlpha(value: Number): IsoBox /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): IsoBox /* this */
    override fun setBlendMode(value: BlendModes): IsoBox /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): IsoBox /* this */
    override fun setDisplaySize(width: Number, height: Number): IsoBox /* this */
    override var depth: Number
    override fun setDepth(value: integer): IsoBox /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): IsoBox /* this */
    override fun setMask(mask: GeometryMask): IsoBox /* this */
    override fun clearMask(destroyMask: Boolean): IsoBox /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): IsoBox /* this */
    override fun setOriginFromFrame(): IsoBox /* this */
    override fun setDisplayOrigin(x: Number, y: Number): IsoBox /* this */
    override fun updateDisplayOrigin(): IsoBox /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): IsoBox /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): IsoBox /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): IsoBox /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): IsoBox /* this */
    override fun setRotation(radians: Number): IsoBox /* this */
    override fun setAngle(degrees: Number): IsoBox /* this */
    override fun setScale(x: Number, y: Number): IsoBox /* this */
    override fun setX(value: Number): IsoBox /* this */
    override fun setY(value: Number): IsoBox /* this */
    override fun setZ(value: Number): IsoBox /* this */
    override fun setW(value: Number): IsoBox /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): IsoBox /* this */
}

open external class IsoTriangle(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, size: Number = definedExternally, height: Number = definedExternally, reversed: Boolean = definedExternally, fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally) : Shape {
    open var projection: integer
    open var fillTop: Number
    open var fillLeft: Number
    open var fillRight: Number
    open var showTop: Boolean
    open var showLeft: Boolean
    open var showRight: Boolean
    open var isReversed: Boolean
    open fun setProjection(value: integer): IsoTriangle /* this */
    open fun setReversed(reversed: Boolean): IsoTriangle /* this */
    open fun setFaces(showTop: Boolean = definedExternally, showLeft: Boolean = definedExternally, showRight: Boolean = definedExternally): IsoTriangle /* this */
    open fun setFillStyle(fillTop: Number = definedExternally, fillLeft: Number = definedExternally, fillRight: Number = definedExternally): IsoTriangle /* this */
    override fun clearAlpha(): IsoTriangle /* this */
    override fun setAlpha(value: Number): IsoTriangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): IsoTriangle /* this */
    override fun setBlendMode(value: BlendModes): IsoTriangle /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): IsoTriangle /* this */
    override fun setDisplaySize(width: Number, height: Number): IsoTriangle /* this */
    override var depth: Number
    override fun setDepth(value: integer): IsoTriangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): IsoTriangle /* this */
    override fun setMask(mask: GeometryMask): IsoTriangle /* this */
    override fun clearMask(destroyMask: Boolean): IsoTriangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): IsoTriangle /* this */
    override fun setOriginFromFrame(): IsoTriangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): IsoTriangle /* this */
    override fun updateDisplayOrigin(): IsoTriangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): IsoTriangle /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): IsoTriangle /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): IsoTriangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): IsoTriangle /* this */
    override fun setRotation(radians: Number): IsoTriangle /* this */
    override fun setAngle(degrees: Number): IsoTriangle /* this */
    override fun setScale(x: Number, y: Number): IsoTriangle /* this */
    override fun setX(value: Number): IsoTriangle /* this */
    override fun setY(value: Number): IsoTriangle /* this */
    override fun setZ(value: Number): IsoTriangle /* this */
    override fun setW(value: Number): IsoTriangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): IsoTriangle /* this */
}

open external class Line(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, strokeColor: Number = definedExternally, strokeAlpha: Number = definedExternally) : Shape {
    override var lineWidth: Number
    open fun setLineWidth(startWidth: Number, endWidth: Number = definedExternally): Line /* this */
    open fun setTo(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally): Line /* this */
    override fun clearAlpha(): Line /* this */
    override fun setAlpha(value: Number): Line /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Line /* this */
    override fun setBlendMode(value: BlendModes): Line /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Line /* this */
    override fun setDisplaySize(width: Number, height: Number): Line /* this */
    override var depth: Number
    override fun setDepth(value: integer): Line /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Line /* this */
    override fun setMask(mask: GeometryMask): Line /* this */
    override fun clearMask(destroyMask: Boolean): Line /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Line /* this */
    override fun setOriginFromFrame(): Line /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Line /* this */
    override fun updateDisplayOrigin(): Line /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Line /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Line /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Line /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Line /* this */
    override fun setRotation(radians: Number): Line /* this */
    override fun setAngle(degrees: Number): Line /* this */
    override fun setScale(x: Number, y: Number): Line /* this */
    override fun setX(value: Number): Line /* this */
    override fun setY(value: Number): Line /* this */
    override fun setZ(value: Number): Line /* this */
    override fun setW(value: Number): Line /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Line /* this */
}

open external class Polygon(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, points: Any = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open fun smooth(iterations: integer = definedExternally): Polygon /* this */
    override fun clearAlpha(): Polygon /* this */
    override fun setAlpha(value: Number): Polygon /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Polygon /* this */
    override fun setBlendMode(value: BlendModes): Polygon /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Polygon /* this */
    override fun setDisplaySize(width: Number, height: Number): Polygon /* this */
    override var depth: Number
    override fun setDepth(value: integer): Polygon /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Polygon /* this */
    override fun setMask(mask: GeometryMask): Polygon /* this */
    override fun clearMask(destroyMask: Boolean): Polygon /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Polygon /* this */
    override fun setOriginFromFrame(): Polygon /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Polygon /* this */
    override fun updateDisplayOrigin(): Polygon /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Polygon /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Polygon /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Polygon /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Polygon /* this */
    override fun setRotation(radians: Number): Polygon /* this */
    override fun setAngle(degrees: Number): Polygon /* this */
    override fun setScale(x: Number, y: Number): Polygon /* this */
    override fun setX(value: Number): Polygon /* this */
    override fun setY(value: Number): Polygon /* this */
    override fun setZ(value: Number): Polygon /* this */
    override fun setW(value: Number): Polygon /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Polygon /* this */
}

open external class Rectangle(scene: Phaser.Scene, x: Number, y: Number, width: Number = definedExternally, height: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    override fun clearAlpha(): Rectangle /* this */
    override fun setAlpha(value: Number): Rectangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Rectangle /* this */
    override fun setBlendMode(value: BlendModes): Rectangle /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Rectangle /* this */
    override fun setDisplaySize(width: Number, height: Number): Rectangle /* this */
    override var depth: Number
    override fun setDepth(value: integer): Rectangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Rectangle /* this */
    override fun setMask(mask: GeometryMask): Rectangle /* this */
    override fun clearMask(destroyMask: Boolean): Rectangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Rectangle /* this */
    override fun setOriginFromFrame(): Rectangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Rectangle /* this */
    override fun updateDisplayOrigin(): Rectangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Rectangle /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Rectangle /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Rectangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Rectangle /* this */
    override fun setRotation(radians: Number): Rectangle /* this */
    override fun setAngle(degrees: Number): Rectangle /* this */
    override fun setScale(x: Number, y: Number): Rectangle /* this */
    override fun setX(value: Number): Rectangle /* this */
    override fun setY(value: Number): Rectangle /* this */
    override fun setZ(value: Number): Rectangle /* this */
    override fun setW(value: Number): Rectangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Rectangle /* this */
}

open external class Shape(scene: Phaser.Scene, type: String = definedExternally, data: Any = definedExternally) : GameObject, AlphaSingle, BlendMode, ComputedSize, Depth, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Transform, Visible {
    override var data: DataManager
    open var pathData: Array<Number>
    open var pathIndexes: Array<integer>
    open var fillColor: Number
    open var fillAlpha: Number
    open var strokeColor: Number
    open var strokeAlpha: Number
    open var lineWidth: Number
    open var isFilled: Boolean
    open var isStroked: Boolean
    open var closePath: Boolean
    open fun setFillStyle(color: Number = definedExternally, alpha: Number = definedExternally): Shape /* this */
    open fun setStrokeStyle(lineWidth: Number = definedExternally, color: Number = definedExternally, alpha: Number = definedExternally): Shape /* this */
    open fun setClosePath(value: Boolean): Shape /* this */
    open fun preDestroy()
    override fun clearAlpha(): Shape /* this */
    override fun setAlpha(value: Number): Shape /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Shape /* this */
    override fun setBlendMode(value: BlendModes): Shape /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Shape /* this */
    override fun setDisplaySize(width: Number, height: Number): Shape /* this */
    override var depth: Number
    override fun setDepth(value: integer): Shape /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Shape /* this */
    override fun setMask(mask: GeometryMask): Shape /* this */
    override fun clearMask(destroyMask: Boolean): Shape /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Shape /* this */
    override fun setOriginFromFrame(): Shape /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Shape /* this */
    override fun updateDisplayOrigin(): Shape /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Shape /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Shape /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Shape /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Shape /* this */
    override fun setRotation(radians: Number): Shape /* this */
    override fun setAngle(degrees: Number): Shape /* this */
    override fun setScale(x: Number, y: Number): Shape /* this */
    override fun setX(value: Number): Shape /* this */
    override fun setY(value: Number): Shape /* this */
    override fun setZ(value: Number): Shape /* this */
    override fun setW(value: Number): Shape /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Shape /* this */
}

open external class Star(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, points: Number = definedExternally, innerRadius: Number = definedExternally, outerRadius: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open fun setPoints(value: integer): Star /* this */
    open fun setInnerRadius(value: Number): Star /* this */
    open fun setOuterRadius(value: Number): Star /* this */
    open var points: integer
    open var innerRadius: Number
    open var outerRadius: Number
    override fun clearAlpha(): Star /* this */
    override fun setAlpha(value: Number): Star /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Star /* this */
    override fun setBlendMode(value: BlendModes): Star /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Star /* this */
    override fun setDisplaySize(width: Number, height: Number): Star /* this */
    override var depth: Number
    override fun setDepth(value: integer): Star /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Star /* this */
    override fun setMask(mask: GeometryMask): Star /* this */
    override fun clearMask(destroyMask: Boolean): Star /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Star /* this */
    override fun setOriginFromFrame(): Star /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Star /* this */
    override fun updateDisplayOrigin(): Star /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Star /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Star /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Star /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Star /* this */
    override fun setRotation(radians: Number): Star /* this */
    override fun setAngle(degrees: Number): Star /* this */
    override fun setScale(x: Number, y: Number): Star /* this */
    override fun setX(value: Number): Star /* this */
    override fun setY(value: Number): Star /* this */
    override fun setZ(value: Number): Star /* this */
    override fun setW(value: Number): Star /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Star /* this */
}

open external class Triangle(scene: Phaser.Scene, x: Number = definedExternally, y: Number = definedExternally, x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, x3: Number = definedExternally, y3: Number = definedExternally, fillColor: Number = definedExternally, fillAlpha: Number = definedExternally) : Shape {
    open fun setTo(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally, x3: Number = definedExternally, y3: Number = definedExternally): Triangle /* this */
    override fun clearAlpha(): Triangle /* this */
    override fun setAlpha(value: Number): Triangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Triangle /* this */
    override fun setBlendMode(value: BlendModes): Triangle /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Triangle /* this */
    override fun setDisplaySize(width: Number, height: Number): Triangle /* this */
    override var depth: Number
    override fun setDepth(value: integer): Triangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Triangle /* this */
    override fun setMask(mask: GeometryMask): Triangle /* this */
    override fun clearMask(destroyMask: Boolean): Triangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Triangle /* this */
    override fun setOriginFromFrame(): Triangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Triangle /* this */
    override fun updateDisplayOrigin(): Triangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Triangle /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Triangle /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Triangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Triangle /* this */
    override fun setRotation(radians: Number): Triangle /* this */
    override fun setAngle(degrees: Number): Triangle /* this */
    override fun setScale(x: Number, y: Number): Triangle /* this */
    override fun setX(value: Number): Triangle /* this */
    override fun setY(value: Number): Triangle /* this */
    override fun setZ(value: Number): Triangle /* this */
    override fun setW(value: Number): Triangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Triangle /* this */
}

open external class Sprite : GameObject, Alpha, BlendMode, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Size, TextureCrop, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer)
    open var anims: Animation
    open fun preUpdate(time: Number, delta: Number)
    open fun play(key: String, ignoreIfPlaying: Boolean = definedExternally, startFrame: integer = definedExternally): Sprite /* this */
    override fun toJSON(): JSONGameObject
    override fun clearAlpha(): Sprite /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Sprite /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Sprite /* this */
    override fun setBlendMode(value: BlendModes): Sprite /* this */
    override var depth: Number
    override fun setDepth(value: integer): Sprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Sprite /* this */
    override fun toggleFlipY(): Sprite /* this */
    override fun setFlipX(value: Boolean): Sprite /* this */
    override fun setFlipY(value: Boolean): Sprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): Sprite /* this */
    override fun resetFlip(): Sprite /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Sprite /* this */
    override fun setMask(mask: GeometryMask): Sprite /* this */
    override fun clearMask(destroyMask: Boolean): Sprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Sprite /* this */
    override fun setOriginFromFrame(): Sprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Sprite /* this */
    override fun updateDisplayOrigin(): Sprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Sprite /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Sprite /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Sprite /* this */
    override fun setSize(width: Number, height: Number): Sprite /* this */
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setTexture(key: String, frame: String): Sprite /* this */
    override fun setTexture(key: String, frame: integer): Sprite /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Sprite /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Sprite /* this */
    override var tintFill: Boolean
    override fun clearTint(): Sprite /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Sprite /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Sprite /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Sprite /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setRotation(radians: Number): Sprite /* this */
    override fun setAngle(degrees: Number): Sprite /* this */
    override fun setScale(x: Number, y: Number): Sprite /* this */
    override fun setX(value: Number): Sprite /* this */
    override fun setY(value: Number): Sprite /* this */
    override fun setZ(value: Number): Sprite /* this */
    override fun setW(value: Number): Sprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Sprite /* this */
    override fun setCrop(): Sprite /* this */
    override fun setTexture(key: String): Sprite /* this */
}

open external class Text(scene: Scene, x: Number, y: Number, text: dynamic/* String | Array<String> */, style: Phaser.Types.GameObjects.Text.TextStyle) : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Tint, Transform, Visible {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var style: TextStyle
    open var autoRound: Boolean
    open var splitRegExp: Any?
    open var padding: Any
    override var width: Number
    override var height: Number
    open var lineSpacing: Number
    open var dirty: Boolean
    open fun initRTL()
    open fun runWordWrap(text: String): String
    open fun advancedWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String
    open fun basicWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String
    open fun getWrappedText(text: String): Array<String>
    open fun setText(value: String): Text /* this */
    open fun setText(value: Array<String>): Text /* this */
    open fun setStyle(style: Any?): Text /* this */
    open fun setFont(font: String): Text /* this */
    open fun setFontFamily(family: String): Text /* this */
    open fun setFontSize(size: Number): Text /* this */
    open fun setFontStyle(style: String): Text /* this */
    open fun setFixedSize(width: Number, height: Number): Text /* this */
    open fun setBackgroundColor(color: String): Text /* this */
    open fun setFill(color: String): Text /* this */
    open fun setFill(color: Any): Text /* this */
    open fun setColor(color: String): Text /* this */
    open fun setStroke(color: String, thickness: Number): Text /* this */
    open fun setShadow(x: Number = definedExternally, y: Number = definedExternally, color: String = definedExternally, blur: Number = definedExternally, shadowStroke: Boolean = definedExternally, shadowFill: Boolean = definedExternally): Text /* this */
    open fun setShadowOffset(x: Number, y: Number): Text /* this */
    open fun setShadowColor(color: String): Text /* this */
    open fun setShadowBlur(blur: Number): Text /* this */
    open fun setShadowStroke(enabled: Boolean): Text /* this */
    open fun setShadowFill(enabled: Boolean): Text /* this */
    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean = definedExternally): Text /* this */
    open fun setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: Any? = definedExternally): Text /* this */
    open fun setAlign(align: String = definedExternally): Text /* this */
    open fun setResolution(value: Number): Text /* this */
    open fun setLineSpacing(value: Number): Text /* this */
    open fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Text /* this */
    open fun setPadding(left: TextPadding, top: Number, right: Number, bottom: Number): Text /* this */
    open fun setMaxLines(max: integer = definedExternally): Text /* this */
    open fun updateText(): Text /* this */
    open fun getTextMetrics(): Any?
    open var text: String
    override fun toJSON(): JSONGameObject
    open fun preDestroy()
    override fun clearAlpha(): Text /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Text /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Text /* this */
    override fun setBlendMode(value: BlendModes): Text /* this */
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Text /* this */
    override fun setDisplaySize(width: Number, height: Number): Text /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Text /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): Text /* this */
    override var depth: Number
    override fun setDepth(value: integer): Text /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Text /* this */
    override fun toggleFlipY(): Text /* this */
    override fun setFlipX(value: Boolean): Text /* this */
    override fun setFlipY(value: Boolean): Text /* this */
    override fun setFlip(x: Boolean, y: Boolean): Text /* this */
    override fun resetFlip(): Text /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Text /* this */
    override fun setMask(mask: GeometryMask): Text /* this */
    override fun clearMask(destroyMask: Boolean): Text /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Text /* this */
    override fun setOriginFromFrame(): Text /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Text /* this */
    override fun updateDisplayOrigin(): Text /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Text /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Text /* this */
    override var tintFill: Boolean
    override fun clearTint(): Text /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Text /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Text /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Text /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Text /* this */
    override fun setRotation(radians: Number): Text /* this */
    override fun setAngle(degrees: Number): Text /* this */
    override fun setScale(x: Number, y: Number): Text /* this */
    override fun setX(value: Number): Text /* this */
    override fun setY(value: Number): Text /* this */
    override fun setZ(value: Number): Text /* this */
    override fun setW(value: Number): Text /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Text /* this */
    override fun setCrop(): Text /* this */

    companion object {
        fun GetTextSize(text: Text, size: TextMetrics, lines: Array<Any>): Any?
        fun MeasureText(textStyle: TextStyle): TextMetrics
    }
}

open external class TextStyle(text: Phaser.GameObjects.Text, style: Phaser.Types.GameObjects.Text.TextStyle) {
    open var parent: Text
    open var fontFamily: String
    open var fontSize: String
    open var fontStyle: String
    open var backgroundColor: String
    open var color: String
    open var stroke: String
    open var strokeThickness: Number
    open var shadowOffsetX: Number
    open var shadowOffsetY: Number
    open var shadowColor: String
    open var shadowBlur: Number
    open var shadowStroke: Boolean
    open var shadowFill: Boolean
    open var align: String
    open var maxLines: integer
    open var fixedWidth: Number
    open var fixedHeight: Number
    open var resolution: Number
    open var rtl: Boolean
    open var testString: String
    open var baselineX: Number
    open var baselineY: Number
    open fun setStyle(style: Phaser.Types.GameObjects.Text.TextStyle, updateText: Boolean = definedExternally, setDefaults: Boolean = definedExternally): Text
    open fun syncFont(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D)
    open fun syncStyle(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D)
    open fun syncShadow(context: CanvasRenderingContext2D, enabled: Boolean)
    open fun update(recalculateMetrics: Boolean): Text
    open fun setFont(font: String, updateText: Boolean = definedExternally): Text
    open fun setFont(font: Any?, updateText: Boolean = definedExternally): Text
    open fun setFontFamily(family: String): Text
    open fun setFontStyle(style: String): Text
    open fun setFontSize(size: Number): Text
    open fun setFontSize(size: String): Text
    open fun setTestString(string: String): Text
    open fun setFixedSize(width: Number, height: Number): Text
    open fun setBackgroundColor(color: String): Text
    open fun setFill(color: String): Text
    open fun setColor(color: String): Text
    open fun setResolution(value: Number): Text
    open fun setStroke(color: String, thickness: Number): Text
    open fun setShadow(x: Number = definedExternally, y: Number = definedExternally, color: String = definedExternally, blur: Number = definedExternally, shadowStroke: Boolean = definedExternally, shadowFill: Boolean = definedExternally): Text
    open fun setShadowOffset(x: Number = definedExternally, y: Number = definedExternally): Text
    open fun setShadowColor(color: String = definedExternally): Text
    open fun setShadowBlur(blur: Number = definedExternally): Text
    open fun setShadowStroke(enabled: Boolean): Text
    open fun setShadowFill(enabled: Boolean): Text
    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean = definedExternally): Text
    open fun setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: Any? = definedExternally): Text
    open fun setAlign(align: String = definedExternally): Text
    open fun setMaxLines(max: integer = definedExternally): Text
    open fun getTextMetrics(): TextMetrics
    open fun toJSON(): Any?
    open fun destroy()
}

open external class TileSprite : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, width: integer, height: integer, textureKey: String, frameKey: String)
    constructor(scene: Scene, x: Number, y: Number, width: integer, height: integer, textureKey: String, frameKey: integer)
    open var dirty: Boolean
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    open var potWidth: integer
    open var potHeight: integer
    open var fillCanvas: HTMLCanvasElement
    open var fillContext: CanvasRenderingContext2D
    open var fillPattern: dynamic /* WebGLTexture | CanvasPattern */
    open fun setTexture(key: String, frame: String = definedExternally): TileSprite /* this */
    open fun setTexture(key: String, frame: integer = definedExternally): TileSprite /* this */
    open fun setFrame(frame: String): TileSprite /* this */
    open fun setFrame(frame: integer): TileSprite /* this */
    open fun setTilePosition(x: Number = definedExternally, y: Number = definedExternally): TileSprite /* this */
    open fun setTileScale(x: Number = definedExternally, y: Number = definedExternally): TileSprite /* this */
    open fun preDestroy()
    open var tilePositionX: Number
    open var tilePositionY: Number
    open var tileScaleX: Number
    open var tileScaleY: Number
    override fun clearAlpha(): TileSprite /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): TileSprite /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): TileSprite /* this */
    override fun setBlendMode(value: BlendModes): TileSprite /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): TileSprite /* this */
    override fun setDisplaySize(width: Number, height: Number): TileSprite /* this */
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): TileSprite /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): TileSprite /* this */
    override var depth: Number
    override fun setDepth(value: integer): TileSprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): TileSprite /* this */
    override fun toggleFlipY(): TileSprite /* this */
    override fun setFlipX(value: Boolean): TileSprite /* this */
    override fun setFlipY(value: Boolean): TileSprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): TileSprite /* this */
    override fun resetFlip(): TileSprite /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): TileSprite /* this */
    override fun setMask(mask: GeometryMask): TileSprite /* this */
    override fun clearMask(destroyMask: Boolean): TileSprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): TileSprite /* this */
    override fun setOriginFromFrame(): TileSprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): TileSprite /* this */
    override fun updateDisplayOrigin(): TileSprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): TileSprite /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): TileSprite /* this */
    override var tintFill: Boolean
    override fun clearTint(): TileSprite /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): TileSprite /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): TileSprite /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): TileSprite /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): TileSprite /* this */
    override fun setRotation(radians: Number): TileSprite /* this */
    override fun setAngle(degrees: Number): TileSprite /* this */
    override fun setScale(x: Number, y: Number): TileSprite /* this */
    override fun setX(value: Number): TileSprite /* this */
    override fun setY(value: Number): TileSprite /* this */
    override fun setZ(value: Number): TileSprite /* this */
    override fun setW(value: Number): TileSprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): TileSprite /* this */
    open fun setTexture(key: String): TileSprite /* this */
    override fun setCrop(): TileSprite /* this */
}

open external class UpdateList(scene: Phaser.Scene) : ProcessQueue<GameObject> {
    open var scene: Scene
    open var systems: Systems
    open fun sceneUpdate(time: Number, delta: Number)
    override fun shutdown()
    override fun destroy()
}

open external class Video(scene: Phaser.Scene, x: Number, y: Number, key: String = definedExternally) : GameObject, Alpha, BlendMode, Depth, Flip, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Size, TextureCrop, Tint, Transform, Visible {
    open var video: HTMLVideoElement
    open var videoTexture: Texture
    open var videoTextureSource: TextureSource
    open var snapshotTexture: CanvasTexture
    override var flipY: Boolean
    open var touchLocked: Boolean
    open var playWhenUnlocked: Boolean
    open var retryLimit: integer
    open var retry: integer
    open var retryInterval: integer
    open var markers: Any
    open var removeVideoElementOnDestroy: Boolean
    open fun play(loop: Boolean = definedExternally, markerIn: integer = definedExternally, markerOut: integer = definedExternally): Video /* this */
    open fun changeSource(key: String, autoplay: Boolean = definedExternally, loop: Boolean = definedExternally, markerIn: integer = definedExternally, markerOut: integer = definedExternally): Video /* this */
    open fun addMarker(key: String, markerIn: integer, markerOut: integer): Video /* this */
    open fun playMarker(key: String, loop: Boolean = definedExternally): Video /* this */
    open fun removeMarker(key: String): Video /* this */
    open fun snapshot(width: integer = definedExternally, height: integer = definedExternally): CanvasTexture
    open fun snapshotArea(x: integer = definedExternally, y: integer = definedExternally, srcWidth: integer = definedExternally, srcHeight: integer = definedExternally, destWidth: integer = definedExternally, destHeight: integer = definedExternally): CanvasTexture
    open fun saveSnapshotTexture(key: String): CanvasTexture
    open fun loadURL(url: String, loadEvent: String = definedExternally, noAudio: Boolean = definedExternally): Video /* this */
    open fun playHandler()
    open fun completeHandler()
    open fun timeUpdateHandler()
    open fun updateTexture()
    open fun getVideoKey(): String
    open fun seekTo(value: Number): Video /* this */
    open fun getCurrentTime(): Number
    open fun setCurrentTime(value: String): Video /* this */
    open fun setCurrentTime(value: Number): Video /* this */
    open fun isSeeking(): Boolean
    open fun getProgress(): Number
    open fun getDuration(): Number
    open fun setMute(value: Boolean = definedExternally): Video /* this */
    open fun isMuted(): Boolean
    open fun setPaused(value: Boolean = definedExternally): Video /* this */
    open fun getVolume(): Number
    open fun setVolume(value: Number = definedExternally): Video /* this */
    open fun getPlaybackRate(): Number
    open fun setPlaybackRate(rate: Number = definedExternally): Video /* this */
    open fun getLoop(): Boolean
    open fun setLoop(value: Boolean = definedExternally): Video /* this */
    open fun isPlaying(): Boolean
    open fun isPaused(): Boolean
    open fun saveTexture(key: String, flipY: Boolean = definedExternally): Texture
    open fun stop(): Video /* this */
    open fun removeVideoElement()
    override fun clearAlpha(): Video /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Video /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Video /* this */
    override fun setBlendMode(value: BlendModes): Video /* this */
    override var depth: Number
    override fun setDepth(value: integer): Video /* this */
    override var flipX: Boolean
    override fun toggleFlipX(): Video /* this */
    override fun toggleFlipY(): Video /* this */
    override fun setFlipX(value: Boolean): Video /* this */
    override fun setFlipY(value: Boolean): Video /* this */
    override fun setFlip(x: Boolean, y: Boolean): Video /* this */
    override fun resetFlip(): Video /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Video /* this */
    override fun setMask(mask: GeometryMask): Video /* this */
    override fun clearMask(destroyMask: Boolean): Video /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Video /* this */
    override fun setOriginFromFrame(): Video /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Video /* this */
    override fun updateDisplayOrigin(): Video /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Video /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Video /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Video /* this */
    override fun setSize(width: Number, height: Number): Video /* this */
    override fun setDisplaySize(width: Number, height: Number): Video /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Video /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): Video /* this */
    override fun setTexture(key: String, frame: String): Video /* this */
    override fun setTexture(key: String, frame: integer): Video /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Video /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Video /* this */
    override var tintFill: Boolean
    override fun clearTint(): Video /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Video /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Video /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Video /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Video /* this */
    override fun setRotation(radians: Number): Video /* this */
    override fun setAngle(degrees: Number): Video /* this */
    override fun setScale(x: Number, y: Number): Video /* this */
    override fun setX(value: Number): Video /* this */
    override fun setY(value: Number): Video /* this */
    override fun setZ(value: Number): Video /* this */
    override fun setW(value: Number): Video /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Video /* this */
    override fun setCrop(): Video /* this */
    override fun setTexture(key: String): Video /* this */
}

open external class Zone(scene: Phaser.Scene, x: Number, y: Number, width: Number = definedExternally, height: Number = definedExternally) : GameObject, Depth, GetBounds, Origin, Transform, ScrollFactor, Visible {
    open var width: Number
    open var height: Number
    open var blendMode: integer
    open var displayWidth: Number
    open var displayHeight: Number
    open fun setSize(width: Number, height: Number, resizeInput: Boolean = definedExternally): Zone /* this */
    open fun setDisplaySize(width: Number, height: Number): Zone /* this */
    open fun setCircleDropZone(radius: Number): Zone /* this */
    open fun setRectangleDropZone(width: Number, height: Number): Zone /* this */
    open fun setDropZone(shape: Any?, callback: HitAreaCallback): Zone /* this */
    override var depth: Number
    override fun setDepth(value: integer): Zone /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Zone /* this */
    override fun setOriginFromFrame(): Zone /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Zone /* this */
    override fun updateDisplayOrigin(): Zone /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Zone /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Zone /* this */
    override fun setRotation(radians: Number): Zone /* this */
    override fun setAngle(degrees: Number): Zone /* this */
    override fun setScale(x: Number, y: Number): Zone /* this */
    override fun setX(value: Number): Zone /* this */
    override fun setY(value: Number): Zone /* this */
    override fun setZ(value: Number): Zone /* this */
    override fun setW(value: Number): Zone /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Zone /* this */
    override var visible: Boolean
    override fun setVisible(value: Boolean): Zone /* this */
}