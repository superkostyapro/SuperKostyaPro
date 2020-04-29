package pro.superkostya.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import pro.superkostya.SuperKostyaPro

fun main() {
    LwjglApplication(SuperKostyaPro(), LwjglApplicationConfiguration().apply {
        width = 1024
        height = 640
    })
}