package com.sumit.singleadapterrv.listItem


import android.view.View
import com.sumit.singleadapterrv.databinding.ItemPaymentViewBinding
import com.sumit.singleadapterrv.listComponent.ContentModel
import com.sumit.singleadapterrv.listComponent.ContentViewHolder
import com.sumit.singleadapterrv.listComponent.ListMapper

data class PaymentViewContentModel(
    val title: String,
) : ContentModel {
    override val type: Int = ListMapper.PAYMENT_VIEW_VIEW.resourceId
}

class PaymentViewViewHolder(view: View) : ContentViewHolder(view) {
    private val binding = ItemPaymentViewBinding.bind(view)

    override fun bind(contentModel: ContentModel) {
        if (contentModel is PaymentViewContentModel) {
            // TODO("add binding")
        }
    }
}