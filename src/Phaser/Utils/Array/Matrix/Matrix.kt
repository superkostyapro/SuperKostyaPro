package Phaser.Utils.Array.Matrix

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

external fun <T> CheckMatrix(matrix: Array<Array<T>> = definedExternally): Boolean

external fun <T> MatrixToString(matrix: Array<Array<T>> = definedExternally): String

external fun <T> ReverseColumns(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> ReverseRows(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> Rotate180(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateLeft(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateMatrix(matrix: Array<Array<T>> = definedExternally, direction: Number = definedExternally): Array<Array<T>>

external fun <T> RotateMatrix(matrix: Array<Array<T>> = definedExternally, direction: String = definedExternally): Array<Array<T>>

external fun <T> RotateRight(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> TransposeMatrix(array: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateMatrix(): Array<Array<T>>