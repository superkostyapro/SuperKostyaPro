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
        })
        gameText.setShadow(0, 5, "#000000", 2, false, true)
    }

    override fun update(time: Float, delta: Float) {
        val cX = cameras.main.centerX.toFloat()
        val cY = cameras.main.centerY.toFloat()
        val bounds: Rectangle = gameText.getBounds()
        gameText.x = cX - bounds.width.toFloat() / 2
        gameText.y = cY - bounds.height.toFloat() / 2
        graphics.clear()
        val padding = 10f
        graphics.fillRect(
            bounds.x.toFloat() - padding,
            bounds.y.toFloat() - padding / 2,
            bounds.width.toFloat() + 2 * padding,
            bounds.height.toFloat() + 2 * padding
        )
    }
}