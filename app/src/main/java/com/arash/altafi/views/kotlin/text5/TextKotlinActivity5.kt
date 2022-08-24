package com.arash.altafi.views.kotlin.text5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.util.Linkify
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.*
import kotlinx.android.synthetic.main.activity_text_kotlin5.*

class TextKotlinActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin5)

        init()
    }

    private fun init() {

        tvTest5.text = "arashaltafi377@gmail.com"
        movementMethod()

        btnPhone.setOnClickListener {
            tvTest5.text = "09187677641"
            movementMethod()
        }

        btnUsername.setOnClickListener {
            tvTest5.text = "arashaltafi"
            movementMethod()
        }

        btnEmail.setOnClickListener {
            tvTest5.text = "arashaltafi377@gmail.com"
            movementMethod()
        }

        btnWeb.setOnClickListener {
            tvTest5.text = "https://arashaltafi.ir/"
            movementMethod()
        }

    }

    private fun movementMethod() {
        tvTest5.movementMethod =
            InterceptedLinkMovementMethod(object : TextViewLinkClickListener {
                override fun onLinkClicked(linkText: String, linkTypes: LinkTypes) {
                    linkClicked(LinkData(linkText, linkTypes))
                }

                override fun onLinkLongClicked(linkText: String, linkTypes: LinkTypes) {
                    linkClicked(LinkData(linkText, linkTypes))
                }

            })

        LinkTypes.values().forEach { types ->
            types.pair?.let {
                Linkify.addLinks(
                    tvTest5,
                    it.first,
                    null,
                    it.second,
                    null
                )
            }
        }
    }

    private fun linkClicked(linkData: LinkData) {
        when (linkData.type) {
            LinkTypes.PHONE -> {
                openCall(linkData.text)
            }
            LinkTypes.WEB_URL -> {
                openURL(linkData.text)
            }
            LinkTypes.EMAIL_ADDRESS -> {
                openEmail(arrayOf(linkData.text))
            }
            LinkTypes.USER_NAME -> {
                popError("username: ${linkData.text}")
            }
            LinkTypes.NONE -> {
                //nothing!
            }
        }
    }

}