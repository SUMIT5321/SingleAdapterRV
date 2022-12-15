package com.sumit.singleadapterrv.listItem

import android.view.View
import com.sumit.singleadapterrv.databinding.ItemViewTwoBinding
import com.sumit.singleadapterrv.listComponent.ContentModel
import com.sumit.singleadapterrv.listComponent.ContentViewHolder
import com.sumit.singleadapterrv.listComponent.ListMapper


data class ViewTwoContentModel(val title: String): ContentModel {
    override val type: Int = ListMapper.VIEW_TWO_VIEW.resourceId
}

class ViewTwoViewHolder(view: View): ContentViewHolder(view) {
    private val binding = ItemViewTwoBinding.bind(view)

    override fun bind(contentModel: ContentModel) {
        if (contentModel is ViewTwoContentModel) {
            binding.textView.text = contentModel.title
        }
    }
}