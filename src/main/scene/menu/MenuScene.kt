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

    private lateinit var moneyText: Text

    private lateinit var gameText: Text

    private lateinit var copyrightText: Text

    private val menu = mutableListOf<Text>()

    override fun create() {
        graphics = add.graphics()
        moneyText = add.text(16, 16, "KOSTYA\n0000000", jsObject<TextStyle> {
            fontFamily = "sans-serif"
            fontStyle = "bold"
            fontSize = "24px"
            color = "#ffffffdd"
        })
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
        menu.add(add.existing(TextMenu(this, 1) {
            with(scene) {
                stop("Menu")
                start("Draw")
            }
        }) as Text)
        menu.add(add.existing(TextMenu(this, 2) {
            with(scene) {
                stop("Menu")
                start("CAD")
            }
        }) as Text)
        menu.add(add.existing(TextMenu(this, 3) {
            with(scene) {
                stop("Menu")
                start("King")
            }
        }) as Text)
        menu.add((add.existing(TextMenu(this, "TO BE CONTINUED...", null)) as Text).apply {
            setFontSize(20)
        })
    }

    @Suppress("UNUSED_VARIABLE")
    override fun update(time: Float, delta: Float) {
        val padding = 10f
        val halfLine = 1
        val halfPoint = 2
        val cX = cameras.main.centerX
        val cY = cameras.main.centerY
        val moneyBounds = moneyText.getBounds<Rectangle>()
        val gameBounds = gameText.getBounds<Rectangle>()
        gameText.apply {
            x = cX - gameBounds.width / 2
            y = moneyBounds.bottom + 20
        }
        val blockX = gameBounds.x - padding
        val blockY = gameBounds.y - padding / 2
        val blockWidth = gameBounds.width + 2 * padding
        val blockHeight = gameBounds.height + 3 * padding / 2
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
            x = cX + blockWidth / 2
            y = blockY + blockHeight
        }
        val copyrightBounds = copyrightText.getBounds<Rectangle>()
        menu.forEachIndexed { i, text ->
            text.apply {
                val bounds = getBounds<Rectangle>()
                x = cX - bounds.width / 2
                y = copyrightBounds.bottom + 20 + i * (bounds.height + 15)
            }
        }
    }
}