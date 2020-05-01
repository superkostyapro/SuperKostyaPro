package pro.superkostya.actor

import com.badlogic.gdx.math.Vector2

class Block(position: Vector2) : BaseActor(position, SIZE) {

    override fun update(delta: Float) {
    }

    companion object {

        const val SIZE = 1f
    }
}