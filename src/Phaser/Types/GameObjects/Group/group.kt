package Phaser.Types.GameObjects.Group

import Phaser.GameObjects.GameObject

typealias GroupCallback = (item: GameObject) -> Unit

typealias GroupMultipleCreateCallback = (items: Array<GameObject>) -> Unit