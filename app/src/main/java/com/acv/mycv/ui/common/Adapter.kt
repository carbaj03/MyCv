package com.acv.mycv.ui.common

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.acv.mycv.ui.skills.Skill
import com.acv.mycv.ui.skills.SkillViewHolder

typealias SkillAdapter = Adapter<SkillViewHolder, Skill>

abstract class ViewHolder<in M>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(model: M)
}

open class Adapter<VH : ViewHolder<M>, M>(
        val items: List<M>,
        val holder: (view: View) -> VH,
        val layout: () -> Int,
        val listener: (M) -> Unit
) : RecyclerView.Adapter<VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = holder(parent.inflate(layout()))

    override fun onBindViewHolder(holder: VH, position: Int) = with(holder) {
        bind(items[position])
        itemView.setOnClickListener { listener(items[position]) }
    }

    override fun getItemCount() = items.size
}