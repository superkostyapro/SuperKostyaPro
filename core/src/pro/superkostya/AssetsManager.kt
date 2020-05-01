package pro.superkostya

import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.IntMap
import pro.superkostya.world.BaseWorld

@Suppress("MemberVisibilityCanBePrivate")
class AssetsManager : Disposable {

    private val assets = IntMap<BaseWorld.BaseAssets>()

    fun addAssets(id: Int, world: BaseWorld.BaseAssets) {
        assets.put(id, world)
    }

    fun getBaseAssets(id: Int) = getAssets<BaseWorld.BaseAssets>(id)

    @Suppress("UNCHECKED_CAST")
    fun <T : BaseWorld.BaseAssets> getAssets(id: Int) = assets.get(id) as T

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