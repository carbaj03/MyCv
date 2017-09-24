package com.acv.mycv.ui.common

import android.app.Activity
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.acv.mycv.R
import kotlinx.android.synthetic.main.collapsing_toolbar.*

inline fun <reified T : Fragment> AppCompatActivity.load(vararg args: Pair<String, String>) =
        with(supportFragmentManager) {
            beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .replace(R.id.container, createFragment<T>(*args), T::class.java.simpleName)
                    .commit()
        }

inline fun <reified T : Fragment> Fragment.replace(vararg args: Pair<String, String>) =
        with((context as AppCompatActivity).supportFragmentManager) {
            beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .replace(R.id.container, createFragment<T>(*args), T::class.java.simpleName)
                    .addToBackStack(T::class.java.simpleName)
                    .commit()
        }

inline fun <reified T : Fragment> Fragment.add(vararg args: Pair<String, String>) =
        with((context as AppCompatActivity).supportFragmentManager) {
            beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .add(R.id.container, createFragment<T>(*args), T::class.java.simpleName)
                    .commit()
        }


inline fun <reified T : Fragment> createFragment(vararg args: Pair<String, String>): T =
        with(T::class.java.newInstance()) {
            val bundle = Bundle()
            args.map { bundle.putString(it.first, it.second) }
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

fun Fragment.getExtra(extra: String): String =
        arguments?.getString(extra)?.let { it } ?: ""

fun Fragment.configToolbar(newTitle: String) =
        with(activity as AppCompatActivity) {
            setSupportActionBar(toolbar)
            supportActionBar!!.apply {
                setDisplayShowTitleEnabled(true)
                setDisplayHomeAsUpEnabled(true)
                title = newTitle
            }
        }

fun Fragment.title(newTitle: String) =
        with(activity as AppCompatActivity) {
            supportActionBar!!.title = newTitle
        }


//LiveData
typealias Obs<T> = ((T) -> Unit)
typealias Obs2<T> = (Obs<T>) -> Unit

infix fun <M, T : List<M>> Fragment.observe(f: () -> LiveData<T>): Obs2<T> =
        { o: (T) -> Unit -> f().observe(activity, Observer { o(it!!) }) }

infix fun <T> Obs2<T>.`do`(f: Obs<T>): Unit =
        this({ f(it) })

inline fun <reified T : ViewModel> Fragment.viewModelProviders(): T =
        ViewModelProviders.of(this).get(T::class.java)