package com.arash.altafi.views.kotlin.unique

import java.util.*

object UniqueUtils {

    fun getRandomUnique(): UUID = UUID.randomUUID()

    fun getRandomUniqueId(): Long {
        return getRandomUnique().mostSignificantBits and Long.MAX_VALUE
    }

    fun getRandomUniqueHashId(): Long {
        return ("${getRandomUnique()}" +
                "${getRandomUniqueId()}-${TimeUtils.getCurrentMillis()}"
                ).getHashLong()
    }

    fun getRandomUniqueHashId(custom: Any): Long {
        return ("${getRandomUnique()}" +
                "+${getRandomUniqueId()}" +
                "+${TimeUtils.getCurrentMillis()}" +
                "+$custom").getHashLong()
    }
}