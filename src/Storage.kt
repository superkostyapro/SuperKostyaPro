external interface Storage {

    fun setPassword(value: String)

    fun set(index: dynamic, value: String? = definedExternally)

    fun get(index: String): Any?
}

external val secureStorage: Storage