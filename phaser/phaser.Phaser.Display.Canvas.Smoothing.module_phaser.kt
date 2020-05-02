@file:JsQualifier("Phaser.Display.Canvas.Smoothing")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package Phaser.Display.Canvas.Smoothing

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

external fun getPrefix(context: CanvasRenderingContext2D): String

external fun getPrefix(context: WebGLRenderingContext): String

external fun enable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun enable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun disable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun disable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */

external fun isEnabled(context: CanvasRenderingContext2D): Boolean

external fun isEnabled(context: WebGLRenderingContext): Boolean