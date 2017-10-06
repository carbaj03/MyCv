package com.acv.mycv.ui.others.interest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder
import com.acv.mycv.ui.common.load
import com.acv.mycv.ui.others.interest.Interest

class InterestViewHolder(view: View) : ViewHolder<Interest>(view) {
    var ivIcon: ImageView = view.findViewById(R.id.ivIcon)
    var tvName: TextView = view.findViewById(R.id.tvName)

    override fun bind(model: Interest) =
            with(model) {
                ivIcon.load(icon)
                tvName.text = name
            }
}