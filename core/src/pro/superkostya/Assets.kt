package pro.superkostya

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable

private typealias TextureAnimation = Animation<TextureRegion>

class Assets : Disposable {

    val common = Common()

    private var world1: World1? = null

    private var world2: World2? = null

    private var world3: World3? = null

    init {
        val atlas = TextureAtlas(Gdx.files.internal("images/textures/textures.pack"))
        bobIdleLeft = atlas.findRegion("bob-01")
        bobIdleRight = TextureRegion(bobIdleLeft)
        bobIdleRight.flip(true, false)
        blockTexture = atlas.findRegion("block")
        val walkLeftFrames = Array<TextureRegion>(5) {
            atlas.findRegion("bob-0" + (it + 2))
        }
        walkLeftAnimation = Animation<TextureRegion>(FRAME_DURATION, *walkLeftFrames)
        val walkRightFrames = Array<TextureRegion>(5) {
            TextureRegion(walkLeftFrames[it]).apply {
                flip(true, false)
            }
        }
        walkRightAnimation = Animation<TextureRegion>(FRAME_DURATION, *walkRightFrames)
    }

    class Common : Disposable {

        private lateinit var kostyaLeftAnimation = TextureAnimation(FRAME_DURATION, *walkRightFrames)
        private lateinit var kostyaRightAnimation: TextureAnimation

        override fun dispose() {

        }
    }

    class World1 : Disposable {

        private lateinit var bobIdleLeft: TextureRegion
        private lateinit var bobIdleRight: TextureRegion
        private lateinit var blockTexture: TextureRegion
        private lateinit var kostyaFrame: TextureRegion

        private lateinit var walkLeftAnimation: Animation<TextureRegion>
        private lateinit var walkRightAnimation: Animation<TextureRegion>

        override fun dispose() {
        }
    }

    class World2 : Disposable {

        override fun dispose() {
        }
    }

    class World3 : Disposable {

        override fun dispose() {
        }
    }

    fun createWorld(i: Int) {
        when (i) {
            0 -> world1 = World1()
            1 -> world2 = World2()
            2 -> world3 = World3()
            else -> throw Throwable("Unknown world index")
        }
    }

    fun getWorld(i: Int): Any? {
        return when (i) {
            0 -> world1
            1 -> world2
            2 -> world3
            else -> throw Throwable("Unknown world index")
        }
    }

    override fun dispose() {
        common.dispose()
        world1?.dispose()
        world2?.dispose()
        world3?.dispose()
    }

    companion object {

        private var assets: Assets? = null

        fun getInstance(): Assets {
            if (assets == null) {
                assets = Assets()
            }
            return assets!!
        }
    }
}