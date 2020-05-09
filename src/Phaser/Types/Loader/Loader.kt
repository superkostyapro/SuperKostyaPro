@file:JsQualifier("Phaser.Types.Loader")

package Phaser.Types.Loader

import Phaser.integer
import org.w3c.xhr.XMLHttpRequestResponseType

external interface FileConfig {
    var type: String
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: XMLHttpRequestResponseType?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: dynamic /* Phaser.Types.Loader.XHRSettingsObject | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var config: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XHRSettingsObject {
    var responseType: XMLHttpRequestResponseType
    var async: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var user: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: integer?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var header: String?
        get() = definedExternally
        set(value) = definedExternally
    var headerValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestedWith: String?
        get() = definedExternally
        set(value) = definedExternally
    var overrideMimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var withCredentials: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}