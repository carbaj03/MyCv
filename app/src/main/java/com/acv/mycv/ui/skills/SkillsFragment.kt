package com.acv.mycv.ui.skills

import android.support.v7.app.AppCompatActivity
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.activity_main.*
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
            layoutManager = linearLayoutManager()
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = SkillAdapter(getItems(), ::SkillViewHolder, getItemLayout()) { listener(it) }
        }
    }

    fun listener(it: Skill) = container.snackBar(it.name)
    fun getItemLayout() = { R.layout.item_skill }
    fun getItems() = listOf(
            Skill("Librerias"),
            Skill("Solid"),
            Skill("Clean Architecture"),
            Skill("Git / GitFlow"),
            Skill("Test")
    )
}
