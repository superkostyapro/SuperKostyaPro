package pro.superkostya

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile
import com.badlogic.gdx.scenes.scene2d.Stage

class GameScreen : Screen {

    private val camera = OrthographicCamera()

    private val stage = Stage()

    var map: TiledMap? = null

    var renderer: OrthogonalTiledMapRenderer? = null

    private val kostya = Kostya()

    override fun show() {

        stage.viewport.camera = camera
        kostya!!.setPosition(20f, 10f)
        stage.addActor(kostya)

        val tiles = Texture(Gdx.files.internal("brickBlue01.png"))
        map = TiledMap()
        val layers = map!!.layers
        val layer = TiledMapTileLayer(150, 100, 32, 32)
        for (x in 0..149) {
            for (y in 0..99) {
                if (y % 2 == 0) {
                    val cell = TiledMapTileLayer.Cell()
                    cell.tile = StaticTiledMapTile(TextureRegion(tiles, 0, 0, 32, 32))
                    layer.setCell(x, y, cell)
                }
            }
        }
        layers.add(layer)
        kostya!!.layer = map!!.layers[0] as TiledMapTileLayer
        renderer = OrthogonalTiledMapRenderer(map, 1 / 16f)
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(250f / 255, 250f / 255, 250f / 255, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        kostya!!.x += delta * 3
        camera.position.x = kostya!!.x
        camera.update()
        renderer!!.setView(camera)
        renderer!!.render()
        stage!!.act(delta)
        stage!!.draw()
    }

    override fun resume() {
    }

    override fun resize(width: Int, height: Int) {
        camera.setToOrtho(false, 20 * width / height.toFloat(), 20f)
    }

    override fun pause() {
    }

    override fun hide() {
    }

    override fun dispose() {
    }
}