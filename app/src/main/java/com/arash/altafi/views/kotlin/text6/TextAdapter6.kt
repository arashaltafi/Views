package com.arash.altafi.views.kotlin.text6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arash.altafi.views.R
import com.google.android.material.textview.MaterialTextView

class TextAdapter6 : ListAdapter<Items, TextAdapter6.ViewHolder>(Companion) {

    companion object : DiffUtil.ItemCallback<Items>() {
        override fun areItemsTheSame(oldItem: Items, newItem: Items): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Items, newItem: Items): Boolean {
            return oldItem == newItem
        }
    }

    private var searchText: String = ""
    fun setSearchText(text: String) {
        searchText = text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_highlight, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let {
            holder.tvName.apply {
                text = it.name
                highlightAll(
                    searchText,
                    context.getAttr(R.attr.colorControlHighlight)
                )
            }
            holder.tvFamily.text = it.family
            holder.tvDate.text = it.date
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: MaterialTextView = itemView.findViewById(R.id.tvName)
        var tvFamily: MaterialTextView = itemView.findViewById(R.id.tvFamily)
        var tvDate: MaterialTextView = itemView.findViewById(R.id.tvDate)
    }

}