package com.acv.mycv.ui.common

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.acv.mycv.R

inline fun <reified T : Fragment> AppCompatActivity.load(vararg args: Pair<String, String>) =
        with(supportFragmentManager) {
            beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .replace(R.id.container, createFragment<T>(*args), T::class.java.simpleName)
                    .commit()
        }

inline fun <reified T : Fragment> Fragment.loada(vararg args: Pair<String, String>) =
        with((context as AppCompatActivity).supportFragmentManager) {
            beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .replace(R.id.container, createFragment<T>(*args), T::class.java.simpleName)
                    .commit()
        }

inline fun <reified T : Fragment> createFragment(vararg args: Pair<String, String>): T =
        with(T::class.java.newInstance()) {
            val bundle = Bundle()
            args.map { bundle.putSerializable(it.first, it.second) }
            arguments = bundle
            return this
        }

inline fun <reified T : Activity> Fragment.load(vararg pairs: Pair<String, String>) =
        with(activity) {
            goToActivity<T>(*pairs)
            setFadeInOutAnimation()
        }

fun Fragment.linearLayoutManager() =
        LinearLayoutManager(context)