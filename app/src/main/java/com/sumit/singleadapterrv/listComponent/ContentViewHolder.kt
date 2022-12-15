package com.sumit.singleadapterrv.listComponent

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sumit.singleadapterrv.listComponent.ContentModel

abstract class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(contentModel: ContentModel)
}