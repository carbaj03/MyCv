package com.acv.mycv.ui.works

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.acv.mycv.R
import com.acv.mycv.ui.common.ViewHolder
import com.acv.mycv.ui.common.loadCircle
import com.acv.mycv.ui.common.toggleVisivility

class WorkViewHolder(view: View) : ViewHolder<Work>(view) {
    val tvIcon: ImageView = view.findViewById(R.id.ivIcon)
    val tvName: TextView = view.findViewById(R.id.tvName)
    val tvDescription: TextView = view.findViewById(R.id.tvDescription)
    val tvDate: TextView = view.findViewById(R.id.tvDate)
    val btnMore: TextView = view.findViewById(R.id.btnMoreInfo)
    val tvMoreInfo: TextView = view.findViewById(R.id.tvMoreInfo)

    override fun bind(degree: Work) = with(degree) {
        tvIcon.loadCircle(logo)
        tvName.text = name
        tvDescription.text = description
        tvDate.text = date
        tvMoreInfo.text = moreInfo
        btnMore.setOnClickListener { tvMoreInfo.toggleVisivility() }
    }
}
