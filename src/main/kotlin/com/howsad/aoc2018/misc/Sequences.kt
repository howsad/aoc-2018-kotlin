package com.howsad.aoc2018.misc

fun <T> Sequence<T>.loop(): Sequence<T> {
    val iterator = this.iterator()
    if (!iterator.hasNext()) {
        return sequenceOf()
    }
    return sequence {
        val recordedValues = mutableListOf<T>()
        while(iterator.hasNext()) {
            val next = iterator.next()
            recordedValues.add(next)
            yield(next)
        }
        while (true) {
            recordedValues.forEach {yield(it)}
        }
    }
}
