package pro.superkostya.actor

import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

class Block(val position: Vector2) {

    var bounds = Rectangle(0f, 0f, SIZE, SIZE)

    companion object {

        const val SIZE = 1f
    }
}