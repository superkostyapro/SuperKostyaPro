package phaser.utils

import org.khronos.webgl.ArrayBuffer

external fun ArrayBufferToBase64(arrayBuffer: ArrayBuffer, mediaType: String = definedExternally): String

external fun Base64ToArrayBuffer(base64: String): ArrayBuffer