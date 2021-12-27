package com.arash.altafi.views.kotlin.snackbar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_snack_bar_kotlin2.*
import android.graphics.Color
import android.view.View
import com.androidadvance.topsnackbar.TSnackbar
import kotlinx.android.synthetic.main.activity_snack_bar_kotlin2.view.*
import android.widget.TextView




class SnackBarKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_kotlin2)

        init()
    }

    private fun init() {

        btn_1_snackBar2_kotlin.setOnClickListener {

            TSnackbar.make(btn_1_snackBar2_kotlin ,"Hello from TSnackBar.",TSnackbar.LENGTH_LONG).show()

        }

        btn_2_snackBar2_kotlin.setOnClickListener {

            val snackBar = TSnackbar.make(btn_2_snackBar2_kotlin, "A SnackBar is a lightweight material design method for providing feedback to a user, while optionally providing an action to the user.", TSnackbar.LENGTH_LONG)
            snackBar.setActionTextColor(Color.WHITE)
            val snackBarView: View = snackBar.view
            snackBarView.setBackgroundColor(Color.parseColor("#CC00CC"))
            snackBarView.btn_2_snackBar2_kotlin.setTextColor(Color.YELLOW)
            snackBar.show()

        }

    }

}