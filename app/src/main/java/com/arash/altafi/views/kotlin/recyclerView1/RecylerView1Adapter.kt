package com.arash.altafi.views.kotlin.recyclerView1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arash.altafi.views.R
import com.google.android.material.textview.MaterialTextView

class RecylerView1Adapter : ListAdapter<Users, RecylerView1Adapter.AnimationViewHolder>(Companion) {

    companion object : DiffUtil.ItemCallback<Users>() {
        override fun areItemsTheSame(oldItem: Users, newItem: Users): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Users, newItem: Users): Boolean {
            return oldItem == newItem
        }
    }

    inner class AnimationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtUser: MaterialTextView = itemView.findViewById(R.id.txt_user_animation_1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimationViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view_animation_1, parent,false)
        return AnimationViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimationViewHolder, position: Int) {
        holder.txtUser.text = currentList[position].name
    }

}