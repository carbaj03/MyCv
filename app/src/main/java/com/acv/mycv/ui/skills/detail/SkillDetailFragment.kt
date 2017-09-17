package com.acv.mycv.ui.skills.detail

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.Skill
import com.acv.mycv.ui.skills.SkillViewHolder
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_skills.*


class SkillDetailFragment : BaseFragment() {
    override fun getLayout() =
            R.layout.fragment_skills

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
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
//            layoutManager = linearLayoutManager()
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = Adapter(getItems(), { x, y ->
                getHolder(x, y, { a, b ->
                    when (b) {
                        is NormalItem -> NormalViewHolder(a,b)
                        is ShortItem -> ShortViewHolder(a)
                        is LargeItem -> LargeViewHolder(a)
                    }
                })
            }) { listener(it) }
        }
    }

    fun <A : View, M : ItemVisitable, VH : ViewHolder<M>> getHolder(v: A, type: M, f: (A, M) -> VH): VH =
            f(v, type)

    fun listener(it: Kotlin) =
            coordinator.snackBar(it.name)

    fun getItems() = listOf(
            NormalItem("Kotlin"),
            LargeItem("Librerias"),
            ShortItem("Solid")
    )
}
