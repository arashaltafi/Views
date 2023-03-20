package com.arash.altafi.views.kotlin.tapTarget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.toast
import com.getkeepsafe.taptargetview.TapTargetView
import kotlinx.android.synthetic.main.activity_tap_target.*

class TapTargetActivity : AppCompatActivity() {

    private var tapTargetView1: TapTargetView? = null
    private var tapTargetView2: TapTargetView? = null
    private var tapTargetView3: TapTargetView? = null
    private var tapTargetView4: TapTargetView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tap_target)

        init()
    }

    private fun init() {
        tapTargetView1 = TapTargetUtil.singleShow(
            this,
            btnTapTarget1,
            getString(R.string.tap_target_music_rewind),
        ) {
            tapTargetView2 = TapTargetUtil.singleShow(
                this,
                btnTapTarget2,
                getString(R.string.tap_target_music_forward),
            ) {
                tapTargetView3 = TapTargetUtil.singleShow(
                    this,
                    btnTapTarget3,
                    getString(R.string.tap_target_swipe_brightness),
                ) {
                    tapTargetView4 = TapTargetUtil.singleShow(
                        this,
                        btnTapTarget4,
                        getString(R.string.tap_target_swipe_volume),
                    ) {
                        toast("FINISH")
                    }
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        tapTargetView1?.dismiss(true)
        tapTargetView2?.dismiss(true)
        tapTargetView3?.dismiss(true)
        tapTargetView4?.dismiss(true)
    }
}