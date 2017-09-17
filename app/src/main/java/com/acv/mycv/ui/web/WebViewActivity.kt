package com.acv.mycv.ui.web

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.activity_web_view.*
import kotlinx.android.synthetic.main.activity_web_view.view.*


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        configToolbar()
        configWebView()
    }

    private fun configToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.apply {
            setDisplayShowTitleEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = getExtra(TITLE)
        }
    }

    private fun configWebView() =
        webView.apply {
            hide()
            settings.javaScriptEnabled = true
            loadUrl(getExtra(URL))
            pageFinished { webView.show() }
        }


    override fun onBackPressed() =
            webView.back { super.onBackPressed() }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean =
            webView.back(keyCode) { super.onKeyDown(keyCode, event) }

}