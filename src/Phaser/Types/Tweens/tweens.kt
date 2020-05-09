package Phaser.Types.Tweens

import Phaser.Tweens.Timeline
import Phaser.Tweens.Tween
import Phaser.integer

typealias Event = String

typealias GetActiveCallback = (target: Any, key: String, value: Number, targetIndex: integer, totalTargets: integer, tween: Tween) -> Unit

typealias GetEndCallback = (target: Any, key: String, value: Number, targetIndex: integer, totalTargets: integer, tween: Tween) -> Unit

typealias GetStartCallback = (target: Any, key: String, value: Number, targetIndex: integer, totalTargets: integer, tween: Tween) -> Unit

typealias TimelineOnCompleteCallback = (timeline: Timeline, param: Any) -> Unit

typealias TimelineOnLoopCallback = (timeline: Timeline, param: Any) -> Unit

typealias TimelineOnStartCallback = (timeline: Timeline, param: Any) -> Unit

typealias TimelineOnUpdateCallback = (timeline: Timeline, param: Any) -> Unit

typealias TimelineOnYoyoCallback = (timeline: Timeline, param: Any) -> Unit

typealias TweenOnActiveCallback = (tween: Tween, target: Any, param: Any) -> Unit

typealias TweenOnCompleteCallback = (tween: Tween, targets: Array<Any>, param: Any) -> Unit

typealias TweenOnLoopCallback = (tween: Tween, targets: Array<Any>, param: Any) -> Unit

typealias TweenOnRepeatCallback = (tween: Tween, target: Any, param: Any) -> Unit

typealias TweenOnStartCallback = (tween: Tween, targets: Array<Any>, param: Any) -> Unit

typealias TweenOnUpdateCallback = (tween: Tween, target: Any, param: Any) -> Unit

typealias TweenOnYoyoCallback = (tween: Tween, target: Any, param: Any) -> Unit