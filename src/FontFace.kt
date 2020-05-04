import kotlin.js.Promise

external class FontFace(family: String, src: String) {

    fun load(): Promise<FontFace>
}