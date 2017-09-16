package com.acv.mycv.ui.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.web.WebViewActivity
import kotlinx.android.synthetic.main.activity_main.*


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar!!.apply {
            setDisplayShowTitleEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = "Android Developer"
        }

        navigation.setOnNavigationItemSelectedListener {
            Action {
                when (it.itemId) {
                    PROFILE -> Action { data.snack("1") }
                    SKILLS -> Action { data.snack("2") }
                    WORKS -> Action { data.snack("3") }
                    STUDIES -> Action { data.snack("3") }
                    OTHERS -> Action { data.snack("3") }
                }
            }
        }

        ivProfile.loadCircle(R.drawable.profile)
        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            with(emailIntent){
                data = Uri.parse("mailto:")
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, "asdfsdf@sdfs.com")
                putExtra(Intent.EXTRA_CC, "CC")
                putExtra(Intent.EXTRA_SUBJECT, "Your subject")
                putExtra(Intent.EXTRA_TEXT, "Email message goes here")
            }

            try {
                startActivity(Intent.createChooser(emailIntent, "Send mail..."))
            } catch (ex: android.content.ActivityNotFoundException) {
                Toast.makeText(this@ProfileActivity, "There is no email client installed.", Toast.LENGTH_SHORT).show()
            }
        }
        btnPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:699790887")
            startActivity(intent)
        }

        btnWeb.setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }
    }
}
