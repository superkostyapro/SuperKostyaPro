@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package phaser.types.cameras

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
import Phaser.Cameras.Scene2D.Camera

typealias CameraFadeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraFlashCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraPanCallback = (camera: Camera, progress: Number, x: Number, y: Number) -> Unit

typealias CameraShakeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraZoomCallback = (camera: Camera, progress: Number, zoom: Number) -> Unit