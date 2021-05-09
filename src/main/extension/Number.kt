package main.extension

@Suppress("UNCHECKED_CAST")
operator fun <T : Number> Number.plus(other: T): T {
    return when (other) {
        is Short -> toShort() + other
        is Int -> toInt() + other
        is Long -> toLong() + other
        is Float -> toFloat() + other
        is Double -> toDouble() + other
        else -> throw Throwable("Unknown number type")
    } as T
}

@Suppress("UNCHECKED_CAST")
operator fun <T : Number> Number.minus(other: T): T {
    return when (other) {
        is Short -> toShort() - other
        is Int -> toInt() - other
        is Long -> toLong() - other
        is Float -> toFloat() - other
        is Double -> toDouble() - other
        else -> throw Throwable("Unknown number type")
    } as T
}

@Suppress("UNCHECKED_CAST")
operator fun <T : Number> Number.times(other: T): T {
    return when (other) {
        is Int -> toInt() * other
        is Short -> toShort() * other
        is Long -> toLong() * other
        is Float -> toFloat() * other
        is Double -> toDouble() * other
        else -> throw Throwable("Unknown number type")
    } as T
}

@Suppress("UNCHECKED_CAST")
operator fun <T : Number> Number.div(other: T): T {
    return when (other) {
        is Short -> toShort() / other
        is Int -> toInt() / other
        is Long -> toLong() / other
        is Float -> toFloat() / other
        is Double -> toDouble() / other
        else -> throw Throwable("Unknown number type")
    } as T
}