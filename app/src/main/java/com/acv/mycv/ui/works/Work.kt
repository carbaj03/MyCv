package com.acv.mycv.ui.works

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable


data class Work (
        val name: String,
        val description : String,
        val date: String,
        val moreInfo: String,
        val logo: Int
) : ItemVisitable {
    override fun type() = R.layout.item_work
}