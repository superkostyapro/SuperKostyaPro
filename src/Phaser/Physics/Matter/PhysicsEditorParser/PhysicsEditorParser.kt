package Phaser.Physics.Matter.PhysicsEditorParser

import MatterJS.BodyType
import Phaser.Types.Physics.Matter.MatterBodyConfig

external fun parseBody(x: Number, y: Number, config: Any?, options: MatterBodyConfig = definedExternally): BodyType

external fun parseFixture(fixtureConfig: Any?): Array<BodyType>

external fun parseVertices(vertexSets: Array<Any>, options: MatterBodyConfig = definedExternally): Array<BodyType>