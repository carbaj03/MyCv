package com.acv.mycv.ui.skills.detail

import android.support.design.widget.AppBarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.toDp
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillDetailFragment : BaseFragment() {
    private val skillAdapter
            by lazy { Adapter(holder = { SkillDetailViewHolder(it) }) { coordinator.snackBar(it.name) } }
    private val model
            by lazy { viewModelProviders<SkillDetailViewModel>() }

    override fun getLayout() =
            R.layout.fragment_skills

    override fun onCreate() {
        configToolbar(getExtra(TITLE))
        rvSkills.overlayTop(toDp(128))
        observe { model.getSkillDetail(getExtra(SKILL)) } `do` { skillAdapter.add(it) }
        observe { model.getSkill(getExtra(SKILL)) } `do` { ivBackdrop.setImageResource(it.icon) }

        setupRecycler()
    }

    private fun setupRecycler() =
            with(rvSkills) {
                layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
                addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
                adapter = skillAdapter
            }
}

fun View.overlayTop(value: Int) {
    val params = layoutParams as CoordinatorLayout.LayoutParams
    val behavior = params.behavior as AppBarLayout.ScrollingViewBehavior
    behavior.overlayTop = value
}