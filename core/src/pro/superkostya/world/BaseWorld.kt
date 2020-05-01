package pro.superkostya.world

import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import pro.superkostya.BaseAssets
import pro.superkostya.actor.BaseActor
import pro.superkostya.actor.Kostya
import pro.superkostya.putAssets
import pro.superkostya.removeAssets

abstract class BaseWorld(val id: Int, assets: BaseAssets) : InputProcessor, Disposable {

    abstract val backgroundColor: Color

    val map = TiledMap()

    val kostya = Kostya(id, Vector2(5f, 5f))

    val actors: Array<BaseActor>
        get() = arrayOf(kostya)

    init {
        putAssets(id, assets)
    }

    override fun keyUp(keycode: Int): Boolean {
        return false
    }

    override fun keyDown(keycode: Int): Boolean {
        return false
    }

    override fun keyTyped(character: Char): Boolean {
        return false
    }

    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        return false
    }

    override fun scrolled(amount: Int): Boolean {
        return false
    }

    override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        return false
    }

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        return false
    }

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
        return false
    }

    override fun dispose() {
        removeAssets(id)
    }
}
