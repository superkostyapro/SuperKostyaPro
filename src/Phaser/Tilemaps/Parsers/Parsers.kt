package Phaser.Tilemaps.Parsers

import Phaser.Tilemaps.MapData
import Phaser.integer

external fun Parse(name: String, mapFormat: integer, data: Array<Array<integer>>, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData

external fun Parse(name: String, mapFormat: integer, data: String, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData

external fun Parse(name: String, mapFormat: integer, data: Any?, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData

external fun Parse2DArray(name: String, data: Array<Array<integer>>, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData

external fun ParseCSV(name: String, data: String, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData