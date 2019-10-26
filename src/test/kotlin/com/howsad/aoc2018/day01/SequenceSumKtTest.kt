package com.howsad.aoc2018.day01

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SequenceSumKtTest {

    @Test fun solvePart1ReturnsSumOfSequence() {
        val result = solvePart1(sequenceOf(1, 2, -5))
        assertEquals(-2, result)
    }

    @Test fun solvePart2ReturnsFirstRepeatedSumOfSequence() {
        val result = solvePart2(sequenceOf(1, 2, -5))
        assertEquals(1, result)
    }
}
