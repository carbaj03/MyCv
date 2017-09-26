package com.acv.mycv.ui.skills.detail

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable

sealed class SkillDetailItem(
        val name: String,
        val description: String
) : ItemVisitable

class NormalItem (
        title: String,
        description: String
) : SkillDetailItem(title, description) {
    override fun type() = R.layout.item_normal
}

class LargeItem (
        title: String,
        description: String
) : SkillDetailItem(title, description) {
    override fun type() = R.layout.item_large
}

class ShortItem (
        title: String,
        description: String,
        val a : String
) : SkillDetailItem(title,description) {
    override fun type() = R.layout.item_short
}

class SolidItem(
        title: String,
        description: String,
        color: Int
) : SkillDetailItem(title,description) {
    override fun type() = R.layout.item_auto
}