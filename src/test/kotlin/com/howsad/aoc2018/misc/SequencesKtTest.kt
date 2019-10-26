package com.howsad.aoc2018.misc

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

internal class SequencesKtTest {

    @Test fun loopRepeatsElement3Times() {
        val materializedLoop = sequenceOf(1)
                .loop()
                .take(3)
                .toCollection(mutableListOf())
        assertEquals(listOf(1, 1, 1), materializedLoop)
    }

    @Test fun loopRepeatsElementInTheCorrectOrder() {
        val materializedLoop = sequenceOf(1, 2, 3)
                .loop()
                .take(5)
                .toCollection(mutableListOf())
        assertEquals(listOf(1, 2, 3, 1, 2), materializedLoop)
    }

    @Test fun loopOfEmptySequenceIsEmpty() {
        val hasNext = sequenceOf<Int>()
                .loop()
                .iterator()
                .hasNext()
        assertFalse { hasNext }
    }
}
