package com.sumit.singleadapterrv.listComponent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter


open class CommonAdapter: ListAdapter<ContentModel, ContentViewHolder>(DiffCallback()) {
    open val layoutResourceToViewHolderMap: Map<Int, ListMapper> = ListMapper.map

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return layoutResourceToViewHolderMap[viewType]?.viewHolderCreator?.invoke(view) ?: throw java.lang.Exception("Couldn't find item view")
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).type
    }

    private class DiffCallback : DiffUtil.ItemCallback<ContentModel>() {
        override fun areItemsTheSame(oldItem: ContentModel, newItem: ContentModel): Boolean {
            return oldItem.areItemsTheSame(newItem)
        }

        override fun areContentsTheSame(oldItem: ContentModel, newItem: ContentModel): Boolean {
            return oldItem.areContentsTheSame(newItem)
        }
    }
}