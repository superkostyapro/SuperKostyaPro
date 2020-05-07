package main.maze

import main.maze.generator.AldousBroderGenerator

fun generateMaze(width: Int, height: Int): Maze {
    val maze = OrthogonalMaze(width, height)
    AldousBroderGenerator().generate(maze)
    return maze
}