package pro.superkostya.world

import pro.superkostya.actor.Kostya

abstract class BaseWorld {

    lateinit var kostya: Kostya

    abstract fun update(delta: Float)
}
