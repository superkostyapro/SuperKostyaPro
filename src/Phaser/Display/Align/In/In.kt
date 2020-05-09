@file:JsQualifier("Phaser.Display.Align.In")

package Phaser.Display.Align.In

import Phaser.GameObjects.GameObject
import Phaser.integer

external fun <G : GameObject> BottomCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomLeft(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> BottomRight(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> Center(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> LeftCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> QuickSet(child: G, alignIn: GameObject, position: integer, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> RightCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopCenter(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopLeft(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G

external fun <G : GameObject> TopRight(gameObject: G, alignIn: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally): G