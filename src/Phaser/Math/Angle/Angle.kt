package Phaser.Math.Angle

import kotlin.js.*
import Phaser.Types.Math.Vector2Like

external fun Between(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun BetweenPoints(point1: Vector2Like, point2: Vector2Like): Number

external fun BetweenPointsY(point1: Vector2Like, point2: Vector2Like): Number

external fun BetweenY(x1: Number, y1: Number, x2: Number, y2: Number): Number

external fun CounterClockwise(angle: Number): Number

external fun Normalize(angle: Number): Number

external fun Random(): Number

external fun RandomDegrees(): Number

external fun Reverse(angle: Number): Number

external fun RotateTo(currentAngle: Number, targetAngle: Number, lerp: Number = definedExternally): Number

external fun ShortestBetween(angle1: Number, angle2: Number): Number

external fun Wrap(angle: Number): Number

external fun WrapDegrees(angle: Number): Number