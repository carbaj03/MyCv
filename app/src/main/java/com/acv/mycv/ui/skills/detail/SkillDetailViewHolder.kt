package com.acv.mycv.ui.skills.detail

import android.content.res.ColorStateList
import android.support.v4.content.ContextCompat
import android.support.v7.widget.CardView
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
            val container: CardView = view.findViewById(R.id.cardContainer)
            tvName.text = model.name
            tvDescription.text = model.description
            container.cardBackgroundColor = ColorStateList(
                    arrayOf(intArrayOf(android.R.attr.state_enabled)),
                    intArrayOf(ContextCompat.getColor(tvName.context, model.color)))
        }

    }
}
