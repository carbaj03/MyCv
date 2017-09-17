package com.acv.mycv.ui.common

import android.app.Activity
import android.content.Intent
import com.acv.mycv.R


inline fun <reified T : Activity> Activity.load(vararg pairs: Pair<String, String>) {
    goToActivity<T>(*pairs)
    finish()
    setFadeInOutAnimation()
}

inline fun <reified T : Activity> Activity.goToActivity(vararg pairs: Pair<String, String>) {
    val intent = Intent(this, T::class.java)
    pairs.map { intent.putExtra(it.first, it.second) }
    startActivity(intent)
}

fun Activity.getExtra(extra: String): String =
        intent?.getSerializableExtra(extra)?.let { it as String } ?: ""

fun Activity.getExtraPair(extra: String): Pair<String, String> =
        extra to getExtra(extra)

fun Activity.setFadeInOutAnimation()
        = overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
