package com.acv.mycv.ui.others.referent

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder
import com.acv.mycv.ui.common.load
import com.acv.mycv.ui.others.interest.Interest

class ReferentViewHolder(view: View) : ViewHolder<Referent>(view) {
    var ivIcon: ImageView = view.findViewById(R.id.ivIcon)
    var tvName: TextView = view.findViewById(R.id.tvName)
    var tvCompany: TextView = view.findViewById(R.id.tvCompany)

    override fun bind(model: Referent) =
            with(model) {
                ivIcon.load(icon)
                tvName.text = name
                tvCompany.text = job
            }
}