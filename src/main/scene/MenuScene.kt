@file:Suppress("UnsafeCastFromDynamic")

package main.scene

import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Text
import Phaser.Geom.Rectangle
import Phaser.Types.GameObjects.Graphics.FillStyle
import main.extension.jsObject

class MenuScene : BaseScene(jsObject {
    key = "Menu"
}) {

    private lateinit var graphics: Graphics

    private lateinit var gameText: Text

    private lateinit var copyrightText: Text

    override fun create() {
        graphics = add.graphics(jsObject {
            fillStyle = jsObject<FillStyle> {
                color = 0xc74b0b
            }
        })
        gameText = add.text(0, 0, "SUPER\nKOSTYA PRO.", jsObject<dynamic> {
            fontFamily = "NSMBWii"
            fontSize = "72px"
            color = "#fbbbaf"
        }).setShadow(0, 5, "#000000", 2, false, true)
        copyrightText = add.text(0, 0, "©2020 VLAD", jsObject<dynamic> {
            fontFamily = "sans-serif"
            fontSize = "24px"
            color = "#fdbbad"
        }).setOrigin(1, 0)
    }

    override fun update(time: Float, delta: Float) {
        val padding = 10f
        val cX = cameras.main.centerX.toFloat()
        val cY = cameras.main.centerY.toFloat()
        val gameBounds: Rectangle = gameText.getBounds()
        graphics.clear()
        gameText.x = cX - gameBounds.width.toFloat() / 2
        gameText.y = cY - gameBounds.height.toFloat() / 2
        graphics.fillRect(
            gameBounds.x.toFloat() - padding,
            gameBounds.y.toFloat() - padding / 2,
            gameBounds.width.toFloat() + 2 * padding,
            gameBounds.height.toFloat() + 2 * padding
        )
        copyrightText.x = cX + gameBounds.width.toFloat() / 2 + padding
        copyrightText.y = gameBounds.bottom.toFloat() + padding
    }
}