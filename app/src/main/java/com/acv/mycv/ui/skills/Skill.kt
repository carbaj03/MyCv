package com.acv.mycv.ui.skills

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable


data class Skill (
        val icon: Int = R.drawable.ic_github,
        val name: String
) : ItemVisitable {
    override fun type() = R.layout.item_skill
}