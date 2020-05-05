@file:Suppress("UnsafeCastFromDynamic")

package main.scene

import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Text
import Phaser.Geom.Rectangle
import Phaser.Types.GameObjects.Text.TextStyle
import main.extension.dp
import main.extension.jsObject
import org.w3c.dom.get
import kotlin.browser.localStorage

class MenuScene : BaseScene(jsObject {
    key = "Menu"
}) {

    private lateinit var graphics: Graphics

    private lateinit var gameText: Text

    private lateinit var copyrightText: Text

    private val worldsTexts = mutableListOf<Text>()

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
            fontSize = "24px"
            color = "#fdbbad"
        }).setOrigin(1, 0)
        addWorldText(1) {
            with(scene) {
                stop("Menu")
                start("Engine")
            }
        }
        addWorldText(2) {
            with(scene) {
                stop("Menu")
                start("Program")
            }
        }
        addWorldText(3) {
            with(scene) {
                stop("Menu")
                start("King")
            }
        }
    }

    private fun addWorldText(id: Int, action: () -> Unit) {
        val level = localStorage["world$id"]
        val enable = id == 1 || !level.isNullOrBlank()
        worldsTexts.add(add.text(0, 0, "WORLD $id-${level ?: 1}", jsObject<TextStyle> {
            fontFamily = "sans-serif"
            fontStyle = "bold"
            fontSize = "24px"
            color = if (enable) "#ffffff" else "#ffffff99"
        }).apply {
            if (enable) {
                setInteractive(jsObject {
                    useHandCursor = true
                })
                on("pointerdown", action)
            }
        })
    }

    @Suppress("UNUSED_VARIABLE")
    override fun update(time: Float, delta: Float) {
        val padding = 10.dp(0.7f)
        val halfLine = 1.dp(0.7f)
        val halfPoint = 2.dp(0.7f)
        val cX = cameras.main.centerX.toFloat()
        val cY = cameras.main.centerY.toFloat()
        val gameBounds: Rectangle = gameText.getBounds()
        val gameWidth = gameBounds.width.toFloat()
        val gameHeight = gameBounds.height.toFloat()
        gameText.apply {
            x = cX - gameWidth / 2
            y = 60
        }
        val blockX = gameBounds.x.toFloat() - padding
        val blockY = gameBounds.y.toFloat() - padding / 2
        val blockWidth = gameWidth + 2 * padding
        val blockHeight = gameHeight + 3 * padding / 2
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
            y = blockY + blockHeight
        }
        val copyrightBounds: Rectangle = copyrightText.getBounds()
        worldsTexts.forEachIndexed { i, text ->
            val worldBounds: Rectangle = text.getBounds()
            text.apply {
                x = cX - worldBounds.width.toFloat() / 2
                y = copyrightBounds.bottom.toFloat() + 20.dp(0.5f) +
                    i * (worldBounds.height.toFloat() + 15.dp(0.5f))
            }
        }
    }
}