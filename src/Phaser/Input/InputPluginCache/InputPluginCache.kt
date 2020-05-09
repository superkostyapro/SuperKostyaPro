@file:JsQualifier("Phaser.Input.InputPluginCache")

package Phaser.Input.InputPluginCache

import Phaser.Input.InputPlugin
import Phaser.Types.Input.InputPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, settingsKey: String, configKey: String)

external fun getCore(key: String): InputPluginContainer

external fun install(target: InputPlugin)

external fun remove(key: String)