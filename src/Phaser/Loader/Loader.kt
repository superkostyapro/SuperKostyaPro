package Phaser.Loader

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
import Phaser.Types.Loader.XHRSettingsObject
import Phaser.Types.Loader.FileTypes.JSONFileConfig
import Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import Phaser.Types.Loader.FileTypes.AudioFileConfig
import Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import Phaser.Types.Loader.FileTypes.BinaryFileConfig
import Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import Phaser.Types.Loader.FileTypes.CSSFileConfig
import Phaser.Types.Loader.FileTypes.GLSLFileConfig
import Phaser.Types.Loader.FileTypes.HTMLFileConfig
import Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import Phaser.Types.Loader.FileTypes.ImageFileConfig
import Phaser.Types.Loader.FileTypes.MultiAtlasFileConfig
import Phaser.Types.Loader.FileTypes.MultiScriptFileConfig
import Phaser.Types.Loader.FileTypes.PackFileConfig
import Phaser.Types.Loader.FileTypes.PluginFileConfig
import Phaser.Types.Loader.FileTypes.SceneFileConfig
import Phaser.Types.Loader.FileTypes.ScenePluginFileConfig
import Phaser.Types.Loader.FileTypes.ScriptFileConfig
import Phaser.Types.Loader.FileTypes.ImageFrameConfig
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
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Cache.CacheManager
import Phaser.Textures.TextureManager
import Phaser.Scenes.SceneManager
import Phaser.Structs.Set
import Phaser.Events.EventEmitter

external var LOADER_IDLE: integer

external var LOADER_LOADING: integer

external var LOADER_PROCESSING: integer

external var LOADER_COMPLETE: integer

external var LOADER_SHUTDOWN: integer

external var LOADER_DESTROYED: integer

external var FILE_PENDING: integer

external var FILE_LOADING: integer

external var FILE_LOADED: integer

external var FILE_FAILED: integer

external var FILE_PROCESSING: integer

external var FILE_ERRORED: integer

external var FILE_COMPLETE: integer

external var FILE_DESTROYED: integer

external var FILE_POPULATED: integer

open external class File(loader: Phaser.Loader.LoaderPlugin, fileConfig: Phaser.Types.Loader.FileConfig) {
    open var loader: LoaderPlugin
    open var cache: dynamic /* Phaser.Cache.BaseCache | Phaser.Textures.TextureManager */
    open var type: String
    open var key: String
    open var url: String
    open var src: String
    open var xhrSettings: XHRSettingsObject
    open var xhrLoader: XMLHttpRequest
    open var state: integer
    open var bytesTotal: Number
    open var bytesLoaded: Number
    open var percentComplete: Number
    open var crossOrigin: String?
    open var data: Any
    open var config: Any
    open var multiFile: MultiFile
    open var linkFile: File
    open fun setLink(fileB: File)
    open fun resetXHR()
    open fun load()
    open fun onLoad(xhr: XMLHttpRequest, event: ProgressEvent)
    open fun onError(xhr: XMLHttpRequest, event: ProgressEvent)
    open fun onProgress(event: ProgressEvent)
    open fun onProcess()
    open fun onProcessComplete()
    open fun onProcessError()
    open fun hasCacheConflict(): Boolean
    open fun addToCache()
    open fun pendingDestroy()
    open fun destroy()

    companion object {
        fun createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String)
        fun revokeObjectURL(image: HTMLImageElement)
    }
}

external fun GetURL(file: File, baseURL: String): String

open external class LoaderPlugin(scene: Phaser.Scene) : EventEmitter {
    open fun animation(key: String, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun animation(key: JSONFileConfig, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun animation(key: Array<JSONFileConfig>, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: AtlasJSONFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: Array<AtlasJSONFileConfig>, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlas(key: Array<AtlasJSONFileConfig>, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: AtlasXMLFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: Array<AtlasXMLFileConfig>, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun atlasXML(key: Array<AtlasXMLFileConfig>, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: String, urls: String = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: String, urls: Array<String> = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: AudioFileConfig, urls: String = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: AudioFileConfig, urls: Array<String> = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: Array<AudioFileConfig>, urls: String = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audio(key: Array<AudioFileConfig>, urls: Array<String> = definedExternally, config: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: String, jsonURL: String, audioURL: String = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: String, jsonURL: String, audioURL: Array<String> = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: String = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: AudioSpriteFileConfig, jsonURL: String, audioURL: Array<String> = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: Array<AudioSpriteFileConfig>, jsonURL: String, audioURL: String = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(key: Array<AudioSpriteFileConfig>, jsonURL: String, audioURL: Array<String> = definedExternally, audioConfig: Any = definedExternally, audioXhrSettings: XHRSettingsObject = definedExternally, jsonXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun binary(key: String, url: String = definedExternally, dataType: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun binary(key: BinaryFileConfig, url: String = definedExternally, dataType: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun binary(key: Array<BinaryFileConfig>, url: String = definedExternally, dataType: Any = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: String, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: String, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: BitmapFontFileConfig, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: Array<BitmapFontFileConfig>, textureURL: String = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun bitmapFont(key: Array<BitmapFontFileConfig>, textureURL: Array<String> = definedExternally, fontDataURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, fontDataXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun css(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun css(key: CSSFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun css(key: Array<CSSFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun glsl(key: String, url: String = definedExternally, shaderType: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun glsl(key: GLSLFileConfig, url: String = definedExternally, shaderType: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun glsl(key: Array<GLSLFileConfig>, url: String = definedExternally, shaderType: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun html(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun html(key: HTMLFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun html(key: Array<HTMLFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(key: String, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(key: HTMLTextureFileConfig, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(key: Array<HTMLTextureFileConfig>, url: String = definedExternally, width: integer = definedExternally, height: integer = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: String, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: ImageFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: ImageFileConfig, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: Array<ImageFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun image(key: Array<ImageFileConfig>, url: Array<String> = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun json(key: String, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun json(key: JSONFileConfig, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun json(key: Array<JSONFileConfig>, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(key: String, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(key: MultiAtlasFileConfig, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(key: Array<MultiAtlasFileConfig>, atlasURL: String = definedExternally, path: String = definedExternally, baseURL: String = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scripts(key: String, url: Array<String> = definedExternally, extension: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scripts(key: MultiScriptFileConfig, url: Array<String> = definedExternally, extension: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scripts(key: Array<MultiScriptFileConfig>, url: Array<String> = definedExternally, extension: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun pack(key: String, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun pack(key: PackFileConfig, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun pack(key: Array<PackFileConfig>, url: String = definedExternally, dataKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: String, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: String, url: Function<*> = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: PluginFileConfig, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: PluginFileConfig, url: Function<*> = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: Array<PluginFileConfig>, url: String = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun plugin(key: Array<PluginFileConfig>, url: Function<*> = definedExternally, start: Boolean = definedExternally, mapping: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun sceneFile(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun sceneFile(key: SceneFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun sceneFile(key: Array<SceneFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: String, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: String, url: Function<*> = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: ScenePluginFileConfig, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: ScenePluginFileConfig, url: Function<*> = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: Array<ScenePluginFileConfig>, url: String = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(key: Array<ScenePluginFileConfig>, url: Function<*> = definedExternally, systemKey: String = definedExternally, sceneKey: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun script(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun script(key: ScriptFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun script(key: Array<ScriptFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(key: String, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(key: SpriteSheetFileConfig, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(key: Array<SpriteSheetFileConfig>, url: String = definedExternally, frameConfig: ImageFrameConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun svg(key: String, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun svg(key: SVGFileConfig, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun svg(key: Array<SVGFileConfig>, url: String = definedExternally, svgConfig: SVGSizeConfig = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun text(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun text(key: TextFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun text(key: Array<TextFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(key: TilemapCSVFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(key: Array<TilemapCSVFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(key: TilemapImpactFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(key: Array<TilemapImpactFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: TilemapJSONFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: Array<TilemapJSONFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: String, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: String, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: UnityAtlasFileConfig, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: Array<UnityAtlasFileConfig>, textureURL: String = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(key: Array<UnityAtlasFileConfig>, textureURL: Array<String> = definedExternally, atlasURL: String = definedExternally, textureXhrSettings: XHRSettingsObject = definedExternally, atlasXhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: String, urls: String = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: String, urls: Array<String> = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: VideoFileConfig, urls: String = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: VideoFileConfig, urls: Array<String> = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: Array<VideoFileConfig>, urls: String = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun video(key: Array<VideoFileConfig>, urls: Array<String> = definedExternally, loadEvent: String = definedExternally, asBlob: Boolean = definedExternally, noAudio: Boolean = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun xml(key: String, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun xml(key: XMLFileConfig, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open fun xml(key: Array<XMLFileConfig>, url: String = definedExternally, xhrSettings: XHRSettingsObject = definedExternally): LoaderPlugin /* this */
    open var scene: Scene
    open var systems: Systems
    open var cacheManager: CacheManager
    open var textureManager: TextureManager
    open var sceneManager: SceneManager
    open var prefix: String
    open var path: String
    open var baseURL: String
    open var maxParallelDownloads: integer
    open var xhr: XHRSettingsObject
    open var crossOrigin: String
    open var totalToLoad: integer
    open var progress: Number
    open var list: Set<File>
    open var inflight: Set<File>
    open var queue: Set<File>
    open var totalFailed: integer
    open var totalComplete: integer
    open var state: integer
    open fun setBaseURL(url: String = definedExternally): LoaderPlugin /* this */
    open fun setPath(path: String = definedExternally): LoaderPlugin /* this */
    open fun setPrefix(prefix: String = definedExternally): LoaderPlugin /* this */
    open fun setCORS(crossOrigin: String = definedExternally): LoaderPlugin /* this */
    open fun addFile(file: File)
    open fun addFile(file: Array<File>)
    open fun keyExists(file: File): Boolean
    open fun addPack(pack: Any, packKey: String = definedExternally): Boolean
    open fun isLoading(): Boolean
    open fun isReady(): Boolean
    open fun start()
    open fun updateProgress()
    open fun update()
    open fun nextFile(file: File, success: Boolean)
    open fun fileProcessComplete(file: File)
    open fun loadComplete()
    open fun flagForRemoval(file: File)
    open fun saveJSON(data: Any, filename: String = definedExternally): LoaderPlugin /* this */
    open fun save(data: Any, filename: String = definedExternally, filetype: String = definedExternally): LoaderPlugin /* this */
    open fun reset()
    open fun atlas(key: String): LoaderPlugin /* this */
    open fun atlas(key: AtlasJSONFileConfig): LoaderPlugin /* this */
    open fun atlas(key: Array<AtlasJSONFileConfig>): LoaderPlugin /* this */
    open fun atlasXML(key: String): LoaderPlugin /* this */
    open fun atlasXML(key: AtlasXMLFileConfig): LoaderPlugin /* this */
    open fun atlasXML(key: Array<AtlasXMLFileConfig>): LoaderPlugin /* this */
    open fun audio(key: String): LoaderPlugin /* this */
    open fun audio(key: AudioFileConfig): LoaderPlugin /* this */
    open fun audio(key: Array<AudioFileConfig>): LoaderPlugin /* this */
    open fun audioSprite(key: String, jsonURL: String): LoaderPlugin /* this */
    open fun audioSprite(key: AudioSpriteFileConfig, jsonURL: String): LoaderPlugin /* this */
    open fun audioSprite(key: Array<AudioSpriteFileConfig>, jsonURL: String): LoaderPlugin /* this */
    open fun bitmapFont(key: String): LoaderPlugin /* this */
    open fun bitmapFont(key: BitmapFontFileConfig): LoaderPlugin /* this */
    open fun bitmapFont(key: Array<BitmapFontFileConfig>): LoaderPlugin /* this */
    open fun image(key: String): LoaderPlugin /* this */
    open fun image(key: ImageFileConfig): LoaderPlugin /* this */
    open fun image(key: Array<ImageFileConfig>): LoaderPlugin /* this */
    open fun plugin(key: String): LoaderPlugin /* this */
    open fun plugin(key: PluginFileConfig): LoaderPlugin /* this */
    open fun plugin(key: Array<PluginFileConfig>): LoaderPlugin /* this */
    open fun scenePlugin(key: String): LoaderPlugin /* this */
    open fun scenePlugin(key: ScenePluginFileConfig): LoaderPlugin /* this */
    open fun scenePlugin(key: Array<ScenePluginFileConfig>): LoaderPlugin /* this */
    open fun unityAtlas(key: String): LoaderPlugin /* this */
    open fun unityAtlas(key: UnityAtlasFileConfig): LoaderPlugin /* this */
    open fun unityAtlas(key: Array<UnityAtlasFileConfig>): LoaderPlugin /* this */
    open fun video(key: String): LoaderPlugin /* this */
    open fun video(key: VideoFileConfig): LoaderPlugin /* this */
    open fun video(key: Array<VideoFileConfig>): LoaderPlugin /* this */
}

external fun MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject

open external class MultiFile(loader: Phaser.Loader.LoaderPlugin, type: String, key: String, files: Array<Phaser.Loader.File>) {
    open var loader: LoaderPlugin
    open var type: String
    open var key: String
    open var files: Array<File>
    open var complete: Boolean
    open var pending: integer
    open var failed: integer
    open var config: Any
    open var baseURL: String
    open var path: String
    open var prefix: String
    open fun isReadyToProcess(): Boolean
    open fun addToMultiFile(files: File): MultiFile
    open fun onFileComplete(file: File)
    open fun onFileFailed(file: File)
}

external fun XHRLoader(file: File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest

external fun XHRSettings(responseType: XMLHttpRequestResponseType = definedExternally, async: Boolean = definedExternally, user: String = definedExternally, password: String = definedExternally, timeout: integer = definedExternally, withCredentials: Boolean = definedExternally): XHRSettingsObject