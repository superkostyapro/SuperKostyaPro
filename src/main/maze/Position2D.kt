/*
 * Copyright (c) 2019 Nicolas Maltais
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to
 * deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom
 * the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package main.maze

import kotlin.math.absoluteValue

/**
 * A 2D position.
 */
open class Position2D(val x: Int, val y: Int) : Position {

    /**
     * Compute the Manhattan distance between this position and [pos].
     */
    override fun distanceTo(pos: Position) =
        ((pos as Position2D).x - x).absoluteValue + (pos.y - y).absoluteValue

    override operator fun plus(pos: Position) =
        Position2D(x + (pos as Position2D).x, y + pos.y)

    override fun compareTo(pos: Position) = when {
        x == (pos as Position2D).x && y == pos.y -> 0
        x > pos.x || x == pos.x && y > pos.y -> 1
        else -> -1
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Position2D) return false
        return x == other.x && y == other.y
    }

    override fun hashCode(): Int {
        // Unique hashcodes up to 65536
        return (x shl 16) and y
    }

    override fun toString() = "[x: $x, y: $y]"
}
