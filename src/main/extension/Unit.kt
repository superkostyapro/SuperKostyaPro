@file:Suppress("UnsafeCastFromDynamic")

package main.extension

inline fun <T> jsObject(init: T.() -> Unit): T {
    val o = js("{}")
    init(o as T)
    return o
}