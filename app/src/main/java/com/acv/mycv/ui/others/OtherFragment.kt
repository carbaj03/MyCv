package com.acv.mycv.ui.others

import android.support.design.widget.TabLayout
import com.acv.mycv.R
import com.acv.mycv.ui.common.BaseFragment
import com.acv.mycv.ui.common.createFragment
import com.acv.mycv.ui.others.interest.InterestFragment
import com.acv.mycv.ui.others.referent.ReferentFragment
import kotlinx.android.synthetic.main.fragment_other.*


class OtherFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_other

    override fun onCreate() {
        with(viewPager) {
            val pagerAdapter = PagerAdapter(activity.supportFragmentManager)
            pagerAdapter.addFragment(createFragment<ReferentFragment>())
            pagerAdapter.addFragment(createFragment<InterestFragment>())
            pagerAdapter.addFragment(createFragment<InterestFragment>())

            adapter = pagerAdapter
            addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        }

        with(tabs) {
            tabGravity = TabLayout.GRAVITY_FILL
            addTab(newTab().setText("REFERENTES"))
            addTab(newTab().setText("INTERESES"))
            addTab(newTab().setText("OBJETIVOS"))
            addOnTabSelectedListener(onTabSelected { viewPager.currentItem = it.position })
        }
    }

    fun TabLayout.onTabSelected(f: (TabLayout.Tab) -> Unit) =
            object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    f(tab)
                }

                override fun onTabUnselected(tab: TabLayout.Tab) {}
                override fun onTabReselected(tab: TabLayout.Tab) {}
            }
}