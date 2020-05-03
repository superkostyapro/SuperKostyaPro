package Phaser.Tilemaps.Parsers.Impact

import Phaser.Tilemaps.LayerData
import Phaser.Tilemaps.MapData

external fun ParseTileLayers(json: Any?, insertNull: Boolean): Array<LayerData>

external fun ParseTilesets(json: Any?): Array<Any>

external fun ParseWeltmeister(name: String, json: Any?, insertNull: Boolean): MapData