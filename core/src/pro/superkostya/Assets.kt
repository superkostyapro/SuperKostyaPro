package pro.superkostya

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import pro.superkostya.extension.flipX

private typealias AnimationRegion = Animation<TextureRegion>

private typealias ArrayRegion = Array<TextureRegion>

@Suppress("MemberVisibilityCanBePrivate")
class Assets : Disposable {

    private var world1: World1? = null

    private var world2: World2? = null

    private var world3: World3? = null

    abstract class World : Disposable {

        abstract val kostyaIdleLeft: TextureRegion
        abstract val kostyaIdleRight: TextureRegion

        abstract val kostyaLeftAnimation: AnimationRegion
        abstract val kostyaRightAnimation: AnimationRegion

        abstract val blockTexture: TextureRegion
    }

    class World1 : World() {

        private val atlas = TextureAtlas(Gdx.files.internal("textures.pack"))

        override val kostyaIdleLeft: AtlasRegion = atlas.findRegion("bob-01")
        override val kostyaIdleRight = TextureRegion(kostyaIdleLeft).flipX()

        override val kostyaLeftAnimation = AnimationRegion(FRAME_DURATION, *ArrayRegion(5) {
            atlas.findRegion("bob-0" + (it + 2))
        })
        override val kostyaRightAnimation = AnimationRegion(FRAME_DURATION, *kostyaLeftAnimation.keyFrames.flipX())

        override val blockTexture: TextureRegion = atlas.findRegion("block")

        override fun dispose() {
            atlas.dispose()
        }
    }

    class World2 : World() {

        private val atlas = TextureAtlas(Gdx.files.internal("textures.pack"))

        override val kostyaIdleLeft: AtlasRegion = atlas.findRegion("bob-01")
        override val kostyaIdleRight = TextureRegion(kostyaIdleLeft).flipX()

        override val kostyaLeftAnimation = AnimationRegion(FRAME_DURATION, *ArrayRegion(5) {
            atlas.findRegion("bob-0" + (it + 2))
        })
        override val kostyaRightAnimation = AnimationRegion(FRAME_DURATION, *kostyaLeftAnimation.keyFrames.flipX())

        override val blockTexture: TextureRegion = atlas.findRegion("block")

        override fun dispose() {
            atlas.dispose()
        }
    }

    class World3 : World() {

        private val atlas = TextureAtlas(Gdx.files.internal("textures.pack"))

        override val kostyaIdleLeft: AtlasRegion = atlas.findRegion("bob-01")
        override val kostyaIdleRight = TextureRegion(kostyaIdleLeft).flipX()

        override val kostyaLeftAnimation = AnimationRegion(FRAME_DURATION, *ArrayRegion(5) {
            atlas.findRegion("bob-0" + (it + 2))
        })
        override val kostyaRightAnimation = AnimationRegion(FRAME_DURATION, *kostyaLeftAnimation.keyFrames.flipX())

        override val blockTexture: TextureRegion = atlas.findRegion("block")

        override fun dispose() {
            atlas.dispose()
        }
    }

    fun loadWorld(n: Int) {
        when (n) {
            1 -> world1 = World1()
            2 -> world2 = World2()
            3 -> world3 = World3()
            else -> throw Throwable("Unknown world's number")
        }
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(Throwable::class)
    fun <T> getWorld(n: Int): T {
        return when (n) {
            1 -> world1 as T
            2 -> world2 as T
            3 -> world3 as T
            else -> throw Throwable("Unknown world's number")
        }
    }

    override fun dispose() {
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