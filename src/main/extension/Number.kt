package main.extension

import kotlin.browser.window
import kotlin.math.max

fun Number.dp(ratio: Float) = toFloat() * max(1.0, window.devicePixelRatio * ratio)