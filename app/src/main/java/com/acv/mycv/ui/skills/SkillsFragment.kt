package com.acv.mycv.ui.skills

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.detail.SkillDetailFragment
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillsFragment : BaseFragment() {

    override fun getLayout() = R.layout.fragment_skills

    override fun onCreate() {
        with(activity as AppCompatActivity) {
            setSupportActionBar(toolbar)
            supportActionBar!!.apply {
                setDisplayShowTitleEnabled(true)
                setDisplayHomeAsUpEnabled(true)
                title = "Mis Skills"
            }
        }

        with(rvSkills) {
//            layoutManager = linearLayoutManager()
            layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = SkillAdapter(getItems(), ::SkillViewHolder) { listener(it) }
        }
    }

    fun listener(it: Skill) =
            loada<SkillDetailFragment>()

    fun getItems() = listOf(
            Skill(R.drawable.kotlin, "Kotlin"),
            Skill(R.drawable.mo2o,"Librerias"),
            Skill(R.drawable.solid, "Solid"),
            Skill(R.drawable.clean,"Clean Architecture"),
            Skill(R.drawable.git, "Git / GitFlow"),
            Skill(R.drawable.test, "Test")
    )
}
