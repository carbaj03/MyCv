package com.acv.mycv.ui.skills

import android.view.View
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder

class SkillViewHolder(view: View) : ViewHolder<Skill>(view) {
    var tvName = view.findViewById<TextView>(R.id.tvName)

    override fun bind(skill: Skill) = with(skill) {
        tvName.text = name
    }
}
