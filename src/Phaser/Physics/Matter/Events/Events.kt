package Phaser.Physics.Matter.Events

import Phaser.Types.Physics.Matter.MatterCollisionData

external interface AfterAddEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var AFTER_ADD: Any

external interface AfterRemoveEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var AFTER_REMOVE: Any

external interface AfterUpdateEvent {
    var timestamp: Number
    var source: Any
    var name: String
}

external var AFTER_UPDATE: Any

external interface BeforeAddEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var BEFORE_ADD: Any

external interface BeforeRemoveEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var BEFORE_REMOVE: Any

external interface BeforeUpdateEvent {
    var timestamp: Number
    var source: Any
    var name: String
}

external var BEFORE_UPDATE: Any

external interface CollisionActiveEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_ACTIVE: Any

external interface CollisionEndEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_END: Any

external interface CollisionStartEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_START: Any

external var DRAG_END: Any

external var DRAG: Any

external var DRAG_START: Any

external var PAUSE: Any

external var RESUME: Any

external interface SleepEndEvent {
    var source: Any
    var name: String
}

external var SLEEP_END: Any

external interface SleepStartEvent {
    var source: Any
    var name: String
}

external var SLEEP_START: Any