package com.arash.altafi.views.kotlin.recyclerView1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_recycler_view_kotlin1.*

class RecyclerViewKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_kotlin1)

        init()
    }

    private fun init(){
        val adapter = RecylerView1Adapter()
        val users: ArrayList<Users> = arrayListOf()
        users.add(Users("تست 1"))
        users.add(Users("تست 2"))
        users.add(Users("تست 3"))
        users.add(Users("تست 4"))
        users.add(Users("تست 5"))
        users.add(Users("تست 6"))
        users.add(Users("تست 7"))
        users.add(Users("تست 8"))
        users.add(Users("تست 9"))
        users.add(Users("تست 10"))
        adapter.submitList(users)
        rv_animation_1.adapter = adapter
    }

}