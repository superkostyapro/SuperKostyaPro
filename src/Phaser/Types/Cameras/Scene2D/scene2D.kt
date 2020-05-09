package Phaser.Types.Cameras.Scene2D

import Phaser.Cameras.Scene2D.Camera

typealias CameraFadeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraFlashCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraPanCallback = (camera: Camera, progress: Number, x: Number, y: Number) -> Unit

typealias CameraShakeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraZoomCallback = (camera: Camera, progress: Number, zoom: Number) -> Unit