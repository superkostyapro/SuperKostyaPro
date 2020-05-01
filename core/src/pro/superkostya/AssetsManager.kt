package pro.superkostya

import com.badlogic.gdx.utils.Disposable

class AssetsManager : Disposable {

    override fun dispose() {
    }

    companion object {

        private var assetsManager: AssetsManager? = null

        fun getInstance(): AssetsManager {
            if (assetsManager == null) {
                assetsManager = AssetsManager()
            }
            return assetsManager!!
        }
    }
}