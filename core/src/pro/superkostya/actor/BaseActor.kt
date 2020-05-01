package pro.superkostya.actor

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2
import pro.superkostya.ppuX
import pro.superkostya.ppuY

abstract class BaseActor(val position: Vector2, width: Float, height: Float = width) {

    val bounds = Rectangle(0f, 0f, width, height)

    abstract fun update(delta: Float)

    abstract fun render()

    open fun SpriteBatch.draw(region: TextureRegion) {
        draw(region, position.x * ppuX, position.y * ppuY, bounds.width * ppuX, bounds.height * ppuY)
    }

    open fun ShapeRenderer.drawDebug() {
        rect(position.x + bounds.x, position.y + bounds.y, bounds.width, bounds.height)
    }
}