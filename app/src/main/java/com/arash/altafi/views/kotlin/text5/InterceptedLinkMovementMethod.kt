package com.arash.altafi.views.kotlin.text5

import android.text.Spannable
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.util.Linkify
import android.util.Patterns
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat
import com.arash.altafi.views.kotlin.ext.cast
import java.util.regex.Pattern

/**
 * Usage:
 * fooTextView.movementMethod = InterceptedLinkMovementMethod(this)
 * Where 'this' implements [TextViewLinkClickListener]
 *
 * Note: use [TextViewFixTouchConsume] to prevent conflicts
 * with [TextView.onTouchEvent] for further usages(like [ContextMenu])
 */
class InterceptedLinkMovementMethod(
    private val listener: TextViewLinkClickListener,
) : LinkMovementMethod() {

    private lateinit var textView: TextView
    private lateinit var spannable: Spannable
    private val gestureDetector: GestureDetectorCompat by lazy {
        GestureDetectorCompat(textView.context, simpleTapListener)
    }

    override fun onTouchEvent(widget: TextView, buffer: Spannable, event: MotionEvent): Boolean {
        textView = widget
        spannable = buffer
        return gestureDetector.onTouchEvent(event)
    }

    private val simpleTapListener = object : GestureDetector.SimpleOnGestureListener() {

        private var mLinkText: String = ""
        private var mLinkType: LinkTypes = LinkTypes.NONE

        private fun detectType(event: MotionEvent): Boolean {
            val linkText = getLinkText(textView, spannable, event)
            val linkType = LinkTypes.getLinkTypeFromText(linkText)

            mLinkText = linkText
            mLinkType = linkType

            return if (linkType != LinkTypes.NONE) {
                textView.cast<TextViewFixTouchConsume>()?.let {
                    it.linkHit = true
                }

                true
            } else {
                false
            }
        }

        override fun onDown(e: MotionEvent): Boolean {
            return detectType(e)
        }

        override fun onSingleTapConfirmed(event: MotionEvent): Boolean {
            return if (mLinkType != LinkTypes.NONE) {
                listener.onLinkClicked(mLinkText, mLinkType)
                true
            } else {
                false
            }

        }

        override fun onLongPress(e: MotionEvent) {
            if (mLinkType != LinkTypes.NONE) {
                listener.onLinkLongClicked(mLinkText, mLinkType)
            }

        }

        private fun getLinkText(widget: TextView, buffer: Spannable, event: MotionEvent): String {
            var x = event.x.toInt()
            var y = event.y.toInt()
            x -= widget.totalPaddingLeft
            y -= widget.totalPaddingTop
            x += widget.scrollX
            y += widget.scrollY
            val layout = widget.layout
            val line = layout.getLineForVertical(y)
            val off = layout.getOffsetForHorizontal(line, x.toFloat())
            val link = buffer.getSpans(off, off, ClickableSpan::class.java)
            if (link.isEmpty()) return ""
            return buffer
                .subSequence(buffer.getSpanStart(link[0]), buffer.getSpanEnd(link[0]))
                .toString()
        }

    }
}

/**
 * **order** of items is *important*
 * because [InterceptedLinkMovementMethod.SimpleTapListener.getLinkText] only takes first match
 *
 * example:
 * - "arashaltafi1377@gmail.com" : can be 3 of types:
 * 1. email     ->  "arashaltafi1377@gmail.com"
 * 2. web       ->  "arashaltafi.ir" / "gmail.com"
 * 3. username  ->  "@gmail"
 *
 * @param pair.second [Linkify.MatchFilter] is for situation with complicated patterns
 */
enum class LinkTypes(val pair: Pair<Pattern, Linkify.MatchFilter?>?) {
    EMAIL_ADDRESS(
        Pair(
            Patterns.EMAIL_ADDRESS,
            null
        )
    ),

    PHONE(
        Pair(
            Patterns.PHONE,
            null
        )
    ),

    WEB_URL(
        Pair(
            Patterns.WEB_URL,
            null
        )
    ),

    USER_NAME(
        Pair(
            Pattern.compile("@[\\w\\d]+"),
            null
        )
    ),

    NONE(null);

    companion object {
        fun getLinkTypeFromText(text: String): LinkTypes {
            values().forEach { linkTypes ->
                if (linkTypes.pair != null && linkTypes.pair.first.matcher(text).matches()) {
                    return linkTypes
                }
            }

            return NONE
        }
    }
}

interface TextViewLinkClickListener {
    fun onLinkClicked(linkText: String, linkTypes: LinkTypes)

    fun onLinkLongClicked(linkText: String, linkTypes: LinkTypes)
}