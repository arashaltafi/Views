package com.arash.altafi.views.kotlin.toast1

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_toast_kotlin.*

class ToastKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin)

        init()
    }

    private fun init() {

        btn_error_toast_1_kotlin.setOnClickListener {
            Toasty.error(this, "This is an error toast." , Toasty.LENGTH_SHORT, true).show()
        }

        btn_success_toast_1_kotlin.setOnClickListener {
            Toasty.success(this, "Success!" , Toasty.LENGTH_SHORT, true).show()
        }

        btn_info_toast_1_kotlin.setOnClickListener {
            Toasty.info(this, "Here is some info for you." , Toasty.LENGTH_SHORT, true).show()
        }

        btn_info_with_formatting_toast_1_kotlin.setOnClickListener {
            Toasty.info(this, getFormattedMessage().toString()).show()
        }

        btn_warning_toast_1_kotlin.setOnClickListener {
            Toasty.warning(this, "Beware of the dog." , Toasty.LENGTH_SHORT, true).show()
        }

        btn_normal_without_icon_toast_1_kotlin.setOnClickListener {
            Toasty.normal(this, "Normal toast without icon").show()
        }

        btn_normal_with_icon_toast_1_kotlin.setOnClickListener {
            val icon = ContextCompat.getDrawable(this , R.drawable.ic_baseline_person_outline_24)
            Toasty.normal(this, "Normal toast with icon" , icon).show()
        }

        btn_custom_configuration_toast_1_kotlin.setOnClickListener {
            Toasty.Config.getInstance().setToastTypeface(Typeface.createFromAsset(assets, "vazir.ttf")).allowQueue(false).apply()
            val icon = ContextCompat.getDrawable(this , R.drawable.ic_baseline_person_outline_24)
            Toasty.custom(this, "آرش الطافی", icon , Color.BLACK , Color.RED , Toasty.LENGTH_SHORT, true, true).show()
            Toasty.Config.reset() // Use this if you want to use the configuration above only once

        }

    }

    private fun getFormattedMessage(): CharSequence? {
        val prefix = "Formatted "
        val highlight = "bold italic"
        val suffix = " text"
        val ssb = SpannableStringBuilder(prefix).append(highlight).append(suffix)
        val prefixLen = prefix.length
        ssb.setSpan(StyleSpan(Typeface.BOLD_ITALIC), prefixLen, prefixLen + highlight.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        return ssb
    }

}