package com.arash.altafi.views.kotlin.ext

import kotlin.random.Random

fun IntRange.getRandom() =
    Random.nextInt(start, endInclusive + 1)