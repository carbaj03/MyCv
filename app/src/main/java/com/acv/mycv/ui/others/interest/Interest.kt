package com.acv.mycv.ui.others.interest

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable

data class Interest(
        val id: String,
        val icon: Int = R.drawable.ic_github,
        val name: String,
        val job: String
) : ItemVisitable {
    override fun type() = R.layout.item_referent
}