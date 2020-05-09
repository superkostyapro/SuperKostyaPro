@file:JsQualifier("Phaser.Animations")

package Phaser.Animations

import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.GameObjects.GameObject
import Phaser.Structs.Map
import Phaser.Textures.Frame
import Phaser.Textures.TextureManager
import Phaser.Types.Animations.*
import Phaser.integer

open external class Animation(manager: Phaser.Animations.AnimationManager, key: String, config: Phaser.Types.Animations.Animation) : EventEmitter {
    open var manager: AnimationManager
    open var key: String
    open var type: String
    open var frames: Array<AnimationFrame>
    open var frameRate: integer
    open var duration: integer
    open var msPerFrame: integer
    open var skipMissedFrames: Boolean
    open var delay: integer
    open var repeat: integer
    open var repeatDelay: integer
    open var yoyo: Boolean
    open var showOnStart: Boolean
    open var hideOnComplete: Boolean
    open var paused: Boolean
    open fun addFrame(config: String): Animation /* this */
    open fun addFrame(config: Array<Phaser.Types.Animations.AnimationFrame>): Animation /* this */
    open fun addFrameAt(index: integer, config: String): Animation /* this */
    open fun addFrameAt(index: integer, config: Array<Phaser.Types.Animations.AnimationFrame>): Animation /* this */
    open fun checkFrame(index: integer): Boolean
    open fun completeAnimation(component: Phaser.GameObjects.Components.Animation)
    open fun getFirstTick(component: Phaser.GameObjects.Components.Animation, includeDelay: Boolean = definedExternally)
    open fun getFrameAt(index: integer): AnimationFrame
    open fun getFrames(textureManager: TextureManager, frames: String, defaultTextureKey: String = definedExternally): Array<AnimationFrame>
    open fun getFrames(textureManager: TextureManager, frames: Array<Phaser.Types.Animations.AnimationFrame>, defaultTextureKey: String = definedExternally): Array<AnimationFrame>
    open fun getNextTick(component: Phaser.GameObjects.Components.Animation)
    open fun getFrameByProgress(value: Number): AnimationFrame
    open fun nextFrame(component: Phaser.GameObjects.Components.Animation)
    open fun getLastFrame(): AnimationFrame
    open fun previousFrame(component: Phaser.GameObjects.Components.Animation)
    open fun removeFrame(frame: AnimationFrame): Animation /* this */
    open fun removeFrameAt(index: integer): Animation /* this */
    open fun repeatAnimation(component: Phaser.GameObjects.Components.Animation)
    open fun setFrame(component: Phaser.GameObjects.Components.Animation)
    open fun toJSON(): JSONAnimation
    open fun updateFrameSequence(): Animation /* this */
    open fun pause(): Animation /* this */
    open fun resume(): Animation /* this */
    override fun destroy()
}

open external class AnimationFrame {
    constructor(textureKey: String, textureFrame: String, index: integer, frame: Frame)
    constructor(textureKey: String, textureFrame: integer, index: integer, frame: Frame)

    open var textureKey: String
    open var textureFrame: dynamic /* String | integer */
    open var index: integer
    open var frame: Frame
    open var isFirst: Boolean
    open var isLast: Boolean
    open var prevFrame: AnimationFrame
    open var nextFrame: AnimationFrame
    open var duration: Number
    open var progress: Number
    open fun toJSON(): JSONAnimationFrame
    open fun destroy()
}

open external class AnimationManager(game: Phaser.Game) : EventEmitter {
    open var game: Game
    open var textureManager: TextureManager
    open var globalTimeScale: Number
    open var anims: Map<String, Animation>
    open var paused: Boolean
    open var name: String
    open fun boot()
    open fun add(key: String, animation: Animation): AnimationManager /* this */
    open fun exists(key: String): Boolean
    open fun create(config: Phaser.Types.Animations.Animation): dynamic /* Phaser.Animations.Animation | Boolean */
    open fun fromJSON(data: String, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun fromJSON(data: JSONAnimations, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun generateFrameNames(key: String, config: GenerateFrameNames = definedExternally): Array<Phaser.Types.Animations.AnimationFrame>
    open fun generateFrameNumbers(key: String, config: GenerateFrameNumbers): Array<Phaser.Types.Animations.AnimationFrame>
    open fun get(key: String): Animation
    open fun load(child: GameObject, key: String, startFrame: String = definedExternally): GameObject
    open fun load(child: GameObject, key: String, startFrame: integer = definedExternally): GameObject
    open fun pauseAll(): AnimationManager /* this */
    open fun play(key: String, child: GameObject): AnimationManager /* this */
    open fun play(key: String, child: Array<GameObject>): AnimationManager /* this */
    open fun remove(key: String): Animation
    open fun resumeAll(): AnimationManager /* this */
    open fun <G : Array<GameObject>> staggerPlay(key: String, children: GameObject, stagger: Number = definedExternally): G
    open fun <G : Array<GameObject>> staggerPlay(key: String, children: Array<GameObject>, stagger: Number = definedExternally): G
    open fun toJSON(key: String = definedExternally): JSONAnimations
    override fun destroy()
    open fun load(child: GameObject, key: String): GameObject
}