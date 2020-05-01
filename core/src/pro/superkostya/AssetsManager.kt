package pro.superkostya

import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.IntMap

typealias AtlasRegion = TextureAtlas.AtlasRegion

typealias AnimationRegion = Animation<TextureRegion>

typealias ArrayRegion = Array<TextureRegion>

@Suppress("MemberVisibilityCanBePrivate")
class AssetsManager : Disposable {

    private val assets = IntMap<Base>()

    abstract class Base : Disposable {

        abstract val kostyaIdleLeft: TextureRegion
        abstract val kostyaIdleRight: TextureRegion

        abstract val kostyaLeftAnimation: AnimationRegion
        abstract val kostyaRightAnimation: AnimationRegion

        abstract val blockTexture: TextureRegion
    }

    fun addAssets(id: Int, world: Base) {
        assets.put(id, world)
    }

    fun getBaseAssets(id: Int) = getAssets<Base>(id)

    @Suppress("UNCHECKED_CAST")
    fun <T : Base> getAssets(id: Int) = assets.get(id) as T

    fun removeAssets(id: Int) {
        with(assets) {
            get(id)?.dispose()
            remove(id)
        }
    }

    override fun dispose() {
        assets.forEach {
            it.value.dispose()
        }
        assets.clear()
    }

    companion object {

        private var assets: AssetsManager? = null

        fun getInstance(): AssetsManager {
            if (assets == null) {
                assets = AssetsManager()
            }
            return assets!!
        }
    }
}