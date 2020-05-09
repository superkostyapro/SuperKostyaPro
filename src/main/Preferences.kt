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
        get() = secureStorage.get(js("var _cs=[\"\\x77\\x6f\",\"\\x5f\\x6c\\x65\",\"\\x72\\x6c\\x64\",\"\\x76\\x65\\x6c\",\"\\x5f\\x31\"]; _cs[0]+_cs[2]+_cs[1]+_cs[3]+_cs[4]") as String)
            .toString().toIntOrNull() ?: MIN_LEVEL
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x65\\x76\",\"\\x72\\x6c\",\"\\x64\\x5f\\x6c\",\"\\x5f\\x31\",\"\\x77\\x6f\",\"\\x65\\x6c\"]; _cs[4]+_cs[1]+_cs[2]+_cs[0]+_cs[5]+_cs[3]") as String,
                value.toString()
            )
        }

    var wl2: Int
        get() {
            if (wl1 < MAX_LEVEL) {
                return 0
            }
            return secureStorage.get(js("var _cs=[\"\\x72\\x6c\\x64\",\"\\x6c\\x5f\\x32\",\"\\x77\\x6f\",\"\\x65\\x76\\x65\",\"\\x5f\\x6c\"]; _cs[2]+_cs[0]+_cs[4]+_cs[3]+_cs[1]") as String)
                .toString().toIntOrNull() ?: 0
        }
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x5f\\x6c\",\"\\x72\\x6c\\x64\",\"\\x77\\x6f\",\"\\x6c\\x5f\\x32\",\"\\x65\\x76\\x65\"]; _cs[2]+_cs[1]+_cs[0]+_cs[4]+_cs[3]") as String,
                value.toString()
            )
        }

    var wl3: Int
        get() {
            if (wl1 < MAX_LEVEL || wl2 < MAX_LEVEL) {
                return 0
            }
            return secureStorage.get(js("var _cs=[\"\\x65\\x6c\",\"\\x72\\x6c\\x64\",\"\\x5f\\x33\",\"\\x65\\x76\",\"\\x5f\\x6c\",\"\\x77\\x6f\"]; _cs[5]+_cs[1]+_cs[4]+_cs[3]+_cs[0]+_cs[2]") as String)
                .toString().toIntOrNull() ?: 0
        }
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x77\\x6f\",\"\\x65\\x6c\",\"\\x64\\x5f\",\"\\x6c\\x65\\x76\",\"\\x72\\x6c\",\"\\x5f\\x33\"]; _cs[0]+_cs[4]+_cs[2]+_cs[3]+_cs[1]+_cs[5]") as String,
                value.toString()
            )
        }

    var coins: Int
        get() = localStorage["coins"]?.toIntOrNull() ?: 0
        set(value) {
            localStorage["coins"] = value.toString()
        }
}