package pro.superkostya.world

import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import pro.superkostya.removeAssets

internal typealias AtlasRegion = TextureAtlas.AtlasRegion

internal typealias AnimationRegion = Animation<TextureRegion>

internal typealias ArrayRegion = Array<TextureRegion>

abstract class BaseWorld(val id: Int) : InputProcessor, Disposable {

    abstract val backgroundColor: Color

    abstract val assets: BaseAssets

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

abstract class BaseAssets : Disposable {

    abstract val kostyaIdleLeft: TextureRegion
    abstract val kostyaIdleRight: TextureRegion

    abstract val kostyaLeftAnimation: AnimationRegion
    abstract val kostyaRightAnimation: AnimationRegion

    abstract val blockTexture: TextureRegion
}
