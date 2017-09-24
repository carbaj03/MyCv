package com.acv.mycv.ui.skills.detail

import android.view.View
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder

class SkillDetailViewHolder(val view: View) : ViewHolder<SkillDetailItem>(view) {
    override fun bind(model: SkillDetailItem) = when (model) {
        is NormalItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
            val tvDescription : TextView = view.findViewById(R.id.tvDescription)
            tvName.text = model.name
            tvDescription.text = model.description
        }
        is LargeItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
//            val tvDescription : TextView = view.findViewById(R.id.tvDescription)
            tvName.text = model.name
//            tvDescription.text = model.description
        }
        is ShortItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
//            val tvDescription : TextView = view.findViewById(R.id.tvDescription)
            tvName.text = model.name
//            tvDescription.text = model.description
        }
    }
}
