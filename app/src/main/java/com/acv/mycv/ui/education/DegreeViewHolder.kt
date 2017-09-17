package com.acv.mycv.ui.education

import android.view.View
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder
import com.acv.mycv.ui.common.toggleVisivility


class DegreeViewHolder(view: View) : ViewHolder<Degree>(view) {
    val tvName: TextView = view.findViewById(R.id.tvName)
    val tvDegree: TextView = view.findViewById(R.id.tvDegree)
    val tvDescription: TextView = view.findViewById(R.id.tvDescription)
    val tvDate: TextView = view.findViewById(R.id.tvDate)
    val btnMore: TextView = view.findViewById(R.id.btnMoreInfo)
    val tvMoreInfo: TextView = view.findViewById(R.id.tvMoreInfo)

    override fun bind(degree: Degree) = with(degree) {
        tvName.text = name
        tvDegree.text = degree.degree
        tvDescription.text = description
        tvDate.text = date
        tvMoreInfo.text = moreInfo
        btnMore.setOnClickListener { tvMoreInfo.toggleVisivility() }
    }
}
