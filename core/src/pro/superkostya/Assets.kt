package pro.superkostya

import com.badlogic.gdx.utils.IntMap
import pro.superkostya.world.BaseAssets

private val assets = IntMap<BaseAssets>()

fun addAssets(id: Int, value: BaseAssets): BaseAssets {
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