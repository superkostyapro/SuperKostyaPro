@file:JsQualifier("Phaser.Types.Plugins")

package Phaser.Types.Plugins

external interface CorePluginContainer {
    var key: String
    var plugin: Function<*>
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomPluginContainer {
    var key: String
    var plugin: Function<*>
}

external interface GlobalPlugin {
    var key: String
    var plugin: Function<*>
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
}