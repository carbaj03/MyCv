package com.acv.mycv.ui.skills.detail

import android.support.v7.widget.StaggeredGridLayoutManager
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillDetailFragment : BaseFragment() {
    private val myAdapter
            by lazy { Adapter(holder = { SkillDetailViewHolder(it) }) { coordinator.snackBar(it.name) } }
    private val model
            by lazy { viewModelProviders<SkillDetailViewModel>() }

    override fun getLayout() =
            R.layout.fragment_skills

    override fun onCreate() {
        configToolbar(getExtra(TITLE))
        observe { model.getSkillDetail(getExtra(SKILL)) } `do` { myAdapter.add(it) }
        setupRecycler()
    }

    private fun setupRecycler() =
            with(rvSkills) {
                layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
                addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
                adapter = myAdapter
            }
}
