package Phaser.Loader.FileTypesManager

import Phaser.Loader.LoaderPlugin

external fun install(loader: LoaderPlugin)

external fun register(key: String, factoryFunction: Function<*>)

external fun destroy()