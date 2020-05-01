package pro.superkostya

import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.IntMap

internal typealias AtlasRegion = TextureAtlas.AtlasRegion

internal typealias AnimationRegion = Animation<TextureRegion>

internal typealias ArrayRegion = Array<TextureRegion>

private val assets = IntMap<BaseAssets>()

abstract class BaseAssets : Disposable {

    abstract val kostyaIdleLeft: TextureRegion
    abstract val kostyaIdleRight: TextureRegion

    abstract val kostyaLeftAnimation: AnimationRegion
    abstract val kostyaRightAnimation: AnimationRegion

    abstract val blockTexture: TextureRegion
}

fun putAssets(id: Int, value: BaseAssets): BaseAssets {
    removeAssets(id)
    assets.put(id, value)
    return value
}

fun getBaseAssets(id: Int) = getAssets<BaseAssets>(id)

@Suppress("UNCHECKED_CAST")
fun <T : BaseAssets> getAssets(id: Int) = assets.get(id) as T

fun removeAssets(id: Int) {
    with(assets) {
        get(id)?.dispose()
        remove(id)
    }
}

fun clearAssets() {
    assets.forEach {
        it.value.dispose()
    }
    assets.clear()
}