package pro.superkostya.extension

import com.badlogic.gdx.graphics.glutils.ShapeRenderer

inline fun ShapeRenderer.useLine(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Line)
    try {
        block()
    } finally {
        end()
    }
}

inline fun ShapeRenderer.useFilled(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Filled)
    try {
        block()
    } finally {
        end()
    }
}

inline fun ShapeRenderer.usePoint(block: ShapeRenderer.() -> Unit) {
    begin(ShapeRenderer.ShapeType.Point)
    try {
        block()
    } finally {
        end()
    }
}