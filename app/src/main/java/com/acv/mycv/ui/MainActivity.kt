package com.acv.mycv.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.education.EducationFragment
import com.acv.mycv.ui.profile.ProfileFragment
import com.acv.mycv.ui.skills.SkillsFragment
import com.acv.mycv.ui.works.WorksFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        load<ProfileFragment>()
        navigation.setOnNavigationItemSelectedListener {
            Action {
                when (it.itemId) {
                    PROFILE -> Action { load<ProfileFragment>() }
                    SKILLS -> Action { load<SkillsFragment>() }
                    WORKS -> Action { load<WorksFragment>() }
                    EDUCATION -> Action { load<EducationFragment>() }
                    OTHERS -> Action { }
                }
            }
        }
    }
}
