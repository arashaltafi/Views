package com.arash.altafi.views.kotlin.shimmer2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arash.altafi.views.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_shimmer_2.view.*

class ShimmerAdapter2(private val users: ArrayList<User>) : RecyclerView.Adapter<ShimmerAdapter2.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_shimmer_2, parent, false))

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount(): Int = users.size

    fun addData(list: List<User>) {
        users.addAll(list)
    }

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.textViewUserName.text = user.name
            itemView.textViewUserEmail.text = user.email
            Glide.with(itemView.imageViewAvatar.context).load(user.avatar).into(itemView.imageViewAvatar)
        }
    }

}