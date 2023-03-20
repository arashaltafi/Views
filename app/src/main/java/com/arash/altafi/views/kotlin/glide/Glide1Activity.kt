package com.arash.altafi.views.kotlin.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.glide.utils.getBitmap
import com.arash.altafi.views.kotlin.glide.utils.loadCompat
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_glide1.*

class Glide1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide1)

        init()
    }

    private fun init() {
        ivGlideServer.loadCompat("https://arashaltafi.ir/arash.jpg")

        ivGlideDrawable.loadCompat(
            R.drawable.person1,
            placeholderRes = null,
            errorRes = null,
            requestOptions = RequestOptions.centerInsideTransform()
        )

        getBitmap(url = "https://arashaltafi.ir/Social_Media/story-02.jpg", result = { bitmap ->
            ivGlideBitmap.loadCompat(bitmap)
        })
    }

}