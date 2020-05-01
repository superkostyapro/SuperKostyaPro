package pro.superkostya.extension

import com.badlogic.gdx.graphics.g2d.SpriteBatch

inline fun SpriteBatch.use(block: SpriteBatch.() -> Unit) {
    begin()
    try {
        block()
    } finally {
        end()
    }
}