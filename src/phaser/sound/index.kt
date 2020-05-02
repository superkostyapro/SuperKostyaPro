@file:JsQualifier("Phaser.Sound")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package phaser.sound

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
import Phaser.Types.Sound.SoundMarker
import Phaser.Types.Sound.SoundConfig
import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Cache.BaseCache
import Phaser.Types.Sound.DecodeAudioConfig

external interface `T$11` {
    @nativeGetter
    operator fun get(key: String): SoundMarker?
    @nativeSetter
    operator fun set(key: String, value: SoundMarker)
}

external open class BaseSound(manager: Phaser.Sound.BaseSoundManager, key: String, config: Phaser.Types.Sound.SoundConfig = definedExternally) : EventEmitter {
    open var key: String
    open var isPlaying: Boolean
    open var isPaused: Boolean
    open var totalRate: Number
    open var duration: Number
    open var totalDuration: Number
    open var markers: `T$11`
    open var currentMarker: SoundMarker
    open fun addMarker(marker: SoundMarker): Boolean
    open fun updateMarker(marker: SoundMarker): Boolean
    open fun removeMarker(markerName: String): SoundMarker
    open fun play(markerName: String = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun pause(): Boolean
    open fun resume(): Boolean
    open fun stop(): Boolean
    open fun applyConfig()
    open fun resetConfig()
    open fun update(time: Number, delta: Number)
    open fun calculateRate()
    override fun destroy()
    open fun play(): Boolean
}

external open class BaseSoundManager(game: Phaser.Game) : EventEmitter {
    open var game: Game
    open var jsonCache: BaseCache
    open var mute: Boolean
    open var volume: Number
    open var pauseOnBlur: Boolean
    open var locked: Boolean
    open fun add(key: String, config: SoundConfig = definedExternally): BaseSound
    open fun addAudioSprite(key: String, config: SoundConfig = definedExternally): dynamic /* Phaser.Sound.HTML5AudioSound | Phaser.Sound.WebAudioSound */
    open fun get(key: String): BaseSound
    open fun getAll(key: String): Array<BaseSound>
    open fun play(key: String, extra: SoundConfig = definedExternally): Boolean
    open fun play(key: String, extra: SoundMarker = definedExternally): Boolean
    open fun playAudioSprite(key: String, spriteName: String, config: SoundConfig = definedExternally): Boolean
    open fun remove(sound: BaseSound): Boolean
    open fun removeAll()
    open fun removeByKey(key: String): Number
    open fun pauseAll()
    open fun resumeAll()
    open fun stopAll()
    open fun stopByKey(key: String): Number
    open fun unlock()
    open fun onBlur()
    open fun onFocus()
    open fun update(time: Number, delta: Number)
    override fun destroy()
    open fun setRate(value: Number): BaseSoundManager
    open var rate: Number
    open fun setDetune(value: Number): BaseSoundManager
    open var detune: Number
    open fun play(key: String): Boolean
}

external open class HTML5AudioSound(manager: Phaser.Sound.HTML5AudioSoundManager, key: String, config: Phaser.Types.Sound.SoundConfig = definedExternally) : BaseSound {
    override fun play(markerName: String, config: SoundConfig): Boolean
    override fun play(markerName: SoundConfig, config: SoundConfig): Boolean
    override fun pause(): Boolean
    override fun resume(): Boolean
    override fun stop(): Boolean
    override fun update(time: Number, delta: Number)
    override fun destroy()
    override fun calculateRate()
    open var mute: Boolean
    open fun setMute(value: Boolean): HTML5AudioSound
    open var volume: Number
    open fun setVolume(value: Number): HTML5AudioSound
    open var rate: Number
    open fun setRate(value: Number): HTML5AudioSound
    open var detune: Number
    open fun setDetune(value: Number): HTML5AudioSound
    open var seek: Number
    open fun setSeek(value: Number): HTML5AudioSound
    open var loop: Boolean
    open fun setLoop(value: Boolean): HTML5AudioSound
    override fun play(): Boolean
}

external open class HTML5AudioSoundManager(game: Phaser.Game) : BaseSoundManager {
    open var override: Boolean
    open var audioPlayDelay: Number
    open var loopEndOffset: Number
    override fun add(key: String, config: SoundConfig): HTML5AudioSound
    override fun unlock()
    override fun onBlur()
    override fun onFocus()
    override fun destroy()
    open fun isLocked(sound: HTML5AudioSound, prop: String, value: Any = definedExternally): Boolean
    open fun setMute(value: Boolean): HTML5AudioSoundManager
    override var mute: Boolean
    open fun setVolume(value: Number): HTML5AudioSoundManager
    override var volume: Number
}

external open class NoAudioSound(manager: Phaser.Sound.NoAudioSoundManager, key: String, config: Phaser.Types.Sound.SoundConfig = definedExternally) {
    open fun addMarker(marker: SoundMarker): Boolean
    open fun updateMarker(marker: SoundMarker): Boolean
    open fun removeMarker(markerName: String): Nothing?
    open fun play(markerName: String = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun pause(): Boolean
    open fun resume(): Boolean
    open fun stop(): Boolean
    open fun destroy()
    open fun play(): Boolean
}

external open class NoAudioSoundManager(game: Phaser.Game) : BaseSoundManager

external fun SoundManagerCreator(game: Game): dynamic /* Phaser.Sound.HTML5AudioSoundManager | Phaser.Sound.WebAudioSoundManager | Phaser.Sound.NoAudioSoundManager */

external open class WebAudioSound(manager: Phaser.Sound.WebAudioSoundManager, key: String, config: Phaser.Types.Sound.SoundConfig = definedExternally) : BaseSound {
    override fun play(markerName: String, config: SoundConfig): Boolean
    override fun play(markerName: SoundConfig, config: SoundConfig): Boolean
    override fun pause(): Boolean
    override fun resume(): Boolean
    override fun stop(): Boolean
    override fun applyConfig()
    override fun update(time: Number, delta: Number)
    override fun destroy()
    override fun calculateRate()
    open var rate: Number
    open fun setRate(value: Number): WebAudioSound
    open var detune: Number
    open fun setDetune(value: Number): WebAudioSound
    open var mute: Boolean
    open fun setMute(value: Boolean): WebAudioSound
    open var volume: Number
    open fun setVolume(value: Number): WebAudioSound
    open var seek: Number
    open fun setSeek(value: Number): WebAudioSound
    open var loop: Boolean
    open fun setLoop(value: Boolean): WebAudioSound
    override fun play(): Boolean
}

external open class WebAudioSoundManager(game: Phaser.Game) : BaseSoundManager {
    open fun setAudioContext(context: AudioContext): WebAudioSoundManager /* this */
    override fun add(key: String, config: SoundConfig): WebAudioSound
    open fun decodeAudio(audioKey: Array<DecodeAudioConfig> = definedExternally, audioData: ArrayBuffer = definedExternally)
    open fun decodeAudio(audioKey: Array<DecodeAudioConfig> = definedExternally, audioData: String = definedExternally)
    open fun decodeAudio(audioKey: String = definedExternally, audioData: ArrayBuffer = definedExternally)
    open fun decodeAudio(audioKey: String = definedExternally, audioData: String = definedExternally)
    override fun unlock()
    override fun onBlur()
    override fun onFocus()
    override fun destroy()
    open fun setMute(value: Boolean): WebAudioSoundManager
    override var mute: Boolean
    open fun setVolume(value: Number): WebAudioSoundManager
    override var volume: Number
    open fun decodeAudio()
}