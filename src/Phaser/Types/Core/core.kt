package Phaser.Types.Core

import Phaser.Game

typealias BootCallback = (game: Game) -> Unit

typealias NOOP = () -> Unit

typealias TimeStepCallback = (time: Number, average: Number, interpolation: Number) -> Unit