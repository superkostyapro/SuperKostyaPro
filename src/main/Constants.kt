package main

const val MW1 = 100
const val MH1 = 30
const val MW2 = 200
const val MH2 = 60
const val MW3 = 400
const val MH3 = 120
const val MW4 = 800
const val MH4 = 240

fun mazeSize(level: Int): Pair<Int, Int> {
    return when (level) {
        2 -> MW2 to MH2
        3 -> MW3 to MH3
        4 -> MW4 to MH4
        else -> MW1 to MH1
    }
}