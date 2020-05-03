package Phaser.Loader.FileTypes

import Phaser.Loader.File
import Phaser.Loader.LoaderPlugin
import Phaser.Loader.MultiFile
import Phaser.Types.Loader.FileTypes.*
import Phaser.Types.Loader.XHRSettingsObject
import Phaser.integer

open external class AnimationJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
    open fun onLoadComplete()
}

open external class AtlasJSONFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

open external class AtlasXMLFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

open external class AudioFile : File {
    // todo
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any, xhrSettings: XHRSettingsObject, audioContext: Any/*AudioContext*/)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any, xhrSettings: XHRSettingsObject, audioContext: Any/*AudioContext*/)
    override fun onProcess()
}

open external class AudioSpriteFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any, audioConfig: Any, audioXhrSettings: XHRSettingsObject, jsonXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any, audioConfig: Any, audioXhrSettings: XHRSettingsObject, jsonXhrSettings: XHRSettingsObject)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

open external class BinaryFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataType: Any)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String, xhrSettings: XHRSettingsObject, dataType: Any)
    override fun onProcess()
}

open external class BitmapFontFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String>, fontDataURL: String, textureXhrSettings: XHRSettingsObject, fontDataXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

open external class CSSFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: CSSFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class GLSLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, shaderType: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String, shaderType: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
    open fun getShaderName(headerSource: Array<String>): String
    open fun getShaderType(headerSource: Array<String>): String
    open fun getShaderUniforms(headerSource: Array<String>): Any
}

open external class HTML5AudioFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String, xhrSettings: XHRSettingsObject)
    open fun onLoad()
    open fun onError()
    open fun onProgress()
    override fun load()
}

open external class HTMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class HTMLTextureFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, width: integer, height: integer, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String, width: integer, height: integer, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

open external class ImageFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String>, xhrSettings: XHRSettingsObject, frameConfig: ImageFrameConfig)
    override fun onProcess()
    override fun addToCache()
}

open external class JSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
}

open external class MultiAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject, textureXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String, path: String, baseURL: String, atlasXhrSettings: XHRSettingsObject, textureXhrSettings: XHRSettingsObject)
    override fun onFileComplete(file: File)
    open fun addToCache()
}

open external class MultiScriptFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig, url: Array<String>, xhrSettings: XHRSettingsObject)
    open fun addToCache()
}

open external class PackFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String, xhrSettings: XHRSettingsObject, dataKey: String)
    override fun onProcess()
}

open external class PluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String, start: Boolean, mapping: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class SceneFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SceneFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

open external class ScenePluginFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String, systemKey: String, sceneKey: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class ScriptFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class SpriteSheetFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, url: Array<String>, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String>, frameConfig: ImageFrameConfig, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

open external class SVGFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

open external class TextFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TextFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}

open external class TilemapCSVFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun addToCache()
}

open external class TilemapImpactFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

open external class TilemapJSONFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun addToCache()
}

open external class UnityAtlasFile : MultiFile {
    constructor(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String>, atlasURL: String, textureXhrSettings: XHRSettingsObject, atlasXhrSettings: XHRSettingsObject)
    open fun addToCache()
}

open external class VideoFile : File {
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any, loadEvent: String, asBlob: Boolean, noAudio: Boolean, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any, loadEvent: String, asBlob: Boolean, noAudio: Boolean, xhrSettings: XHRSettingsObject)
    override fun onProcess()
    override fun load()
}

open external class XMLFile : File {
    constructor(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject)
    constructor(loader: LoaderPlugin, key: XMLFileConfig, url: String, xhrSettings: XHRSettingsObject)
    override fun onProcess()
}