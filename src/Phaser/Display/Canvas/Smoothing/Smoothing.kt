@file:JsQualifier("Phaser.Display.Canvas.Smoothing")

package Phaser.Display.Canvas.Smoothing

import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.CanvasRenderingContext2D

external fun getPrefix(context: CanvasRenderingContext2D): String

external fun getPrefix(context: WebGLRenderingContext): String

external fun enable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun enable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun disable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun disable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun isEnabled(context: CanvasRenderingContext2D): Boolean

external fun isEnabled(context: WebGLRenderingContext): Boolean