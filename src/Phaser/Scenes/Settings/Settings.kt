package Phaser.Scenes.Settings

import Phaser.Types.Scenes.SettingsConfig
import Phaser.Types.Scenes.SettingsObject

external fun create(config: String): SettingsObject

external fun create(config: SettingsConfig): SettingsObject