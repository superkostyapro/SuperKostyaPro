@file:Suppress("UnsafeCastFromDynamic")

package main.scene.menu

import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Text
import Phaser.Geom.Rectangle
import Phaser.Types.GameObjects.Text.TextStyle
import main.extension.jsObject
import main.scene.BaseScene

class MenuScene : BaseScene(jsObject {
    key = "Menu"
}) {

    private lateinit var graphics: Graphics

    private lateinit var gameText: Text

    private lateinit var copyrightText: Text

    override fun create() {
        graphics = add.graphics()
        gameText = add.text(0, 0, "SUPER\nKOSTYA PRO.", jsObject<TextStyle> {
            fontFamily = "NSMBWii"
            fontSize = "72px"
            color = "#fbbbaf"
        }).setShadow(0, 5, "#000000", 2, false, true)
        copyrightText = add.text(0, 0, "©2020 VLAD", jsObject<TextStyle> {
            fontFamily = "sans-serif"
            fontStyle = "bold"
            fontSize = "20px"
            color = "#fdbbad"
        }).setOrigin(1, 0)
    }

    override fun update(time: Float, delta: Float) {
        val cX = cameras.main.centerX.toFloat()
        val cY = cameras.main.centerY.toFloat()
        val gameBounds: Rectangle = gameText.getBounds()
        val gameWidth = gameBounds.width.toFloat()
        val gameHeight = gameBounds.height.toFloat()
        val padding = 10f
        val blockX = gameBounds.x.toFloat() - padding
        val blockY = gameBounds.y.toFloat() - padding / 2
        val blockWidth = gameWidth + 2 * padding
        val blockHeight = gameHeight + 3 * padding / 2
        val topOffset = 100f
        val halfPoint = 2f
        val halfLine = 1f
        gameText.apply {
            x = cX - gameWidth / 2
            y = cY - gameHeight / 2 - topOffset
        }
        graphics.clear()
            .fillStyle(0xc74b0b)
            .fillRect(blockX, blockY, blockWidth, blockHeight)
            .lineStyle(halfLine * 2, 0xeab3b0)
            .lineBetween(blockX, blockY - halfLine, blockX + blockWidth, blockY - halfLine)
            .lineBetween(blockX - halfLine, blockY, blockX - halfLine, blockY + blockHeight)
            .lineStyle(halfLine * 2, 0x000000)
            .lineBetween(
                blockX + blockWidth + halfLine,
                blockY,
                blockX + blockWidth + halfLine,
                blockY + blockHeight
            )
            .lineBetween(
                blockX,
                blockY + blockHeight + halfLine,
                blockX + blockWidth,
                blockY + blockHeight + halfLine
            )
            .fillStyle(0x000000)
            .fillPoint(
                blockX + padding / 2 + halfPoint,
                blockY + padding / 2 + halfPoint,
                halfPoint * 2
            )
            .fillPoint(
                blockX + blockWidth - padding / 2,
                blockY + padding / 2 + halfPoint,
                halfPoint * 2
            )
            .fillPoint(
                blockX + padding / 2 + halfPoint,
                blockY + blockHeight - padding / 2,
                halfPoint * 2
            )
            .fillPoint(
                blockX + blockWidth - padding / 2,
                blockY + blockHeight - padding / 2,
                halfPoint * 2
            )
            .fillStyle(0xfeb9aa)
            .fillPoint(blockX + padding / 2, blockY + padding / 2, halfPoint * 2)
            .fillPoint(
                blockX + blockWidth - padding / 2 - halfPoint,
                blockY + padding / 2,
                halfPoint * 2
            )
            .fillPoint(
                blockX + padding / 2,
                blockY + blockHeight - padding / 2 - halfPoint,
                halfPoint * 2
            )
            .fillPoint(
                blockX + blockWidth - padding / 2 - halfPoint,
                blockY + blockHeight - padding / 2 - halfPoint,
                halfPoint * 2
            )
        copyrightText.apply {
            x = cX + gameWidth / 2 + padding
            y = gameBounds.bottom.toFloat() + padding
        }
    }
}