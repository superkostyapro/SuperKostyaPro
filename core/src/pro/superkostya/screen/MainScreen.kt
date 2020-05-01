package pro.superkostya.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import pro.superkostya.world.BaseWorld
import pro.superkostya.world.DrawingWorld

class MainScreen : Screen {

    private var world: BaseWorld = DrawingWorld()

    override fun show() {
        Gdx.input.inputProcessor = world
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun resume() {
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        world.update(delta)
        world.render()
    }

    override fun hide() {
        Gdx.input.inputProcessor = null
    }

    override fun pause() {
    }

    override fun dispose() {
    }
}
