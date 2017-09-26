package com.acv.mycv.ui.skills

import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.detail.SkillDetailActivity
import com.acv.mycv.ui.skills.detail.SkillDetailViewModel
import com.acv.mycv.ui.skills.detail.SkillDetailFragment
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillsFragment : BaseFragment() {
    private val skillAdapter
            by lazy { SkillAdapter(holder = ::SkillViewHolder) { goToDetail(it) } }
    private val model
            by lazy { viewModelProviders<SkillViewModel>() }

    override fun getLayout() =
            R.layout.fragment_skills

    override fun onCreate() {
        configToolbar(getString(R.string.title_skill))
        observe { model.getSkillDetail() } `do` { skillAdapter.add(it) }
        setupRecyclerView()
    }

    private fun setupRecyclerView() =
        with(rvSkills) {
            layoutManager = linearLayoutManager()
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = skillAdapter
        }

    private fun goToDetail(skill: Skill) =
            load<SkillDetailActivity>(SKILL to skill.id, TITLE to skill.name)
//            replace<SkillDetailFragment>(SKILL to skill.id, TITLE to skill.name)
}