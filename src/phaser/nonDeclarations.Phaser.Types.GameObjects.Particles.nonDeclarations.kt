@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package Phaser.Types.GameObjects.Particles

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
import integer
import Phaser.GameObjects.Particles.Particle
import Phaser.GameObjects.Particles.ParticleEmitter
import Phaser.Math.Vector2

typealias DeathZoneSourceCallback = (x: Number, y: Number) -> Unit

typealias EdgeZoneSourceCallback = (quantity: integer, stepRate: Number) -> Unit

typealias EmitterOpOnEmitCallback = (particle: Particle, key: String, value: Number) -> Unit

typealias EmitterOpOnUpdateCallback = (particle: Particle, key: String, t: Number, value: Number) -> Unit

typealias ParticleDeathCallback = (particle: Particle) -> Unit

typealias ParticleEmitterCallback = (particle: Particle, emitter: ParticleEmitter) -> Unit

typealias RandomZoneSourceCallback = (point: Vector2) -> Unit