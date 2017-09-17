package com.acv.mycv.ui.skills.detail

import android.view.View
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder

class NormalViewHolder(view: View, val skill: NormalItem) : ViewHolder(view) {
    var tvName: TextView = view.findViewById(R.id.tvName)

    override fun bind() = with(skill) {
        tvName.text = name
    }
}


class ShortViewHolder(view: View) : ViewHolder<ShortItem>(view) {
    var tvName: TextView = view.findViewById(R.id.tvName)

    override fun bind(skill: ShortItem) = with(skill) {
        tvName.text = name
    }
}


class LargeViewHolder(view: View) : ViewHolder<LargeItem>(view) {
    var tvName: TextView = view.findViewById(R.id.tvName)

    override fun bind(skill: LargeItem) = with(skill) {
        tvName.text = name
    }
}
