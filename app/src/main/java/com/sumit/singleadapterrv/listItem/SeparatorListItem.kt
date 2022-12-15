package com.sumit.singleadapterrv.listItem

import android.view.View
import com.sumit.singleadapterrv.listComponent.ContentModel
import com.sumit.singleadapterrv.listComponent.ContentViewHolder
import com.sumit.singleadapterrv.listComponent.ListMapper


object SeparatorContentModel: ContentModel {
    override val type: Int = ListMapper.SEPARATOR_VIEW.resourceId
}

class SeparatorViewHolder(view: View): ContentViewHolder(view) {
    override fun bind(contentModel: ContentModel) {}
}