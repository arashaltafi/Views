package com.arash.altafi.views.kotlin.dialog4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.toast
import kotlinx.android.synthetic.main.activity_dialog_kotlin4.*

class DialogKotlinActivity4 : AppCompatActivity() {

    private val locationDialog by lazy {
        LocationDialog(
            mContext = this
        )
    }

    private val updateDialog by lazy {
        UpdateDialog(
            mContext = this,
            "test title",
            "https://arashaltafi.ir/",
            UpdateDialog.UpdateType.Update // Update, ForceUpdate,Lock
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_kotlin4)

        init()
    }

    private fun init() {
        btnLocationShow.setOnClickListener {
            locationDialog.show()
            locationDialog.onClickListenerDialogCancel = {
                toast("click listener location dialog")
            }
        }

        btnLocationDismiss.setOnClickListener {
            locationDialog.dismiss()
        }

        btnUpdateShow.setOnClickListener {
            updateDialog.show()
            updateDialog.setListener(object: UpdateDialog.UpdateListener{
                override fun onCancel() {
                    toast("onCancel")
                }

                override fun onUpdate() {
                    toast("onUpdate")
                }
            })
        }

        btnUpdateDismiss.setOnClickListener {
            updateDialog.dismiss()
        }

    }

}