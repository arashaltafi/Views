package com.arash.altafi.views.kotlin.snackbar1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.views.R
import com.nispok.snackbar.Snackbar
import com.nispok.snackbar.SnackbarManager
import com.nispok.snackbar.listeners.EventListener
import kotlinx.android.synthetic.main.activity_snack_bar_kotlin1.*

class SnackBarKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar_kotlin1)

        init()
    }

    private fun init() {

        btn_1_snackBar1_kotlin.setOnClickListener {
            Snackbar.with(this).text("Single-line snackBar").show(this)
        }

        btn_2_snackBar1_kotlin.setOnClickListener {
            SnackbarManager.show(Snackbar.with(this).text("Single-line snackBar"))
        }

        btn_3_snackBar1_kotlin.setOnClickListener {
            SnackbarManager.show(Snackbar.with(this).text("Single-line snackBar"), this)
        }

        btn_4_snackBar1_kotlin.setOnClickListener {
            SnackbarManager.show(
                Snackbar.with(this)
                    .text("Item deleted")
                    .actionLabel("Undo")
                    .actionListener {
                        Toast.makeText(this@SnackBarKotlinActivity1, "test", Toast.LENGTH_SHORT).show()
                    },
                this
            )

        }

        btn_5_snackBar1_kotlin.setOnClickListener {
            SnackbarManager.show(
                Snackbar.with(applicationContext)
                    .text("This will do something when dismissed")
                    .eventListener(object : EventListener {
                        override fun onShow(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 1", Toast.LENGTH_SHORT).show()
                        }

                        override fun onShowByReplace(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 2", Toast.LENGTH_SHORT).show()
                        }

                        override fun onShown(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 3", Toast.LENGTH_SHORT).show()
                        }

                        override fun onDismiss(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 4", Toast.LENGTH_SHORT).show()
                        }

                        override fun onDismissByReplace(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 5", Toast.LENGTH_SHORT).show()
                        }

                        override fun onDismissed(snackbar: Snackbar) {
                            Toast.makeText(this@SnackBarKotlinActivity1, "test 6", Toast.LENGTH_SHORT).show()
                        }
                    })
                , this
            )
        }

        btn_6_snackBar1_kotlin.setOnClickListener {
            SnackbarManager.show(
                Snackbar.with(this)
                    .text("Different colors this time")
                    .textColor(Color.GREEN)
//                    .textTypeface(myTypeface)
                    .color(Color.BLUE)
                    .actionLabel("Action")
                    .actionColor(Color.RED)
//                    .actionLabelTypeface(myTypeface)
                    .actionListener {
                        Toast.makeText(this , "test" , Toast.LENGTH_SHORT).show()
                    }
                , this)
        }

    }

}