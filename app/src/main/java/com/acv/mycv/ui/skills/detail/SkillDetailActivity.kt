package com.acv.mycv.ui.skills.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.view.MenuItem
import com.acv.mycv.R
import com.acv.mycv.ui.common.SKILL
import com.acv.mycv.ui.common.TITLE
import com.acv.mycv.ui.common.getExtra
import com.acv.mycv.ui.common.load
class SkillDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        load<SkillDetailFragment>(TITLE to getExtra(TITLE), SKILL to getExtra(SKILL))
    }

    override fun onBackPressed() =
            super.onBackPressed()

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean =
            super.onKeyDown(keyCode, event)
}

