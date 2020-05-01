package pro.superkostya.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import pro.superkostya.CAMERA_HEIGHT
import pro.superkostya.CAMERA_WIDTH
import pro.superkostya.world.BaseWorld
import pro.superkostya.world.DrawingWorld

class MainScreen : Screen {

    private val camera = OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT)

    private var world: BaseWorld = DrawingWorld()

    private val spriteBatch = SpriteBatch()

    private val debugRenderer = ShapeRenderer()

    override fun show() {
        camera.position.set(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f, 0f)
        Gdx.input.inputProcessor = world
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun resume() {
    }

    override fun render(delta: Float) {
        val color = world.backgroundColor
        Gdx.gl.glClearColor(color.r, color.g, color.b, color.a)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        camera.update()
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
