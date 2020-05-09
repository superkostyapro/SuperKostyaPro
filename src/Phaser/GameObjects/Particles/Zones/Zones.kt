@file:JsQualifier("Phaser.GameObjects.Particles.Zones")

package Phaser.GameObjects.Particles.Zones

import Phaser.GameObjects.Particles.Particle
import Phaser.Geom.Point
import Phaser.Types.GameObjects.Particles.DeathZoneSource
import Phaser.Types.GameObjects.Particles.EdgeZoneSource
import Phaser.Types.GameObjects.Particles.RandomZoneSource
import Phaser.integer

open external class DeathZone(source: Phaser.Types.GameObjects.Particles.DeathZoneSource, killOnEnter: Boolean) {
    open var source: DeathZoneSource
    open var killOnEnter: Boolean
    open fun willKill(particle: Particle): Boolean
}

open external class EdgeZone(source: Phaser.Types.GameObjects.Particles.EdgeZoneSource, quantity: integer, stepRate: Number, yoyo: Boolean = definedExternally, seamless: Boolean = definedExternally) {
    open var source: dynamic /* Phaser.Types.GameObjects.Particles.EdgeZoneSource | Phaser.Types.GameObjects.Particles.RandomZoneSource */
    open var points: Array<Point>
    open var quantity: integer
    open var stepRate: Number
    open var yoyo: Boolean
    open var counter: Number
    open var seamless: Boolean
    open fun updateSource(): EdgeZone /* this */
    open fun changeSource(source: EdgeZoneSource): EdgeZone /* this */
    open fun getPoint(particle: Particle)
}

open external class RandomZone(source: Phaser.Types.GameObjects.Particles.RandomZoneSource) {
    open var source: RandomZoneSource
    open fun getPoint(particle: Particle)
}