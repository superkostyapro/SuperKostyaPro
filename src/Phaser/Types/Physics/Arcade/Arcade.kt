package Phaser.Types.Physics.Arcade

import kotlin.js.*
import Phaser.Types.Math.Vector2Like
import Phaser.Geom.Rectangle

external interface ArcadeBodyBounds {
    var x: Number
    var y: Number
    var right: Number
    var bottom: Number
}

external interface ArcadeBodyCollision {
    var none: Boolean
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}

external interface ArcadeWorldConfig {
    var fps: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gravity: Vector2Like?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var checkCollision: CheckCollisionObject?
        get() = definedExternally
        set(value) = definedExternally
    var overlapBias: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileBias: Number?
        get() = definedExternally
        set(value) = definedExternally
    var forceX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isPaused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var debug: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var debugShowBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var debugShowStaticBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var debugShowVelocity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var debugBodyColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var debugStaticBodyColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var debugVelocityColor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxEntries: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useTree: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ArcadeWorldDefaults {
    var debugShowBody: Boolean
    var debugShowStaticBody: Boolean
    var debugShowVelocity: Boolean
    var bodyDebugColor: Number
    var staticBodyDebugColor: Number
    var velocityDebugColor: Number
}

external interface ArcadeWorldTreeMinMax {
    var minX: Number
    var minY: Number
    var maxX: Number
    var maxY: Number
}

external interface CheckCollisionObject {
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}

external interface PhysicsGroupDefaults {
    var setCollideWorldBounds: Boolean
    var setBoundsRectangle: Rectangle
    var setAccelerationX: Number
    var setAccelerationY: Number
    var setAllowDrag: Boolean
    var setAllowGravity: Boolean
    var setAllowRotation: Boolean
    var setBounceX: Number
    var setBounceY: Number
    var setDragX: Number
    var setDragY: Number
    var setEnable: Boolean
    var setGravityX: Number
    var setGravityY: Number
    var setFrictionX: Number
    var setFrictionY: Number
    var setVelocityX: Number
    var setVelocityY: Number
    var setAngularVelocity: Number
    var setAngularAcceleration: Number
    var setAngularDrag: Number
    var setMass: Number
    var setImmovable: Boolean
}