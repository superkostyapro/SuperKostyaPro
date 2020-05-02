@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package Phaser.Types.Tweens

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
import Phaser.Tweens.Tween
import Phaser.Tweens.Timeline

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