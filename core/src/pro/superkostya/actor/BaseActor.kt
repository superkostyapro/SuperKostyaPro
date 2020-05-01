package pro.superkostya.actor

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion

abstract class BaseActor {

    abstract fun update(delta: Float)

    abstract fun SpriteBatch.draw(region: TextureRegion)
}