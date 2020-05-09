package main

external interface Storage {

    fun setPassword(value: String)

    fun set(index: dynamic, value: String? = definedExternally)

    fun get(index: String): Any?
}

external val secureStorage: Storage

object Preferences {

    init {
        secureStorage.setPassword(js("var _cs=[\"\\x61\\x6e\\x64\",\"\\x72\\x5f\",\"\\x64\\x5f\\x62\",\"\\x74\\x65\",\"\\x65\\x74\",\"\\x72\\x6f\\x69\",\"\\x69\\x6f\",\"\\x73\"]; _cs[0]+_cs[5]+_cs[2]+_cs[4]+_cs[3]+_cs[1]+_cs[6]+_cs[7]") as String)
    }

    var worldLevel1: Int
        get() = secureStorage.get(js("var _cs=[\"\\x72\\x6c\",\"\\x65\\x6c\\x5f\",\"\\x64\\x5f\",\"\\x31\",\"\\x6c\\x65\\x76\",\"\\x77\\x6f\"]; _cs[5]+_cs[0]+_cs[2]+_cs[4]+_cs[1]+_cs[3]") as String)
            .toString().toIntOrNull() ?: MIN_LEVEL
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x65\\x76\",\"\\x72\\x6c\",\"\\x64\\x5f\\x6c\",\"\\x5f\\x31\",\"\\x77\\x6f\",\"\\x65\\x6c\"]; _cs[4]+_cs[1]+_cs[2]+_cs[0]+_cs[5]+_cs[3]") as String,
                value.toString()
            )
        }

    var worldLevel2: Int
        get() {
            if (worldLevel1 < MAX_LEVEL) {
                return 0
            }
            return secureStorage.get(js("var _cs=[\"\\x64\\x5f\\x32\",\"\\x5f\\x6c\",\"\\x65\\x76\\x65\",\"\\x77\\x6f\",\"\\x72\\x6c\",\"\\x6c\"]; _cs[3]+_cs[4]+_cs[0]+_cs[1]+_cs[2]+_cs[5]") as String)
                .toString().toIntOrNull() ?: 0
        }
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x77\\x6f\\x72\",\"\\x5f\\x6c\",\"\\x5f\\x32\",\"\\x6c\\x64\",\"\\x65\\x76\",\"\\x65\\x6c\"]; _cs[0]+_cs[3]+_cs[2]+_cs[1]+_cs[4]+_cs[5]") as String,
                value.toString()
            )
        }

    var worldLevel3: Int
        get() {
            if (worldLevel2 < MAX_LEVEL) {
                return 0
            }
            return secureStorage.get(js("var _cs=[\"\\x65\\x76\\x65\",\"\\x6c\\x33\",\"\\x5f\\x5f\\x6c\",\"\\x77\\x6f\\x72\",\"\\x6c\\x64\"]; _cs[3]+_cs[4]+_cs[2]+_cs[0]+_cs[1]") as String)
                .toString().toIntOrNull() ?: 0
        }
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x6c\\x65\",\"\\x72\\x6c\",\"\\x76\\x65\",\"\\x6c\\x33\",\"\\x77\\x6f\",\"\\x64\\x5f\\x5f\"]; _cs[4]+_cs[1]+_cs[5]+_cs[0]+_cs[2]+_cs[3]") as String,
                value.toString()
            )
        }

    var coins: Int
        get() = secureStorage.get(js("var _cs=[\"\\x63\\x6f\\x69\",\"\\x6e\\x73\",\"\\x69\\x66\",\"\\x5f\\x66\",\"\\x74\",\"\\x5f\\x67\",\"\\x6f\\x72\"]; _cs[0]+_cs[1]+_cs[3]+_cs[6]+_cs[5]+_cs[2]+_cs[4]") as String)
            .toString().toIntOrNull() ?: 0
        set(value) {
            secureStorage.set(
                js("var _cs=[\"\\x69\\x66\",\"\\x5f\\x67\",\"\\x6f\\x72\",\"\\x73\\x5f\\x66\",\"\\x63\\x6f\",\"\\x74\",\"\\x69\\x6e\"]; _cs[4]+_cs[6]+_cs[3]+_cs[2]+_cs[1]+_cs[0]+_cs[5]") as String,
                value.toString()
            )
        }
}