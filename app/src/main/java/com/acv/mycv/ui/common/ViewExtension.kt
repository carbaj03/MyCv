package com.acv.mycv.ui.common

import android.app.Activity
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.circleCropTransform


fun ImageView.loadCircle(toLoad: Any) =
        Glide.with(context)
                .load(toLoad)
                .apply(circleCropTransform())
                .into(this)

fun Action(f: () -> Unit): Boolean {
    f()
    return true
}

fun View.snack(value: Any) = when(value){
    is Int -> Snackbar.make(this, value, Snackbar.LENGTH_SHORT).show()
    is String -> Snackbar.make(this, value, Snackbar.LENGTH_SHORT).show()
    else -> Snackbar.make(this, "Error", Snackbar.LENGTH_SHORT).show()
}

fun Activity.toggleVisivility(vararg a: View) =
        a.map { it.toggleVisivility() }

fun View.hide()  { visibility = View.GONE }
fun View.show()  { visibility = View.VISIBLE}

fun View.toggleVisivility() =
        when(visibility){
            View.VISIBLE -> visibility = View.GONE
            View.INVISIBLE -> visibility = View.VISIBLE
            View.GONE -> visibility = View.VISIBLE
            else -> visibility = View.VISIBLE
        }