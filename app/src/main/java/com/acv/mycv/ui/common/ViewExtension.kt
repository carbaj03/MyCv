package com.acv.mycv.ui.common

import android.support.design.widget.Snackbar
import android.view.*
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.bumptech.glide.request.RequestOptions.centerCropTransform

fun ImageView.load(toLoad: Any) =
        Glide.with(context)
                .load(toLoad)
                .apply(centerCropTransform())
                .into(this)

fun ImageView.loadCircle(toLoad: Any) =
        Glide.with(context)
                .load(toLoad)
                .apply(bitmapTransform(MultiTransformation(CircleCrop(), CenterCrop())))
                .into(this)

fun Action(f: () -> Unit): Boolean {
    f()
    return true
}

fun View.snackBar(value: Any) = when (value) {
    is Int -> Snackbar.make(this, value, Snackbar.LENGTH_SHORT).show()
    is String -> Snackbar.make(this, value, Snackbar.LENGTH_SHORT).show()
    else -> Snackbar.make(this, "Error", Snackbar.LENGTH_SHORT).show()
}

fun View.hide() =
        setVisibility(View.GONE)


fun View.show() =
        setVisibility(View.VISIBLE)

infix fun View.click(f: () -> Unit) =
        setOnClickListener { f() }

fun View.toggleVisivility() =
        when (visibility) {
            View.VISIBLE -> visibility = View.GONE
            View.INVISIBLE -> visibility = View.VISIBLE
            View.GONE -> visibility = View.VISIBLE
            else -> visibility = View.VISIBLE
        }

infix fun ViewGroup.inflate(res: Int) =
        LayoutInflater.from(context).inflate(res, this, false)

fun MenuInflater.make(menuRes: Int, menu: Menu) = Action { inflate(menuRes, menu) }