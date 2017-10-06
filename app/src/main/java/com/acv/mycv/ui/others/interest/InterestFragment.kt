package com.acv.mycv.ui.others.interest

import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.fragment_interest.*


class InterestFragment : BaseFragment() {
    private val meetupsAdapter
            by lazy { InterestAdapter(holder = ::InterestViewHolder) { } }
    private val eventsAdapter
            by lazy { InterestAdapter(holder = ::InterestViewHolder) {} }

    private val model
            by lazy { viewModelProviders<InterestViewModel>() }

    override fun getLayout() = R.layout.fragment_interest

    override fun onCreate() {
        observe { model.getMeetups() } `do` { meetupsAdapter.add(it) }
        observe { model.getEvents() } `do` { eventsAdapter.add(it) }

        with(rvMeetups) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
            LinearSnapHelper().attachToRecyclerView(this)
            adapter = meetupsAdapter
        }

        with(rvEvents) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
            LinearSnapHelper().attachToRecyclerView(this)
            adapter = eventsAdapter
        }
    }

}