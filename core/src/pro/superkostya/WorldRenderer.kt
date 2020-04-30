package pro.superkostya

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType

class WorldRenderer(private val world: World) {

    private val camera = OrthographicCamera(10f, 7f).apply {
        position.set(5f, 3.5f, 0f)
        update()
    }

    private val debugRenderer = ShapeRenderer()

    fun render() {
        // render blocks
        debugRenderer.projectionMatrix = camera.combined
        debugRenderer.begin(ShapeType.Line)
        for (block in world.blocks) {
            val rect = block.bounds
            val x1 = block.position.x + rect.x
            val y1 = block.position.y + rect.y
            debugRenderer.color = Color(1f, 0f, 0f, 1f)
            debugRenderer.rect(x1, y1, rect.width, rect.height)
        }
        // render Bob
        val kostya = world.kostya
        val rect = kostya.bounds
        val x1 = kostya.position.x + rect.x
        val y1 = kostya.position.y + rect.y
        debugRenderer.color = Color(0f, 1f, 0f, 1f)
        debugRenderer.rect(x1, y1, rect.width, rect.height)
        debugRenderer.end()
    }
}
