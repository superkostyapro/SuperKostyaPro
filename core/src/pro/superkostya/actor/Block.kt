package pro.superkostya.actor

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

class Block(val position: Vector2) : BaseActor() {

    val bounds = Rectangle(0f, 0f, SIZE, SIZE)

    override fun update(delta: Float) {
    }

    override fun SpriteBatch.draw(region: TextureRegion) {
        draw(
            region,
            position.x * ppuX,
            position.y * ppuY,
            bounds.width * ppuX,
            bounds.height * ppuY
        )
    }

    companion object {

        const val SIZE = 1f
    }
}