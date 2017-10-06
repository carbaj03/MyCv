package com.acv.mycv.ui.others.referent

import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.fragment_referent.*


class ReferentFragment : BaseFragment() {
    private val androidAdapter
            by lazy { ReferentAdapter(holder = ::ReferentViewHolder) {} }
    private val crafterAdapter
            by lazy { ReferentAdapter(holder = ::ReferentViewHolder) {} }
    private val softAdapter
            by lazy { ReferentAdapter(holder = ::ReferentViewHolder) {} }


    private val model
            by lazy { viewModelProviders<ReferentViewModel>() }

    override fun getLayout() = R.layout.fragment_referent

    override fun onCreate() {
        observe { model.getAndroids() } `do` { androidAdapter.add(it) }
        observe { model.getCrafters() } `do` { crafterAdapter.add(it) }
        observe { model.getSofts() } `do` { softAdapter.add(it) }

        with(rvAndroid) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
            LinearSnapHelper().attachToRecyclerView(this)
            adapter = androidAdapter
        }

        with(rvCrafter) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
            LinearSnapHelper().attachToRecyclerView(this)
            adapter = crafterAdapter
        }


        with(rvSoftSkills) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
            LinearSnapHelper().attachToRecyclerView(this)
            adapter = softAdapter
        }

    }

}