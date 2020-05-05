package main.extension

import kotlin.browser.window
import kotlin.math.roundToInt

val Number.dp
    get() = toFloat() * window.devicePixelRatio

val Number.sp
    get() = (toFloat() * window.devicePixelRatio).roundToInt()