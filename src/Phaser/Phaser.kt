package Phaser

// todo
typealias CameraRotateCallback = (camera: Any/*Cameras.Scene2D.Camera*/, progress: Number, angle: Number) -> Unit

typealias DataEachCallback = (parent: Any, key: String, value: Any, args: Any) -> Unit

typealias ContentLoadedCallback = () -> Unit

typealias CreateCallback = (bob: Phaser.GameObjects.Bob, index: integer) -> Unit

typealias EachContainerCallback<I> = (item: Any, args: Any) -> Unit

typealias LightForEach = (light: Phaser.GameObjects.Light) -> Unit

typealias TextStyleWordWrapCallback = (text: String, textObject: Phaser.GameObjects.Text) -> Unit

typealias CenterFunction = (triangle: Phaser.Geom.Triangle) -> Unit

typealias ArcadePhysicsCallback = (object1: Phaser.GameObjects.GameObject, object2: Phaser.GameObjects.GameObject) -> Unit

// todo
typealias WebGLContextCallback = (renderer: Any/*Renderer.WebGL.WebGLRenderer*/) -> Unit

typealias EachListCallback<I> = (item: I, args: Any) -> Unit

typealias EachMapCallback<E> = (key: String, entry: E) -> Unit

typealias EachSetCallback<E> = (entry: E, index: Number) -> Unit

typealias EachTextureCallback = (texture: Phaser.Textures.Texture, args: Any) -> Unit

typealias FindTileCallback = (value: Phaser.Tilemaps.Tile, index: integer, array: Array<Phaser.Tilemaps.Tile>) -> Unit

typealias EachTileCallback = (value: Phaser.Tilemaps.Tile, index: integer, array: Array<Phaser.Tilemaps.Tile>) -> Unit

typealias TilemapFilterCallback = (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit

typealias TilemapFindCallback = (value: Phaser.GameObjects.GameObject, index: Number, array: Array<Phaser.GameObjects.GameObject>) -> Unit

external fun extend(ctor: Any, definition: Any, isClassDescriptor: Boolean, extend: Any = definedExternally)

external fun mixin(myClass: Any, mixins: Any)

external fun mixin(myClass: Any, mixins: Array<Any>)

open external class Class(definition: Any)

external interface AdInstance {
    var instance: Any
    var placementID: String
    var shown: Boolean
    var video: Boolean
}

typealias ContextFilter = String

external interface ChooseContextConfig {
    var filters: Array<ContextFilter>?
        get() = definedExternally
        set(value) = definedExternally
    var maxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LeaderboardScore {
    var score: integer
    var scoreFormatted: String
    var timestamp: integer
    var rank: integer
    var data: String
    var playerName: String
    var playerPhotoURL: String
    var playerID: String
}

external interface Product {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var productID: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var imageURI: String?
        get() = definedExternally
        set(value) = definedExternally
    var price: String?
        get() = definedExternally
        set(value) = definedExternally
    var priceCurrencyCode: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Purchase {
    var developerPayload: String?
        get() = definedExternally
        set(value) = definedExternally
    var paymentID: String?
        get() = definedExternally
        set(value) = definedExternally
    var productID: String?
        get() = definedExternally
        set(value) = definedExternally
    var purchaseTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var purchaseToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var signedRequest: String?
        get() = definedExternally
        set(value) = definedExternally
}

typealias integer = Number