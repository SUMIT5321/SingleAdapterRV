package com.sumit.singleadapterrv.listComponent

interface ContentModel {
    val type: Int
    fun uniqueItem(): Any = this
    fun areItemsTheSame(newItem: ContentModel): Boolean = uniqueItem() == newItem.uniqueItem()
    fun areContentsTheSame(newItem: ContentModel): Boolean = this == newItem
}