package pro.superkostya.extension

import com.badlogic.gdx.graphics.g2d.TextureRegion

fun TextureRegion.flipX(): TextureRegion {
    flip(true, false)
    return this
}

fun TextureRegion.flipY(): TextureRegion {
    flip(false, true)
    return this
}

fun Array<TextureRegion>.eachFlipX(): Array<TextureRegion> {
    forEach {
        it.flipX()
    }
    return this
}

fun Array<TextureRegion>.eachFlipY(): Array<TextureRegion> {
    forEach {
        it.flipY()
    }
    return this
}