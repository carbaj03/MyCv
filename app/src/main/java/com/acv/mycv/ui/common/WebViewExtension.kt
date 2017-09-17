package com.acv.mycv.ui.common

import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient


fun WebView.back(f: () -> Unit) =
        when (copyBackForwardList().currentIndex) {
            0 -> goBack()
            else -> f()
        }

fun WebView.back(k: Int, f: () -> Boolean) =
        when (k == KeyEvent.KEYCODE_BACK && canGoBack()) {
            true -> Action { goBack() }
            false -> f()
        }

fun WebView.pageFinished(f: () -> Unit) {
    webViewClient = object : WebViewClient() {
        override fun onPageFinished(view: WebView, url: String) = f()
    }
}