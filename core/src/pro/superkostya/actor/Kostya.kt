package pro.superkostya.actor

import com.badlogic.gdx.math.Vector2
import pro.superkostya.getBaseAssets

class Kostya(private val world: Int, position: Vector2) : BaseActor(position, SIZE) {

    val acceleration = Vector2()

    val velocity = Vector2()

    var state = State.IDLE

    var stateTime = 0f

    var isFacingRight = true

    override fun update(delta: Float) {
        stateTime += delta
        position.add(velocity.cpy().scl(delta))
    }

    override fun render() {
        getBaseAssets(world).kostyaIdleLeft

    }

    companion object {

        const val SPEED = 2f // unit per second

        const val JUMP_VELOCITY = 1f

        const val SIZE = 0.5f // half a unit
    }
}
