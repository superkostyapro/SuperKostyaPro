package pro.superkostya.world

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import pro.superkostya.FRAME_DURATION
import pro.superkostya.extension.eachFlipX
import pro.superkostya.extension.flipX

class FarFarKingdom : BaseWorld(ID) {

    override val assets = Assets()

    class Assets : BaseAssets() {

        private val atlas = TextureAtlas(Gdx.files.internal("textures.pack"))

        override val kostyaIdleLeft: AtlasRegion = atlas.findRegion("bob-01")
        override val kostyaIdleRight = TextureRegion(kostyaIdleLeft).flipX()

        override val kostyaLeftAnimation = AnimationRegion(FRAME_DURATION, *ArrayRegion(5) {
            atlas.findRegion("bob-0" + (it + 2))
        })
        override val kostyaRightAnimation = AnimationRegion(FRAME_DURATION, *kostyaLeftAnimation.keyFrames.eachFlipX())

        override val blockTexture: TextureRegion = atlas.findRegion("block")

        override fun dispose() {
            atlas.dispose()
        }
    }

    override fun dispose() {
        assets.dispose()
    }

    companion object {

        const val ID = 3
    }
}
