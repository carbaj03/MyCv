package com.acv.mycv.ui.skills

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder
import com.acv.mycv.ui.common.loadCircle

class SkillViewHolder(view: View) : ViewHolder<Skill>(view) {
    var ivIcon: ImageView = view.findViewById(R.id.ivIcon)
    var tvName: TextView = view.findViewById(R.id.tvName)

    override fun bind(skill: Skill) = with(skill) {
        ivIcon.loadCircle(skill.icon)
        tvName.text = name
    }
}
