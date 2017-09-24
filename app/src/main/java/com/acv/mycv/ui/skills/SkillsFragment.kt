package com.acv.mycv.ui.skills

import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.detail.SkillDetailViewModel
import com.acv.mycv.ui.skills.detail.SkillDetailFragment
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillsFragment : BaseFragment() {
    private val model
            by lazy { viewModelProviders<SkillDetailViewModel>() }

    override fun getLayout() = R.layout.fragment_skills

    override fun onCreate() {
        configToolbar("Mis skills")
        setupRecyclerView()
    }

    private fun setupRecyclerView() =
        with(rvSkills) {
            layoutManager = linearLayoutManager()
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = SkillAdapter(getItems(), ::SkillViewHolder) { listener(it) }
        }

    fun listener(it: Skill) =
            replace<SkillDetailFragment>(SKILL to it.id, TITLE to it.name)

    fun getItems() = mutableListOf(
            Skill("1", R.drawable.kotlin, "Kotlin"),
            Skill("2", R.drawable.mo2o, "Librerias"),
            Skill("3", R.drawable.solid, "Solid"),
            Skill("4", R.drawable.clean, "Clean Architecture"),
            Skill("5", R.drawable.git, "Git / GitFlow"),
            Skill("6", R.drawable.test, "Test")
    )
}
