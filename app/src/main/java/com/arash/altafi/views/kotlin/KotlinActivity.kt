package com.arash.altafi.views.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.animation1.AnimationKotlinActivity1
import com.arash.altafi.views.kotlin.animation2.AnimationKotlinActivity2
import com.arash.altafi.views.kotlin.checkbox1.CheckBoxKotlinActivity1
import com.arash.altafi.views.kotlin.datepicker.DatePickerKotlinActivity
import com.arash.altafi.views.kotlin.dialog1.DialogKotlinActivity1
import com.arash.altafi.views.kotlin.dialog2.DialogKotlinActivity2
import com.arash.altafi.views.kotlin.dialog3.DialogKotlinActivity3
import com.arash.altafi.views.kotlin.image1.ImageKotlinActivity1
import com.arash.altafi.views.kotlin.image2.ImageKotlinActivity2
import com.arash.altafi.views.kotlin.image3.ImageKotlinActivity3
import com.arash.altafi.views.kotlin.lottie.LottieKotlinActivity
import com.arash.altafi.views.kotlin.numberpicker.NumberPickerKotlinActivity
import com.arash.altafi.views.kotlin.progressbar1.ProgressBarKotlinActivity1
import com.arash.altafi.views.kotlin.progressbar2.ProgressBarKotlinActivity2
import com.arash.altafi.views.kotlin.progressbar3.ProgressBarKotlinActivity3
import com.arash.altafi.views.kotlin.progressbar4.ProgressBarKotlinActivity4
import com.arash.altafi.views.kotlin.shimmer1.ShimmerKotlinActivity1
import com.arash.altafi.views.kotlin.shimmer2.ShimmerKotlinActivity2
import com.arash.altafi.views.kotlin.shimmer3.views.ShimmerKotlinActivity3
import com.arash.altafi.views.kotlin.snackbar1.SnackBarKotlinActivity1
import com.arash.altafi.views.kotlin.switchbutton1.SwitchButtonKotlinActivity1
import com.arash.altafi.views.kotlin.switchbutton2.SwitchButtonKotlinActivity2
import com.arash.altafi.views.kotlin.text1.TextKotlinActivity1
import com.arash.altafi.views.kotlin.text2.TextKotlinActivity2
import com.arash.altafi.views.kotlin.toast1.ToastKotlinActivity1
import com.arash.altafi.views.kotlin.toast2.ToastKotlinActivity2
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_kotlin)

        supportActionBar!!.hide()
//        supportActionBar!!.show()
//        getActivity().getSupportActionBar().hide();
//        getActivity().getSupportActionBar().hide();

        init()
    }

    private fun init() {

        btn_toast_1_kotlin.setOnClickListener {
            startActivity(Intent(this , ToastKotlinActivity1::class.java))
        }

        btn_toast_2_kotlin.setOnClickListener {
            startActivity(Intent(this , ToastKotlinActivity2::class.java))
        }

        btn_snackbar_1_kotlin.setOnClickListener {
            startActivity(Intent(this , SnackBarKotlinActivity1::class.java))
        }

        btn_progressbar_1_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity1::class.java))
        }

        btn_progressbar_2_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity2::class.java))
        }

        btn_progressbar_3_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity3::class.java))
        }

        btn_progressbar_4_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity4::class.java))
        }

        btn_dialog_1_kotlin.setOnClickListener {
            startActivity(Intent(this , DialogKotlinActivity1::class.java))
        }

        btn_dialog_2_kotlin.setOnClickListener {
            startActivity(Intent(this , DialogKotlinActivity2::class.java))
        }

        btn_dialog_3_kotlin.setOnClickListener {
            startActivity(Intent(this , DialogKotlinActivity3::class.java))
        }

        btn_lottie_1_kotlin.setOnClickListener {
            startActivity(Intent(this , LottieKotlinActivity::class.java))
        }

        btn_number_picker_1_kotlin.setOnClickListener {
            startActivity(Intent(this , NumberPickerKotlinActivity::class.java))
        }

        btn_date_picker_1_kotlin.setOnClickListener {
            startActivity(Intent(this , DatePickerKotlinActivity::class.java))
        }

        btn_shimmer_1_kotlin.setOnClickListener {
            startActivity(Intent(this , ShimmerKotlinActivity1::class.java))
        }

        btn_shimmer_2_kotlin.setOnClickListener {
            startActivity(Intent(this , ShimmerKotlinActivity2::class.java))
        }

        btn_shimmer_3_kotlin.setOnClickListener {
            startActivity(Intent(this , ShimmerKotlinActivity3::class.java))
        }

        btn_text_1_kotlin.setOnClickListener {
            startActivity(Intent(this , TextKotlinActivity1::class.java))
        }

        btn_text_2_kotlin.setOnClickListener {
            startActivity(Intent(this , TextKotlinActivity2::class.java))
        }

        btn_animation_1_kotlin.setOnClickListener {
            startActivity(Intent(this , AnimationKotlinActivity1::class.java))
        }

        btn_animation_2_kotlin.setOnClickListener {
            startActivity(Intent(this , AnimationKotlinActivity2::class.java))
        }

        btn_image_1_kotlin.setOnClickListener {
            startActivity(Intent(this , ImageKotlinActivity1::class.java))
        }

        btn_image_2_kotlin.setOnClickListener {
            startActivity(Intent(this , ImageKotlinActivity2::class.java))
        }

        btn_image_3_kotlin.setOnClickListener {
            startActivity(Intent(this , ImageKotlinActivity3::class.java))
        }

        btn_switch_button_1_kotlin.setOnClickListener {
            startActivity(Intent(this , SwitchButtonKotlinActivity1::class.java))
        }

        btn_switch_button_2_kotlin.setOnClickListener {
            startActivity(Intent(this , SwitchButtonKotlinActivity2::class.java))
        }

        btn_check_box_1_kotlin.setOnClickListener {
            startActivity(Intent(this , CheckBoxKotlinActivity1::class.java))
        }

    }

}