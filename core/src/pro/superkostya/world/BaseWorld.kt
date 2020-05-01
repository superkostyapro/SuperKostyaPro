package pro.superkostya.world

import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable

typealias AtlasRegion = TextureAtlas.AtlasRegion

typealias AnimationRegion = Animation<TextureRegion>

typealias ArrayRegion = Array<TextureRegion>

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
