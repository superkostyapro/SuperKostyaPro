package pro.superkostya

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20

class GameScreen : Screen {

    private val world = World()

    private val renderer = WorldRenderer(world)

    override fun show() {
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun resume() {
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        renderer.render()
    }

    override fun hide() {
    }

    override fun pause() {
    }

    override fun dispose() {
    }
}
