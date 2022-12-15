package com.sumit.singleadapterrv.listComponent

import android.view.View
import com.sumit.singleadapterrv.R
import com.sumit.singleadapterrv.listItem.*

enum class ListMapper(val resourceId: Int, val viewHolderCreator: (View) -> ContentViewHolder) {
    SEPARATOR_VIEW(R.layout.item_view_separator, { SeparatorViewHolder(it) }),
    VIEW_ONE_VIEW(R.layout.item_view_one, { ViewOneViewHolder(it) }),
    VIEW_TWO_VIEW(R.layout.item_view_two, { ViewTwoViewHolder(it) }),
    PAYMENT_VIEW_VIEW(R.layout.item_payment_view, { PaymentViewViewHolder(it) }),
    ;
    companion object {
        val map: Map<Int, ListMapper> = values().associateBy { it.resourceId }
    }
}