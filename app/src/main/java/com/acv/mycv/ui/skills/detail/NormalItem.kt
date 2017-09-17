package com.acv.mycv.ui.skills.detail

import com.acv.mycv.R
import com.acv.mycv.ui.common.ItemVisitable


sealed class Kotlin(
        val name: String
) : ItemVisitable

data class NormalItem (
        val namea: String
) : Kotlin(namea) {
    override fun type() = R.layout.item_normal
}

data class LargeItem (
        val namea: String
) : Kotlin(namea) {
    override fun type() = R.layout.item_large
}

data class ShortItem (
        val namea: String
) : Kotlin(namea) {
    override fun type() = R.layout.item_short
}