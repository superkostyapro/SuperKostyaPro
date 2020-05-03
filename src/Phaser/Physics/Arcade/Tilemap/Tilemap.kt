package Phaser.Physics.Arcade.Tilemap

import Phaser.Tilemaps.Tile
import Phaser.GameObjects.Sprite
import Phaser.Physics.Arcade.Body
import Phaser.Geom.Rectangle
import Phaser.Tilemaps.DynamicTilemapLayer
import Phaser.Tilemaps.StaticTilemapLayer

external fun ProcessTileCallbacks(tile: Tile, sprite: Sprite): Boolean

external fun ProcessTileSeparationX(body: Body, x: Number)

external fun ProcessTileSeparationY(body: Body, y: Number)

external fun SeparateTile(i: Number, body: Body, tile: Tile, tileWorldRect: Rectangle, tilemapLayer: DynamicTilemapLayer, tileBias: Number, isLayer: Boolean): Boolean

external fun SeparateTile(i: Number, body: Body, tile: Tile, tileWorldRect: Rectangle, tilemapLayer: StaticTilemapLayer, tileBias: Number, isLayer: Boolean): Boolean

external fun TileCheckX(body: Body, tile: Tile, tileLeft: Number, tileRight: Number, tileBias: Number, isLayer: Boolean): Number

external fun TileCheckY(body: Body, tile: Tile, tileTop: Number, tileBottom: Number, tileBias: Number, isLayer: Boolean): Number

external fun TileIntersectsBody(tileWorldRect: Any, body: Body): Boolean