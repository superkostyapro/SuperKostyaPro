package Phaser.Display.Bounds

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
import Phaser.GameObjects.GameObject

external fun <G : GameObject> CenterOn(gameObject: G, x: Number, y: Number): G

external fun GetBottom(gameObject: GameObject): Number

external fun GetCenterX(gameObject: GameObject): Number

external fun GetCenterY(gameObject: GameObject): Number

external fun GetLeft(gameObject: GameObject): Number

external fun GetOffsetX(gameObject: GameObject): Number

external fun GetOffsetY(gameObject: GameObject): Number

external fun GetRight(gameObject: GameObject): Number

external fun GetTop(gameObject: GameObject): Number

external fun <G : GameObject> SetBottom(gameObject: G, value: Number): G

external fun <G : GameObject> SetCenterX(gameObject: G, x: Number): G

external fun <G : GameObject> SetCenterY(gameObject: G, y: Number): G

external fun <G : GameObject> SetLeft(gameObject: G, value: Number): G

external fun <G : GameObject> SetRight(gameObject: G, value: Number): G

external fun <G : GameObject> SetTop(gameObject: G, value: Number): G