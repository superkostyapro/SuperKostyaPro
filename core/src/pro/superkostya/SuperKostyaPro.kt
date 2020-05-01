package pro.superkostya

import com.badlogic.gdx.Game
import pro.superkostya.screen.PlayScreen
import pro.superkostya.world.DrawingWorld

class SuperKostyaPro : Game() {

    override fun create() {
        setScreen(PlayScreen(DrawingWorld()))
    }

    override fun resize(width: Int, height: Int) {
        super.resize(width, height)
        ppuX = width / CAMERA_WIDTH
        ppuY = height / CAMERA_HEIGHT
    }

    override fun dispose() {
        super.dispose()
        clearAssets()
    }
}
