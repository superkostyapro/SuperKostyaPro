package pro.superkostya.actor

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

enum class State {
    IDLE, WALKING, JUMPING, DYING
}

class Kostya(val position: Vector2) : BaseActor() {

    val acceleration = Vector2()

    val velocity = Vector2()

    val bounds = Rectangle(0f, 0f, SIZE, SIZE)

    var state = State.IDLE

    var isFacingRight = true

    var stateTime = 0f

    override fun update(delta: Float) {
        stateTime += delta
        position.add(velocity.cpy().scl(delta))
    }

    override fun SpriteBatch.draw(region: TextureRegion) {
        draw(
            region,
            position.x * ppuX,
            position.y * ppuY,
            SIZE * ppuX,
            SIZE * ppuY
        )
    }

    companion object {

        const val SPEED = 2f // unit per second

        const val JUMP_VELOCITY = 1f

        const val SIZE = 0.5f // half a unit
    }
}
