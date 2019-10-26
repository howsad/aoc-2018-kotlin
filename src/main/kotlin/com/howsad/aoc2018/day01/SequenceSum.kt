package com.howsad.aoc2018.day01

import com.howsad.aoc2018.misc.loop

fun main() {
    val inputSequence: Sequence<Int> = generateSequence { readLine() }
            .map { it.toInt() }

    print(solvePart2(inputSequence))
}

fun solvePart1(inputSequence: Sequence<Int>): Int {
    return inputSequence.sum()
}

fun solvePart2(inputSequence: Sequence<Int>): Int {
    var sum = 0
    val sumsEncountered = mutableSetOf<Int>()
    return inputSequence
            .loop()
            .map {
                sum += it
                sum
            }
            .first { !sumsEncountered.add(it) }
}

