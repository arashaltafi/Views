package com.arash.altafi.views.kotlin.shimmer3.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.shimmer3.model.Profile

class ShimmerAdapter3(private val delegate: ProfileViewHolder.Delegate) : RecyclerView.Adapter<ShimmerAdapter3.ProfileViewHolder>() {

    private val profileList: MutableList<Profile> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_shimmer_3 , parent , false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profileItem = profileList[position]
        holder.apply {
            profileItem.image?.let { profile.setImageDrawable(it) }
            name.text = profileItem.name
            content.text = profileItem.content
            holder.itemView.setOnClickListener {
                delegate.onItemClickListener(profileItem)
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addProfiles(profiles: List<Profile>) {
        this.profileList.addAll(profiles)
        notifyDataSetChanged()
    }

    override fun getItemCount() = this.profileList.size

    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name : TextView = itemView.findViewById(R.id.name)
        var content : TextView = itemView.findViewById(R.id.content)
        var profile : ImageView = itemView.findViewById(R.id.profile)
        fun interface Delegate {
            fun onItemClickListener(profile: Profile)
        }
    }
}
