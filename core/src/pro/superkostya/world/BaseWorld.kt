package pro.superkostya.world

import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable

internal typealias AtlasRegion = TextureAtlas.AtlasRegion

internal typealias AnimationRegion = Animation<TextureRegion>

internal typealias ArrayRegion = Array<TextureRegion>

abstract class BaseWorld(id: Int) : Disposable {

    abstract val assets: BaseAssets

    abstract class BaseAssets : Disposable {

        abstract val kostyaIdleLeft: TextureRegion
        abstract val kostyaIdleRight: TextureRegion

        abstract val kostyaLeftAnimation: AnimationRegion
        abstract val kostyaRightAnimation: AnimationRegion

        abstract val blockTexture: TextureRegion
    }
}
