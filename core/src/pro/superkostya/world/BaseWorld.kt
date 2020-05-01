package pro.superkostya.world

import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Disposable
import pro.superkostya.BaseAssets
import pro.superkostya.actor.Kostya
import pro.superkostya.removeAssets

abstract class BaseWorld(val id: Int) : InputProcessor, Disposable {

    abstract val backgroundColor: Color

    abstract val assets: BaseAssets

    lateinit var kostya: Kostya

    val stage = Stage()

    abstract fun update(delta: Float)

    abstract fun render()

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
