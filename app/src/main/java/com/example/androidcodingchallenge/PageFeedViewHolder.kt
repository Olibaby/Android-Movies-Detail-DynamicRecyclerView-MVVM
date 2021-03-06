package com.example.androidcodingchallenge

import android.view.View
import androidx.recyclerview.widget.RecyclerView


abstract class PageFeedViewHolder<in T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}
