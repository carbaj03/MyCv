package com.acv.mycv.ui.works

import android.support.v7.app.AppCompatActivity
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.Skill
import com.acv.mycv.ui.skills.SkillViewHolder
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_works.*


class WorksFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_works

    override fun onCreate() {
        with(activity as AppCompatActivity) {
            setSupportActionBar(toolbar)
            supportActionBar!!.apply {
                setDisplayShowTitleEnabled(true)
                setDisplayHomeAsUpEnabled(true)
                title = "Mis Skills"
            }
        }

        with(rvWorks) {
            layoutManager = linearLayoutManager()
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = SkillAdapter(getItems(), ::SkillViewHolder, getItemLayout()) { listener(it) }
        }
    }

    fun listener(it: Skill) = coordinator.snackBar(it.name)
    fun getItemLayout() = { R.layout.item_skill }
    fun getItems() = listOf(
            Skill("Librerias"),
            Skill("Solid"),
            Skill("Clean Architecture"),
            Skill("Git / GitFlow"),
            Skill("Test")
    )
}
