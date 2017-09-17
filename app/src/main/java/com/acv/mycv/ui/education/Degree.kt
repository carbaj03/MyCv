package com.acv.mycv.ui.education

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable

data class Degree(
        val name: String,
        val degree: String,
        val description: String,
        val date: String,
        val moreInfo: String
) : ItemVisitable {
    override fun type() = R.layout.item_degree
}