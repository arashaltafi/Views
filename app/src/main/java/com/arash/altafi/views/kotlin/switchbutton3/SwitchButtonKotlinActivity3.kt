package com.arash.altafi.views.kotlin.switchbutton3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import com.rm.rmswitch.RMSwitch.RMSwitchObserver
import com.rm.rmswitch.RMTristateSwitch
import com.rm.rmswitch.RMTristateSwitch.RMTristateSwitchObserver
import kotlinx.android.synthetic.main.activity_switch_button_kotlin3.*

class SwitchButtonKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button_kotlin3)

        init()
    }

    private fun init() {

        rm_switch1.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state1.text = "Checked: $isChecked"
        })
        rm_switch1.isChecked = true
        rm_switch1.isEnabled = false
        rm_switch1.isForceAspectRatio = false
        rm_switch1.switchBkgCheckedColor = ContextCompat.getColor(this, R.color.green)
        rm_switch1.switchBkgNotCheckedColor = ContextCompat.getColor(this, R.color.red)
        rm_switch1.switchToggleCheckedColor = ContextCompat.getColor(this, R.color.white)
        rm_switch1.switchToggleNotCheckedColor = ContextCompat.getColor(this, R.color.white)

        txt_rm_switch_state1.text = "Checked: " + rm_switch1.isChecked


        rm_switch2.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state2.text = "Checked: $isChecked"
        })
        txt_rm_switch_state2.text = "Checked: " + rm_switch2.isChecked


//        rm_switch3.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
//            txt_rm_switch_state3.text = "Checked: $isChecked"
//        })
//        txt_rm_switch_state3.text = "Checked: " + rm_switch3.isChecked


        rm_switch4.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state4.text = "Checked: $isChecked"
        })
        txt_rm_switch_state4.text = "Checked: " + rm_switch4.isChecked


        rm_switch5.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state5.text = "Checked: $isChecked"
        })
        txt_rm_switch_state5.text = "Checked: " + rm_switch5.isChecked


        rm_switch6.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state6.text = "Checked: $isChecked"
        })
        txt_rm_switch_state6.text = "Checked: " + rm_switch6.isChecked


//        rm_switch7.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
//            txt_rm_switch_state7.text = "Checked: $isChecked"
//        })
//        txt_rm_switch_state7.text = "Checked: " + rm_switch7.isChecked


        rm_switch8.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state8.text = "Checked: $isChecked"
        })
        txt_rm_switch_state8.text = "Checked: " + rm_switch9.isChecked

        rm_switch9.addSwitchObserver(RMSwitchObserver { switchView, isChecked ->
            txt_rm_switch_state9.text = "Checked: $isChecked"
        })
        txt_rm_switch_state9.text = "Checked: " + rm_switch9.isChecked


        var state: Int = rm_triswitch1.state
        txt_rm_switch_state1.text =
            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        rm_triswitch1.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
            txt_rm_switch_state1.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        })

        state = rm_triswitch2.state
        txt_rm_switch_state2.text =
            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        rm_triswitch2.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
            txt_rm_switch_state2.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        })

//        state = rm_triswitch3.state
//        txt_rm_switch_state3.text =
//            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
//        rm_triswitch3.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
//            txt_rm_switch_state3.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
//        })

        state = rm_triswitch4.state
        txt_rm_switch_state4.text =
            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        rm_triswitch4.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
            txt_rm_switch_state4.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        })

        rm_triswitch5.setSwitchToggleLeftDrawableRes(R.drawable.theme_night)
        rm_triswitch5.setSwitchToggleMiddleDrawableRes(R.drawable.theme_auto)
        rm_triswitch5.setSwitchToggleRightDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.theme_day
            )
        )
        state = rm_triswitch5.state
        txt_rm_switch_state5.text =
            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        rm_triswitch5.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
            txt_rm_switch_state5.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        })

        state = rm_triswitch6.state
        txt_rm_switch_state6.text =
            if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        rm_triswitch6.addSwitchObserver(RMTristateSwitchObserver { switchView, state ->
            txt_rm_switch_state6.text = if (state == RMTristateSwitch.STATE_LEFT) "Left" else if (state == RMTristateSwitch.STATE_MIDDLE) "Middle" else "Right"
        })

    }

}