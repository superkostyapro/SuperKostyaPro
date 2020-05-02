@file:JsQualifier("Phaser.Loader.FileTypes")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package Phaser.Loader.FileTypes

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
import Phaser.Loader.LoaderPlugin
import Phaser.Types.Loader.XHRSettingsObject
import Phaser.Types.Loader.FileTypes.JSONFileConfig
import Phaser.Loader.File
import Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import Phaser.Loader.MultiFile
import Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import Phaser.Types.Loader.FileTypes.AudioFileConfig
import Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import Phaser.Types.Loader.FileTypes.BinaryFileConfig
import Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import Phaser.Types.Loader.FileTypes.CSSFileConfig
import Phaser.Types.Loader.FileTypes.GLSLFileConfig
import Phaser.Types.Loader.FileTypes.HTMLFileConfig
import integer
import Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import Phaser.Types.Loader.FileTypes.ImageFrameConfig
import Phaser.Types.Loader.FileTypes.ImageFileConfig
import Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import Phaser.Types.Loader.FileTypes.PackFileConfig
import Phaser.Types.Loader.FileTypes.PluginFileConfig
import Phaser.Types.Loader.FileTypes.SceneFileConfig
import Phaser.Types.Loader.FileTypes.ScenePluginFileConfig
import Phaser.Types.Loader.FileTypes.ScriptFileConfig
import Phaser.Types.Loader.FileTypes.SpriteSheetFileConfig
import Phaser.Types.Loader.FileTypes.SVGSizeConfig
import Phaser.Types.Loader.FileTypes.SVGFileConfig
import Phaser.Types.Loader.FileTypes.TextFileConfig
import Phaser.Types.Loader.FileTypes.TilemapCSVFileConfig
import Phaser.Types.Loader.FileTypes.TilemapImpactFileConfig
import Phaser.Types.Loader.FileTypes.TilemapJSONFileConfig
import Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig
import Phaser.Types.Loader.FileTypes.VideoFileConfig
import Phaser.Types.Loader.FileTypes.XMLFileConfig

external open class AnimationJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
    open fun onLoadComplete()
}

external open class AtlasJSONFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class AtlasXMLFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class AudioFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any, xhrSettings: XHRSettingsObject, audioContext: AudioContext)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any, xhrSettings: XHRSettingsObject, audioContext: AudioContext)
    override fun onProcess()
}

external open class AudioSpriteFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any, audioConfig: Any, audioXhrSettings: XHRSettingsObject, jsonXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any, audioConfig: Any, audioXhrSettings: XHRSettingsObject, jsonXhrSettings: XHRSettingsObject)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

external open class BinaryFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataType: Any)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String, xhrSettings: XHRSettingsObject, dataType: Any)
    override fun onProcess()
}

external open class BitmapFontFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String>, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class CSSFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: CSSFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class GLSLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, shaderType: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String, shaderType: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
    open fun getShaderName(headerSource: Array<String>): String
    open fun getShaderType(headerSource: Array<String>): String
    open fun getShaderUniforms(headerSource: Array<String>): Any
}

external open class HTML5AudioFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String, xhrSettings: XHRSettingsObject)
    open fun onLoad()
    open fun onError()
    open fun onProgress()
    override fun load()
}

external open class HTMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class HTMLTextureFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, width: integer, height: integer, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String, width: integer, height: integer, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

external open class ImageFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String>, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    override fun onProcess()
    override fun addToCache()
}

external open class JSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
}

external open class MultiAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject, textureXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject, textureXhrSettings: XHRSettingsObject)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

external open class MultiScriptFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig, url: Array<String>, xhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class PackFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
}

external open class PluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class SceneFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SceneFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

external open class ScenePluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class ScriptFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class SpriteSheetFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String>, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

external open class SVGFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

external open class TextFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TextFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

external open class TilemapCSVFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

external open class TilemapImpactFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

external open class TilemapJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

external open class UnityAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

external open class VideoFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any, loadEvent: String, asBlob: Boolean, noAudio: Boolean, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any, loadEvent: String, asBlob: Boolean, noAudio: Boolean, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun load()
}

external open class XMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: XMLFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}