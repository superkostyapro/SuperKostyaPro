package pro.superkostya.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import pro.superkostya.CAMERA_HEIGHT
import pro.superkostya.CAMERA_WIDTH
import pro.superkostya.world.BaseWorld

class PlayScreen(private val world: BaseWorld) : BaseScreen() {

    private val camera = OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT)

    private val spriteBatch = SpriteBatch()

    private val debugRenderer = ShapeRenderer()

    override fun show() {
        Gdx.input.inputProcessor = world
        camera.position.set(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f, 0f)
    }

    override fun render(delta: Float) {
        val color = world.backgroundColor
        Gdx.gl.glClearColor(color.r, color.g, color.b, color.a)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        world.update(delta)
        camera.position.x = world.kostya.position.x
        camera.update()
        world.render()
    }

    override fun dispose() {
        spriteBatch.dispose()
        debugRenderer.dispose()
    }
}
