package pro.superkostya.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer
import com.badlogic.gdx.scenes.scene2d.Stage
import pro.superkostya.CAMERA_HEIGHT
import pro.superkostya.CAMERA_WIDTH
import pro.superkostya.world.BaseWorld

class PlayScreen(private val world: BaseWorld) : BaseScreen() {

    private val camera = OrthographicCamera()

    private val renderer = OrthogonalTiledMapRenderer(world.map)

    private val stage = Stage()

    override fun show() {
        Gdx.input.inputProcessor = world
    }

    override fun resize(width: Int, height: Int) {
        camera.setToOrtho(true, CAMERA_WIDTH * width / height, CAMERA_HEIGHT)
    }

    override fun render(delta: Float) {
        val color = world.backgroundColor
        Gdx.gl.glClearColor(color.r, color.g, color.b, color.a)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        camera.position.x = world.kostya.position.x
        camera.update()
        renderer.setView(camera)
        renderer.render()
        stage.act(delta)
        stage.draw()
    }

    override fun hide() {
        dispose()
    }

    override fun dispose() {
        stage.dispose()
    }
}
