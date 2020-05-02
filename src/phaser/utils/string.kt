package phaser.utils

import integer

external fun Format(string: String, values: Array<Any>): String

external fun Pad(str: String, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Pad(str: Number, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Pad(str: Any?, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Reverse(string: String): String

external fun UppercaseFirst(str: String): String

external fun UUID(): String