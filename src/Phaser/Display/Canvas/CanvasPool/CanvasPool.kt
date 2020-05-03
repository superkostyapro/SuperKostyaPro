package Phaser.Display.Canvas.CanvasPool

import Phaser.integer
import org.w3c.dom.HTMLCanvasElement

external fun create(parent: Any, width: integer = definedExternally, height: integer = definedExternally, canvasType: integer = definedExternally, selfParent: Boolean = definedExternally): HTMLCanvasElement

external fun create2D(parent: Any, width: integer = definedExternally, height: integer = definedExternally): HTMLCanvasElement

external fun createWebGL(parent: Any, width: integer = definedExternally, height: integer = definedExternally): HTMLCanvasElement

external fun first(canvasType: integer = definedExternally): HTMLCanvasElement

external fun remove(parent: Any)

external fun total(): integer

external fun free(): integer

external fun disableSmoothing()

external fun enableSmoothing()