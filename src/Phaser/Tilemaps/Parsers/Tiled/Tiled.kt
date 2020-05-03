package Phaser.Tilemaps.Parsers.Tiled

import Phaser.Tilemaps.LayerData
import Phaser.Tilemaps.MapData
import Phaser.Types.Tilemaps.GIDData

external fun AssignTileProperties(mapData: MapData)

external fun Base64Decode(data: Any?): Array<Any>

external fun BuildTilesetIndex(mapData: MapData): Array<Any>

external fun CreateGroupLayer(json: Any?, currentl: Any? = definedExternally, parentstate: Any? = definedExternally): Any?

external fun ParseGID(gid: Number): GIDData

external fun ParseImageLayers(json: Any?): Array<Any>

external fun ParseJSONTiled(name: String, json: Any?, insertNull: Boolean): MapData

external fun ParseObject(tiledObject: Any?, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Any?

external fun ParseObjectLayers(json: Any?): Array<Any>

external fun ParseTileLayers(json: Any?, insertNull: Boolean): Array<LayerData>

external fun ParseTilesets(json: Any?): Any?