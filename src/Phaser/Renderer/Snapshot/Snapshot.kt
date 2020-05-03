package Phaser.Renderer.Snapshot

import Phaser.Types.Renderer.Snapshot.SnapshotState
import org.w3c.dom.HTMLCanvasElement

external fun Canvas(sourceCanvas: HTMLCanvasElement, config: SnapshotState)

external fun WebGL(sourceCanvas: HTMLCanvasElement, config: SnapshotState)