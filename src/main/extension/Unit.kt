package main.extension

inline fun <T> jsObject(init: T.() -> Unit): T {
    val o = js("{}") as T
    init(o)
    return o
}