package pro.superkostya.actor

import com.badlogic.gdx.math.Vector2

class Kostya(position: Vector2) : BaseActor(position, SIZE) {

    val acceleration = Vector2()

    val velocity = Vector2()

    var state = State.IDLE

    var isFacingRight = true

    var stateTime = 0f

    override fun update(delta: Float) {
        stateTime += delta
        position.add(velocity.cpy().scl(delta))
    }

    companion object {

        const val SPEED = 2f // unit per second

        const val JUMP_VELOCITY = 1f

        const val SIZE = 0.5f // half a unit
    }
}
