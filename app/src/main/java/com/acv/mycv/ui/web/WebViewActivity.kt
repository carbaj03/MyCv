package com.acv.mycv.ui.web

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient
import com.acv.mycv.R
import com.acv.mycv.ui.common.hide
import com.acv.mycv.ui.common.show
import kotlinx.android.synthetic.main.activity_web_view.*
import kotlinx.android.synthetic.main.activity_web_view.view.*


class WebViewActivity : AppCompatActivity() {

    val o: String = "http://alejandrocarbajo.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        setSupportActionBar(toolbar)
        supportActionBar!!.apply {
            setDisplayShowTitleEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = "Alejandrocarbajo.com"
        }

        ivLoading.show()



    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        webView.apply {
            hide()
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
            loadUrl(o)
            webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    webView.show()
                }
            }
        }
    }
}