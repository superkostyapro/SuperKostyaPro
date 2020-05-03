package Phaser.DOM

import Phaser.ContentLoadedCallback
import org.w3c.dom.HTMLElement

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
    // todo
    open fun start(callback: Any/*FrameRequestCallback*/, forceSetTimeOut: Boolean, targetFPS: Number)
    open fun stop()
    open fun destroy()
}

external fun AddToDOM(element: HTMLElement): HTMLElement