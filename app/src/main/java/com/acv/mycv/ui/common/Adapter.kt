package com.acv.mycv.ui.common

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.acv.mycv.ui.education.Degree
import com.acv.mycv.ui.education.DegreeViewHolder
import com.acv.mycv.ui.skills.Skill
import com.acv.mycv.ui.skills.SkillViewHolder
import com.acv.mycv.ui.works.Work
import com.acv.mycv.ui.works.WorkViewHolder

typealias SkillAdapter = Adapter<SkillViewHolder, Skill>
typealias WorkAdapter = Adapter<WorkViewHolder, Work>
typealias EducationAdapter = Adapter<DegreeViewHolder, Degree>

abstract class ViewHolder<in M>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(model: M)
}

interface ItemVisitable {
    fun type(): Int
}

open class Adapter<VH : ViewHolder<M>, M : ItemVisitable>(
        val items: List<M>,
        val holder: (view: View) -> VH,
        val listener: (M) -> Unit
) : RecyclerView.Adapter<VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            holder(parent.inflate(viewType))

    override fun onBindViewHolder(holder: VH, position: Int) = with(holder) {
        bind(items[position])
        itemView.setOnClickListener { listener(items[position]) }
    }

    override fun getItemViewType(position: Int) =
            items[position].type()

    override fun getItemCount() =
            items.size
}