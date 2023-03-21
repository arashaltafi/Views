package com.arash.altafi.views.kotlin.text6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.hideKeyboard
import com.arash.altafi.views.kotlin.ext.showKeyboard
import kotlinx.android.synthetic.main.activity_text_kotlin6.*

class TextKotlinActivity6 : AppCompatActivity() {

    private val textAdapter6: TextAdapter6 = TextAdapter6()
    private var itemList: ArrayList<Items> = arrayListOf()
    private var afterTextChanged: ((String) -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin6)

        init()
    }

    private fun init() {
        itemList.add(Items(1, "Arash", "Altafi", "1998-08-08"))
        itemList.add(Items(2, "Hossein", "Jabari", "1986-05-16"))
        itemList.add(Items(3, "Yaser", "Amini", "2005-02-20"))
        itemList.add(Items(4, "Ali", "Farahani", "2001-03-14"))
        itemList.add(Items(5, "Mehrad", "Torabi", "2005-11-24"))
        itemList.add(Items(6, "Amir", "Noori", "1995-06-26"))
        itemList.add(Items(7, "Jafar", "Mohebi", "1999-09-08"))
        itemList.add(Items(8, "Kamal", "Saeedi", "1978-11-06"))
        itemList.add(Items(9, "Mohammad", "Heydari", "1967-01-21"))
        itemList.add(Items(10, "Ashkan", "Naeemi", "1983-05-19"))

        rvHighlight.apply {
            textAdapter6.submitList(itemList)
            adapter = textAdapter6
        }

        edtSearch.apply {
            requestFocus()
            showKeyboard()
            val watcher = object : TextWatcher {
                var beforeText = ""
                override fun afterTextChanged(editable: Editable?) {
                    if (beforeText == editable.toString())
                        return

                    afterTextChanged?.invoke(editable.toString())
                }

                override fun beforeTextChanged(
                    s: CharSequence,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    beforeText = s.toString()
                }

                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            }
            addTextChangedListener(watcher)
        }

        afterTextChanged = {
            textAdapter6.submitList(emptyList())
            textAdapter6.submitList(null)
            textAdapter6.setSearchText(it)
            textAdapter6.submitList(itemList)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        edtSearch.hideKeyboard()
    }

}