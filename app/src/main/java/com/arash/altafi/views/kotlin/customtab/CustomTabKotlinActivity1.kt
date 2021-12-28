package com.arash.altafi.views.kotlin.customtab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.browser.customtabs.CustomTabsIntent
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_custom_tab_kotlin1.*

class CustomTabKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tab_kotlin1)

        init()
    }

    private fun init() {

        btn_custom_tab_1.setOnClickListener {
            val url = "https://arashaltafi.ir/"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent : CustomTabsIntent = builder.build()
            customTabsIntent.launchUrl(this , Uri.parse(url))
        }

        btn_custom_tab_2.setOnClickListener {

            val url = "https://arashaltafi.ir/"
            val intent1 = Intent(Intent.ACTION_VIEW , Uri.parse(url))
            startActivity(intent1)

//            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://arashaltafi.ir/"))
//            startActivity(intent2)

//            val intent3 = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://arashaltafi.ir/"))
//            startActivity(intent3)

        }

    }

}