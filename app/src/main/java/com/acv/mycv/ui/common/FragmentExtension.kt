package com.acv.mycv.ui.common

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.acv.mycv.R

inline fun <reified T : Fragment> AppCompatActivity.load(args: List<Pair<String, String>> = listOf()) {
    supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
            .replace(R.id.container, createFragment<T>(args), T::class.java.simpleName)
            .commit()
}

inline fun <reified T : Fragment> createFragment(args: List<Pair<String, String>> = listOf()): T {
    val fragment = T::class.java.newInstance()
    val bundle = Bundle()
    args.map { bundle.putSerializable(it.first, it.second) }
    fragment.arguments = bundle
    return fragment
}


fun Fragment.linearLayoutManager() = LinearLayoutManager(context)