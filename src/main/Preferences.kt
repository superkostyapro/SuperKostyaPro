package main

import org.w3c.dom.get
import org.w3c.dom.set
import kotlin.browser.localStorage

external interface Storage {

    fun setPassword(value: String)

    fun set(index: dynamic, value: String? = definedExternally)

    fun get(index: String): Any?
}

external val secureStorage: Storage

object Preferences {

    init {
        secureStorage.setPassword(js("var _cs=[\"\\x61\\x6e\",\"\\x64\\x72\",\"\\x64\",\"\\x6f\\x69\"]; _cs[0]+_cs[1]+_cs[3]+_cs[2]") as String)
    }

    var wl1: Int
        get() = secureStorage.get("wl1").toString().toIntOrNull() ?: 1
        set(value) {
            secureStorage.set("wl1", value.toString())
        }

    var wl2: Int
        get() = secureStorage.get("wl2").toString().toIntOrNull() ?: 0
        set(value) {
            secureStorage.set("wl2", value.toString())
        }

    var wl3: Int
        get() = secureStorage.get("wl3").toString().toIntOrNull() ?: 0
        set(value) {
            secureStorage.set("wl3", value.toString())
        }

    var coins: Int
        get() = localStorage["coins"]?.toIntOrNull() ?: 0
        set(value) {
            localStorage["coins"] = value.toString()
        }
}