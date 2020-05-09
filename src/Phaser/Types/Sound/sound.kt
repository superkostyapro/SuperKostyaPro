package Phaser.Types.Sound

import Phaser.Sound.BaseSound
import Phaser.Sound.BaseSoundManager

typealias EachActiveSoundCallback = (manager: BaseSoundManager, sound: BaseSound, index: Number, sounds: Array<BaseSound>) -> Unit