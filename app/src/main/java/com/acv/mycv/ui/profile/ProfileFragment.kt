package com.acv.mycv.ui.profile

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.Toast
import com.acv.mycv.R
import com.acv.mycv.ui.common.BaseFragment
import com.acv.mycv.ui.common.loadCircle
import com.acv.mycv.ui.web.WebViewActivity
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_profile

    override fun onCreate() {
        with(activity as AppCompatActivity) {
            setSupportActionBar(toolbar)
            supportActionBar!!.apply {
                setDisplayShowTitleEnabled(true)
                setDisplayHomeAsUpEnabled(true)
                title = "Android Developer"
            }
        }


        ivProfile.loadCircle(R.drawable.profile)

        btnEmail.setOnClickListener {
            with(Intent(Intent.ACTION_SEND)) {
                data = Uri.parse("mailto:")
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, "asdfsdf@sdfs.com")
                putExtra(Intent.EXTRA_CC, "CC")
                putExtra(Intent.EXTRA_SUBJECT, "Your subject")
                putExtra(Intent.EXTRA_TEXT, "Email message goes here")
                try {
                    startActivity(Intent.createChooser(this, "Send mail..."))
                } catch (ex: android.content.ActivityNotFoundException) {
                    Toast.makeText(activity, "There is no email client installed.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnPhone.setOnClickListener {
            with(Intent(Intent.ACTION_DIAL)) {
                data = Uri.parse("tel:699790887")
                startActivity(this)
            }
        }

        btnWeb.setOnClickListener {
            startActivity(Intent(activity, WebViewActivity::class.java))
        }

    }
}
