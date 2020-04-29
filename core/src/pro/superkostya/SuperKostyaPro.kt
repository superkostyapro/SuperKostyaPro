package pro.superkostya

import com.badlogic.gdx.Screen
import ktx.app.KtxGame

class SuperKostyaPro : KtxGame<Screen>() {

    override fun create() {
        val game = MainScreen()
        addScreen(game)
        setScreen<MainScreen>()
    }
}