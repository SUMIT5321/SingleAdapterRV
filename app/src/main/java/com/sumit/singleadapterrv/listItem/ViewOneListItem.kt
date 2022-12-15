package com.sumit.singleadapterrv.listItem

import android.view.View
import com.sumit.singleadapterrv.databinding.ItemViewOneBinding
import com.sumit.singleadapterrv.listComponent.ContentModel
import com.sumit.singleadapterrv.listComponent.ContentViewHolder
import com.sumit.singleadapterrv.listComponent.ListMapper


data class ViewOneContentModel(val title: String): ContentModel {
    override val type: Int = ListMapper.VIEW_ONE_VIEW.resourceId
}

class ViewOneViewHolder(view: View): ContentViewHolder(view) {
    private val binding = ItemViewOneBinding.bind(view)

    override fun bind(contentModel: ContentModel) {
        if (contentModel is ViewOneContentModel) {
            binding.textView.text = contentModel.title
        }
    }
}