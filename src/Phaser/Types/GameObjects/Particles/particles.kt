package Phaser.Types.GameObjects.Particles

import Phaser.GameObjects.Particles.Particle
import Phaser.GameObjects.Particles.ParticleEmitter
import Phaser.Math.Vector2
import Phaser.integer

typealias DeathZoneSourceCallback = (x: Number, y: Number) -> Unit

typealias EdgeZoneSourceCallback = (quantity: integer, stepRate: Number) -> Unit

typealias EmitterOpOnEmitCallback = (particle: Particle, key: String, value: Number) -> Unit

typealias EmitterOpOnUpdateCallback = (particle: Particle, key: String, t: Number, value: Number) -> Unit

typealias ParticleDeathCallback = (particle: Particle) -> Unit

typealias ParticleEmitterCallback = (particle: Particle, emitter: ParticleEmitter) -> Unit

typealias RandomZoneSourceCallback = (point: Vector2) -> Unit