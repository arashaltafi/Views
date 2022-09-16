package com.arash.altafi.views.kotlin.dialog4

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import com.arash.altafi.views.R
import com.arash.altafi.views.databinding.DialogUpdateBinding
import com.arash.altafi.views.kotlin.ext.*

class UpdateDialog(
    private val mContext: Context,
    private val title: String,
    private val link: String,
    private val type: UpdateType
) : BaseDialog<DialogUpdateBinding>(mContext, R.style.Theme_Views) {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> DialogUpdateBinding
        get() = DialogUpdateBinding::inflate

    private var listener: UpdateListener? = null

    override fun viewHandler(view: View, savedInstanceState: Bundle?) {
        setCancelable(false)

        binding?.apply {
            tvUpdateDialog.text = title

            btnUpdateDialogUpdate.setOnClickListener {
                listener?.onUpdate()
                mContext.openURL(link)
            }

            btnUpdateDialogCancel.setOnClickListener {
                listener?.onCancel()
                dismiss()
            }

            when (type) {
                UpdateType.ForceUpdate -> {
                    btnUpdateDialogCancel.apply {
                        text = mContext.getString(R.string.exit)

                        setOnClickListener {
                            mContext.cast<Activity>()?.finish()
                        }
                    }
                }
                UpdateType.Lock -> {
                    btnUpdateDialogUpdate.apply {
                        text = mContext.getString(R.string.exit)

                        setOnClickListener {
                            mContext.cast<Activity>()?.finish()
                        }
                    }

                    btnUpdateDialogCancel.toGone()
                }
                UpdateType.Update -> {

                }
            }

        }
    }

    fun setListener(listener: UpdateListener): UpdateDialog {
        this.listener = listener

        return this
    }

    interface UpdateListener {
        fun onCancel()
        fun onUpdate()
    }

    @Keep
    enum class UpdateType {
        Update,
        ForceUpdate,
        Lock
    }

}