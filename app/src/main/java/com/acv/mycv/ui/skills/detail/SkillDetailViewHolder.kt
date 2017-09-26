package com.acv.mycv.ui.skills.detail

import android.content.res.ColorStateList
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder

class SkillDetailViewHolder(val view: View) : ViewHolder<SkillDetailItem>(view) {
    override fun bind(model: SkillDetailItem) = when (model) {
        is NormalItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
            val tvDescription: TextView = view.findViewById(R.id.tvDescription)
            tvName.text = model.name
            tvDescription.text = model.description
        }
        is LargeItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
            val tvDescription: TextView = view.findViewById(R.id.tvDescription)
            tvName.text = model.name
            tvDescription.text = model.description
        }
        is ShortItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
            val tvDescription: TextView = view.findViewById(R.id.tvDescription)
            val ima: ImageView = view.findViewById(R.id.imageView)
            tvName.text = model.name
            tvDescription.text = model.description
        }
        is SolidItem -> {
            val tvName: TextView = view.findViewById(R.id.tvName)
            val tvDescription: TextView = view.findViewById(R.id.tvDescription)
            val container: View = view.findViewById(R.id.itemContainer)
            tvName.text = model.name
            tvDescription.text = model.description
//            container.backgroundTintList = ColorStateList(R.color.accent)
        }

    }
}
