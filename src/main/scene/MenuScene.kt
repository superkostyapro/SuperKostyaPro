@file:Suppress("UnsafeCastFromDynamic")

package main.scene

import main.extension.jsObject

class MenuScene : BaseScene(jsObject {
    key = "Start"
}) {

    override fun create() {
        addMenuOption('Credits', function() {
            game.state.start("Credits");
        });
        add.text(50, 50, "Start", jsObject<dynamic> {
            fill = "#dfdfdf"
            fontSize = "40px"
        })
        input.on("pointerdown", {
            scene.stop("Start")
            scene.start("World")
        })
    }
}