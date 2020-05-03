package Phaser.DOM

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
import ContentLoadedCallback

external fun AddToDOM(element: HTMLElement, parent: String = definedExternally): HTMLElement

external fun AddToDOM(element: HTMLElement, parent: HTMLElement = definedExternally): HTMLElement

external fun DOMContentLoaded(callback: ContentLoadedCallback)

external fun GetInnerHeight(iOS: Boolean): Number

external fun GetScreenOrientation(width: Number, height: Number): String

external fun GetTarget(element: HTMLElement)

external fun ParseXML(data: String): dynamic /* DOMParser | ActiveXObject */

external fun RemoveFromDOM(element: HTMLElement)

open external class RequestAnimationFrame {
    open var isRunning: Boolean
    open var callback: Any
    open var tick: Number
    open var isSetTimeOut: Boolean
    open var timeOutID: Number
    open var lastTime: Number
    open var target: Number
    open var step: Any
    open var stepTimeout: Function<*>
    open fun start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Number)
    open fun stop()
    open fun destroy()
}

external fun AddToDOM(element: HTMLElement): HTMLElement