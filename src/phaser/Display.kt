package Phaser.Display

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import integer
import Phaser.Types.Display.InputColorObject
import Phaser.Types.Display.ColorObject
import Phaser.Types.Display.HSVColorObject

external open class Color(red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, alpha: integer = definedExternally) {
    open var gl: Array<Number>
    open fun transparent(): Phaser.Display.Color
    open fun setTo(red: integer, green: integer, blue: integer, alpha: integer = definedExternally, updateHSV: Boolean = definedExternally): Phaser.Display.Color
    open fun setGLTo(red: Number, green: Number, blue: Number, alpha: Number = definedExternally): Phaser.Display.Color
    open fun setFromRGB(color: InputColorObject): Phaser.Display.Color
    open fun setFromHSV(h: Number, s: Number, v: Number): Phaser.Display.Color
    open fun clone(): Phaser.Display.Color
    open fun gray(shade: integer): Phaser.Display.Color
    open fun random(min: integer = definedExternally, max: integer = definedExternally): Phaser.Display.Color
    open fun randomGray(min: integer = definedExternally, max: integer = definedExternally): Phaser.Display.Color
    open fun saturate(amount: integer): Phaser.Display.Color
    open fun desaturate(amount: integer): Phaser.Display.Color
    open fun lighten(amount: integer): Phaser.Display.Color
    open fun darken(amount: integer): Phaser.Display.Color
    open fun brighten(amount: integer): Phaser.Display.Color
    open var color: Number
    open var color32: Number
    open var rgba: String
    open var redGL: Number
    open var greenGL: Number
    open var blueGL: Number
    open var alphaGL: Number
    open var red: Number
    open var green: Number
    open var blue: Number
    open var alpha: Number
    open var h: Number
    open var s: Number
    open var v: Number

    companion object {
        fun ColorToRGBA(color: Number): ColorObject
        fun ComponentToHex(color: integer): String
        fun GetColor(red: integer, green: integer, blue: integer): Number
        fun GetColor32(red: integer, green: integer, blue: integer, alpha: integer): Number
        fun HexStringToColor(hex: String): Phaser.Display.Color
        fun HSLToColor(h: Number, s: Number, l: Number): Phaser.Display.Color
        fun HSVColorWheel(s: Number = definedExternally, v: Number = definedExternally): Array<ColorObject>
        fun HSVToRGB(h: Number, s: Number, v: Number, out: ColorObject = definedExternally): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */
        fun HSVToRGB(h: Number, s: Number, v: Number, out: Phaser.Display.Color = definedExternally): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */
        fun HueToComponent(p: Number, q: Number, t: Number): Number
        fun IntegerToColor(input: integer): Phaser.Display.Color
        fun IntegerToRGB(input: integer): ColorObject
        fun ObjectToColor(input: InputColorObject): Phaser.Display.Color
        fun RandomRGB(min: integer = definedExternally, max: integer = definedExternally): Phaser.Display.Color
        fun RGBStringToColor(rgb: String): Phaser.Display.Color
        fun RGBToHSV(r: integer, g: integer, b: integer, out: HSVColorObject = definedExternally): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */
        fun RGBToHSV(r: integer, g: integer, b: integer, out: Phaser.Display.Color = definedExternally): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */
        fun RGBToString(r: integer, g: integer, b: integer, a: integer = definedExternally, prefix: String = definedExternally): String
        fun ValueToColor(input: String): Phaser.Display.Color
        fun ValueToColor(input: Number): Phaser.Display.Color
        fun ValueToColor(input: InputColorObject): Phaser.Display.Color
        fun HSVToRGB(h: Number, s: Number, v: Number): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */
        fun RGBToHSV(r: integer, g: integer, b: integer): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */
    }
}

external open class BaseShader(key: String, fragmentSrc: String = definedExternally, vertexSrc: String = definedExternally, uniforms: Any = definedExternally) {
    open var key: String
    open var fragmentSrc: String
    open var vertexSrc: String
    open var uniforms: Any
}