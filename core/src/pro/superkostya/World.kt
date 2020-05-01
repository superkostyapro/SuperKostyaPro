package pro.superkostya

import com.badlogic.gdx.math.Vector2
import pro.superkostya.actor.Block
import pro.superkostya.actor.Kostya

class World {

    val blocks = mutableListOf<Block>()

    lateinit var kostya: Kostya

    init {
        createDemoWorld()
    }

    private fun createDemoWorld() {
        kostya = Kostya(Vector2(7f, 2f))
        for (i in 0..9) {
            blocks.add(Block(Vector2(i.toFloat(), 0f)))
            blocks.add(Block(Vector2(i.toFloat(), 7f)))
            if (i > 2) {
                blocks.add(Block(Vector2(i.toFloat(), 1f)))
            }
        }
        blocks.add(Block(Vector2(9f, 2f)))
        blocks.add(Block(Vector2(9f, 3f)))
        blocks.add(Block(Vector2(9f, 4f)))
        blocks.add(Block(Vector2(9f, 5f)))
        blocks.add(Block(Vector2(6f, 3f)))
        blocks.add(Block(Vector2(6f, 4f)))
        blocks.add(Block(Vector2(6f, 5f)))
    }
}
