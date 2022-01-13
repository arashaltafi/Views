package com.arash.altafi.views.kotlin.toast3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import com.elconfidencial.bubbleshowcase.BubbleShowCase
import com.elconfidencial.bubbleshowcase.BubbleShowCaseBuilder
import com.elconfidencial.bubbleshowcase.BubbleShowCaseListener
import kotlinx.android.synthetic.main.activity_toast_kotlin3.*

class ToastKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin3)

        init()
    }

    private fun init() {

        btn_sample_1_toast3.setOnClickListener {
            BubbleShowCaseBuilder(this)
                .title("test 1")
                .targetView(btn_sample_1_toast3)
                .show() //Display the ShowCase
        }

        btn_sample_2_toast3.setOnClickListener {
            BubbleShowCaseBuilder(this)
                .title("test 2")
                .description("this is a description") //More detailed description
                .arrowPosition(BubbleShowCase.ArrowPosition.TOP) //You can force the position of the arrow to change the location of the bubble.
                .backgroundColor(Color.GREEN) //Bubble background color
                .textColor(Color.BLACK) //Bubble Text color
                .titleTextSize(17) //Title text size in SP (default value 16sp)
                .descriptionTextSize(15) //Subtitle text size in SP (default value 14sp)
                .image(getDrawable(R.drawable.arash)!!) //Bubble main image
                .closeActionImage(getDrawable(R.drawable.ic_error_)!!) //Custom close action image
                .showOnce("BUBBLE_SHOW_CASE_ID") //Id to show only once the BubbleShowCase
                .listener(object : BubbleShowCaseListener { //Listener for user actions
                    override fun onTargetClick(bubbleShowCase: BubbleShowCase) {
                        //Called when the user clicks the target
                    }
                    override fun onCloseActionImageClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onCloseActionImageClick" , Toast.LENGTH_SHORT).show()
                    }
                    override fun onBubbleClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onBubbleClick" , Toast.LENGTH_SHORT).show()
                    }

                    override fun onBackgroundDimClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onBackgroundDimClick" , Toast.LENGTH_SHORT).show()
                    }
                })
                    .targetView(btn_sample_2_toast3)
                    .show()
        }

        btn_sample_3_toast3.setOnClickListener {
            BubbleShowCaseBuilder(this)
                .title("Force the position of the bubble!")
                .description("You only have to specify in which side you want the arrow, and the bubble will be located depending on it.")
                .arrowPosition(BubbleShowCase.ArrowPosition.TOP)
                .backgroundColor(ContextCompat.getColor(this, R.color.red))
                .targetView(btn_sample_3_toast3)
                .show()
        }

        btn_sample_4_toast3.setOnClickListener {
            BubbleShowCaseBuilder(this)
                .title("Force the position of the bubble!")
                .description("You only have to specify in which side you want the arrow, and the bubble will be located depending on it.")
                .arrowPosition(BubbleShowCase.ArrowPosition.TOP)
                .backgroundColor(ContextCompat.getColor(this, R.color.yellow))
                .textColor(R.color.black)
                .targetView(btn_sample_4_toast3)
                .listener(object  : BubbleShowCaseListener {
                    override fun onBackgroundDimClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onBackgroundDimClick", Toast.LENGTH_SHORT).show()
                    }

                    override fun onBubbleClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onBubbleClick", Toast.LENGTH_SHORT).show()
                    }

                    override fun onCloseActionImageClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onCloseActionImageClick", Toast.LENGTH_SHORT).show()
                    }

                    override fun onTargetClick(bubbleShowCase: BubbleShowCase) {
                        Toast.makeText(this@ToastKotlinActivity3, "onTargetClick", Toast.LENGTH_SHORT).show()
                    }

                })
                .show()
        }
    }

}