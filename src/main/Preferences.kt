package main

import org.w3c.dom.get
import org.w3c.dom.set
import kotlin.browser.localStorage

object Preferences {

    var wl1: Int
        get() = localStorage["wl1"]?.toIntOrNull() ?: 1
        set(value) {
            localStorage["wl1"] = value.toString()
        }

    var wl2: Int
        get() = localStorage["wl2"]?.toIntOrNull() ?: 0
        set(value) {
            localStorage["wl2"] = value.toString()
        }

    var wl3: Int
        get() = localStorage["wl3"]?.toIntOrNull() ?: 0
        set(value) {
            localStorage["wl3"] = value.toString()
        }

    fun wl(i: Int): Int {
        return when (i) {
            2 -> wl2
            3 -> wl3
            else -> wl1
        }
    }
}