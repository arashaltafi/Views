package com.arash.altafi.views.kotlin.dialog4

import com.arash.altafi.views.kotlin.ext.applyValue

object TimeUtils {

    fun getCurrentMillis() = System.currentTimeMillis()
    fun getCurrentSecond() = getSecond(getCurrentMillis())

    fun getSecond(unixTime: Long) = unixTime / 1000

    fun getUnixTime(second: Long) = second * 1000

    /**
     * @param time in second
     *
     * @return "hh:mm:ss" or "mm:ss"
     */
    fun formatTime(time: Long): String {
        val hour: Int = ((time / 3600) % 60).toInt()
        val minute: Int = ((time / 60) % 60).toInt()
        val second: Int = (time % 60).toInt()

        return if (hour > 0) {
            "%02d:%02d:%02d".applyValue(hour, minute, second)
        } else {
            "%02d:%02d".applyValue(minute, second)
        }
    }
}