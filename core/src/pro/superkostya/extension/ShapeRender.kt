package pro.superkostya.extension

import com.badlogic.gdx.graphics.glutils.ShapeRenderer

inline fun ShapeRenderer.batchLine(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Line)
    block()
    end()
}

inline fun ShapeRenderer.batchFilled(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Filled)
    block()
    end()
}

inline fun ShapeRenderer.batchPoint(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Point)
    block()
    end()
}