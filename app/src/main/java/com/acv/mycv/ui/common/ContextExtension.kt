package com.acv.mycv.ui.common

import android.app.Activity
import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.View


fun Context.color(color: Int) =
        ContextCompat.getColor(this, color)

fun Activity.toggleVisivility(vararg a: View) =
        a.map { it.toggleVisivility() }
