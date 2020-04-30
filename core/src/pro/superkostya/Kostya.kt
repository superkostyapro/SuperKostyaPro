package pro.superkostya

import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

enum class State {
    IDLE, WALKING, JUMPING, DYING
}

class Kostya(val position: Vector2) {

    var acceleration = Vector2()

    var velocity = Vector2()

    var bounds = Rectangle(0f, 0f, SIZE, SIZE)

    var state = State.IDLE

    var facingLeft = true

    companion object {

        const val SPEED = 2f // unit per second

        const val JUMP_VELOCITY = 1f

        const val SIZE = 0.5f // half a unit
    }
}
