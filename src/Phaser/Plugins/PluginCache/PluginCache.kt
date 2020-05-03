package Phaser.Plugins.PluginCache

import Phaser.Types.Plugins.CorePluginContainer
import Phaser.Types.Plugins.CustomPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, custom: Boolean = definedExternally)

external fun registerCustom(key: String, plugin: Function<*>, mapping: String, data: Any)

external fun hasCore(key: String): Boolean

external fun hasCustom(key: String): Boolean

external fun getCore(key: String): CorePluginContainer

external fun getCustom(key: String): CustomPluginContainer

external fun getCustomClass(key: String): Function<*>

external fun remove(key: String)

external fun removeCustom(key: String)

external fun destroyCorePlugins()

external fun destroyCustomPlugins()