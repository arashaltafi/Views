package com.arash.altafi.views.kotlin.dialog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER
import android.view.Gravity.END
import com.arash.altafi.views.R
import com.geniusforapp.fancydialog.builders.FancyDialogBuilder
import kotlinx.android.synthetic.main.activity_dialog_kotlin2.*

class DialogKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_kotlin2)

        init()
    }

    private fun init() {
        btn_dialog2_clicked_kotlin.setOnClickListener {
            val dialog = FancyDialogBuilder(this, R.style.CustomDialog)
                .withImageIcon(R.drawable.ic_new_message)
                .withTitleTypeFace(R.font.vazir)
                .withSubTitleTypeFace(R.font.vazir)
                .withActionPositiveTypeFace(R.font.vazir)
                .withActionNegativeTypeFace(R.font.vazir)
                .withTextGravity(CENTER)
                .withPanelGravity(END)
                .withTitle(R.string.dialog_text_title)
                .withSubTitle(R.string.dialog_text_message)
                .withPositive(R.string.dialog_action_yes) { _, dialog -> dialog.dismiss() }
            dialog.show()
        }
    }

}