@file:JsQualifier("Phaser.Types.Tilemaps")

package Phaser.Types.Tilemaps

import Phaser.Tilemaps.LayerData
import Phaser.Tilemaps.Tileset
import Phaser.Types.Math.Vector2Like
import Phaser.integer

external interface FilteringOptions {
    var isNotEmpty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isColliding: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasInterestingFace: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetTilesWithinFilteringOptions {
    var isNotEmpty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isColliding: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasInterestingFace: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GIDData {
    var gid: Number
    var flippedHorizontal: Boolean
    var flippedVertical: Boolean
    var flippedAntiDiagonal: Boolean
    var rotation: Number
    var flipped: Boolean
}

external interface LayerDataConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseTileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseTileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var heightInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var indexes: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var collideIndexes: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var callbacks: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var bodies: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tilemapLayer: dynamic /* Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MapDataConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var heightInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var format: integer?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: String?
        get() = definedExternally
        set(value) = definedExternally
    var renderOrder: String?
        get() = definedExternally
        set(value) = definedExternally
    var version: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Number?
        get() = definedExternally
        set(value) = definedExternally
    var layers: Array<LayerData>?
        get() = definedExternally
        set(value) = definedExternally
    var images: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var objects: Any?
        get() = definedExternally
        set(value) = definedExternally
    var collision: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tilesets: Array<Tileset>?
        get() = definedExternally
        set(value) = definedExternally
    var imageCollections: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tiles: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ObjectLayerConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Any?
        get() = definedExternally
        set(value) = definedExternally
    var propertytypes: Any?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var objects: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StyleConfig {
    var tileColor: dynamic /* Phaser.Display.Color | Number | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var collidingTileColor: dynamic /* Phaser.Display.Color | Number | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
    var faceColor: dynamic /* Phaser.Display.Color | Number | Nothing? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TiledObject {
    var id: integer
    var name: String
    var type: String
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Any?
        get() = definedExternally
        set(value) = definedExternally
    var gid: integer?
        get() = definedExternally
        set(value) = definedExternally
    var flippedHorizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flippedVertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flippedAntiDiagonal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var polyline: Array<Vector2Like>?
        get() = definedExternally
        set(value) = definedExternally
    var polygon: Array<Vector2Like>?
        get() = definedExternally
        set(value) = definedExternally
    var text: Any?
        get() = definedExternally
        set(value) = definedExternally
    var rectangle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ellipse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var point: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Array<integer>>?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: integer?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: integer?
        get() = definedExternally
        set(value) = definedExternally
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var insertNull: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}