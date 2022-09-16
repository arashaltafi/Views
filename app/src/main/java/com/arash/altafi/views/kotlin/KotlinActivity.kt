package com.arash.altafi.views.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.views.BuildConfig
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.animation1.AnimationKotlinActivity1
import com.arash.altafi.views.kotlin.animation2.AnimationKotlinActivity2
import com.arash.altafi.views.kotlin.autoComplete1.AutoCompleteKotlinActivity1
import com.arash.altafi.views.kotlin.boomMenu.BoomMenuActivity
import com.arash.altafi.views.kotlin.chart1.Chart1KotlinActivity
import com.arash.altafi.views.kotlin.chart2.Chart2KotlinActivity
import com.arash.altafi.views.kotlin.chart3.Chart3KotlinActivity
import com.arash.altafi.views.kotlin.checkbox1.CheckBoxKotlinActivity1
import com.arash.altafi.views.kotlin.chip1.ChipKotlinActivity1
import com.arash.altafi.views.kotlin.customtab.CustomTabKotlinActivity1
import com.arash.altafi.views.kotlin.datepicker1.DatePickerKotlinActivity1
import com.arash.altafi.views.kotlin.datepicker2.DatePickerKotlinActivity2
import com.arash.altafi.views.kotlin.datepicker3.DatePickerKotlinActivity3
import com.arash.altafi.views.kotlin.dialog1.DialogKotlinActivity1
import com.arash.altafi.views.kotlin.dialog2.DialogKotlinActivity2
import com.arash.altafi.views.kotlin.dialog3.DialogKotlinActivity3
import com.arash.altafi.views.kotlin.dialog4.DialogKotlinActivity4
import com.arash.altafi.views.kotlin.image1.ImageKotlinActivity1
import com.arash.altafi.views.kotlin.image2.ImageKotlinActivity2
import com.arash.altafi.views.kotlin.image3.ImageKotlinActivity3
import com.arash.altafi.views.kotlin.image4.ImageKotlinActivity4
import com.arash.altafi.views.kotlin.image5.ImageKotlinActivity5
import com.arash.altafi.views.kotlin.lottie.LottieKotlinActivity
import com.arash.altafi.views.kotlin.numberpicker.NumberPickerKotlinActivity
import com.arash.altafi.views.kotlin.popupwindow1.PopupWindowKotlinActivity1
import com.arash.altafi.views.kotlin.popupwindow2.PopupWindowKotlinActivity2
import com.arash.altafi.views.kotlin.popupwindow3.PopupWindowKotlinActivity3
import com.arash.altafi.views.kotlin.popupwindow4.PopupWindowKotlinActivity4
import com.arash.altafi.views.kotlin.progressbar1.ProgressBarKotlinActivity1
import com.arash.altafi.views.kotlin.progressbar2.ProgressBarKotlinActivity2
import com.arash.altafi.views.kotlin.progressbar3.ProgressBarKotlinActivity3
import com.arash.altafi.views.kotlin.progressbar4.ProgressBarKotlinActivity4
import com.arash.altafi.views.kotlin.progressbar5.ProgressBarKotlinActivity5
import com.arash.altafi.views.kotlin.progressbar6.ProgressBarKotlinActivity6
import com.arash.altafi.views.kotlin.ratingbar1.RatingBarKotlinActivity1
import com.arash.altafi.views.kotlin.recyclerView1.RecyclerViewKotlinActivity1
import com.arash.altafi.views.kotlin.shimmer1.ShimmerKotlinActivity1
import com.arash.altafi.views.kotlin.shimmer2.ShimmerKotlinActivity2
import com.arash.altafi.views.kotlin.shimmer3.views.ShimmerKotlinActivity3
import com.arash.altafi.views.kotlin.snackbar1.SnackBarKotlinActivity1
import com.arash.altafi.views.kotlin.switchbutton1.SwitchButtonKotlinActivity1
import com.arash.altafi.views.kotlin.switchbutton2.SwitchButtonKotlinActivity2
import com.arash.altafi.views.kotlin.switchbutton3.SwitchButtonKotlinActivity3
import com.arash.altafi.views.kotlin.text1.TextKotlinActivity1
import com.arash.altafi.views.kotlin.text2.TextKotlinActivity2
import com.arash.altafi.views.kotlin.text3.TextKotlinActivity3
import com.arash.altafi.views.kotlin.text4.TextKotlinActivity4
import com.arash.altafi.views.kotlin.text5.TextKotlinActivity5
import com.arash.altafi.views.kotlin.textJustify.JustifyKotlinActivity
import com.arash.altafi.views.kotlin.toast1.ToastKotlinActivity1
import com.arash.altafi.views.kotlin.toast2.ToastKotlinActivity2
import com.arash.altafi.views.kotlin.toast3.ToastKotlinActivity3
import com.arash.altafi.views.kotlin.toast4.ToastKotlinActivity4
import com.arash.altafi.views.kotlin.triangleLabelView.TriangleLabelViewKotlinActivity1
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_kotlin)
        Toast.makeText(this, "versionName ${BuildConfig.BASE_SERVER}", Toast.LENGTH_LONG).show()

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

        btn_toast_3_kotlin.setOnClickListener {
            startActivity(Intent(this , ToastKotlinActivity3::class.java))
        }

        btn_toast_4_kotlin.setOnClickListener {
            startActivity(Intent(this , ToastKotlinActivity4::class.java))
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

        btn_progressbar_5_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity5::class.java))
        }

        btn_progressbar_6_kotlin.setOnClickListener {
            startActivity(Intent(this , ProgressBarKotlinActivity6::class.java))
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

        btn_dialog_4_kotlin.setOnClickListener {
            startActivity(Intent(this , DialogKotlinActivity4::class.java))
        }

        btn_lottie_1_kotlin.setOnClickListener {
            startActivity(Intent(this , LottieKotlinActivity::class.java))
        }

        btn_number_picker_1_kotlin.setOnClickListener {
            startActivity(Intent(this , NumberPickerKotlinActivity::class.java))
        }

        btn_date_picker_1_kotlin.setOnClickListener {
            startActivity(Intent(this , DatePickerKotlinActivity1::class.java))
        }

        btn_date_picker_2_kotlin.setOnClickListener {
            startActivity(Intent(this , DatePickerKotlinActivity2::class.java))
        }

        btn_date_picker_3_kotlin.setOnClickListener {
            startActivity(Intent(this , DatePickerKotlinActivity3::class.java))
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

        btn_text_3_kotlin.setOnClickListener {
            startActivity(Intent(this , TextKotlinActivity3::class.java))
        }

        btn_text_4_kotlin.setOnClickListener {
            startActivity(Intent(this , TextKotlinActivity4::class.java))
        }

        btn_text_5_kotlin.setOnClickListener {
            startActivity(Intent(this , TextKotlinActivity5::class.java))
        }

        btn_justify_kotlin.setOnClickListener {
            startActivity(Intent(this , JustifyKotlinActivity::class.java))
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

        btn_image_4_kotlin.setOnClickListener {
            startActivity(Intent(this , ImageKotlinActivity4::class.java))
        }

        btn_image_5_kotlin.setOnClickListener {
            startActivity(Intent(this , ImageKotlinActivity5::class.java))
        }

        btn_switch_button_1_kotlin.setOnClickListener {
            startActivity(Intent(this , SwitchButtonKotlinActivity1::class.java))
        }

        btn_switch_button_2_kotlin.setOnClickListener {
            startActivity(Intent(this , SwitchButtonKotlinActivity2::class.java))
        }

        btn_switch_button_3_kotlin.setOnClickListener {
            startActivity(Intent(this , SwitchButtonKotlinActivity3::class.java))
        }

        btn_check_box_1_kotlin.setOnClickListener {
            startActivity(Intent(this , CheckBoxKotlinActivity1::class.java))
        }

        btn_custom_tab_1_kotlin.setOnClickListener {
            startActivity(Intent(this , CustomTabKotlinActivity1::class.java))
        }

        btn_rating_bar_1_kotlin.setOnClickListener {
            startActivity(Intent(this , RatingBarKotlinActivity1::class.java))
        }

        btn_triangle_label_view_1_kotlin.setOnClickListener {
            startActivity(Intent(this , TriangleLabelViewKotlinActivity1::class.java))
        }

        btn_popup_window_1_kotlin.setOnClickListener {
            startActivity(Intent(this , PopupWindowKotlinActivity1::class.java))
        }

        btn_popup_window_2_kotlin.setOnClickListener {
            startActivity(Intent(this , PopupWindowKotlinActivity2::class.java))
        }

        btn_popup_window_3_kotlin.setOnClickListener {
            startActivity(Intent(this , PopupWindowKotlinActivity3::class.java))
        }

        btn_popup_window_4_kotlin.setOnClickListener {
            startActivity(Intent(this , PopupWindowKotlinActivity4::class.java))
        }

        btn_boom_menu_kotlin.setOnClickListener {
            startActivity(Intent(this , BoomMenuActivity::class.java))
        }

        btn_recycler_view_1_kotlin.setOnClickListener {
            startActivity(Intent(this , RecyclerViewKotlinActivity1::class.java))
        }

        btn_auto_complete_1_kotlin.setOnClickListener {
            startActivity(Intent(this , AutoCompleteKotlinActivity1::class.java))
        }

        btn_chart_1_kotlin.setOnClickListener {
            startActivity(Intent(this , Chart1KotlinActivity::class.java))
        }

        btn_chart_2_kotlin.setOnClickListener {
            startActivity(Intent(this , Chart2KotlinActivity::class.java))
        }

        btn_chart_3_kotlin.setOnClickListener {
            startActivity(Intent(this , Chart3KotlinActivity::class.java))
        }

        btn_chip_1_kotlin.setOnClickListener {
            startActivity(Intent(this , ChipKotlinActivity1::class.java))
        }

    }

}