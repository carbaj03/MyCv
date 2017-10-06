package com.acv.mycv.ui.others.interest

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.acv.mycv.data.InterestRepository
import com.acv.mycv.data.cache.InterestCache

class InterestViewModel(
        private val repo: InterestRepository = InterestRepository(InterestCache())
) : ViewModel() {
    private lateinit var meetups: MutableLiveData<List<Interest>>
    private lateinit var events: MutableLiveData<List<Interest>>

    fun getMeetups(): LiveData<List<Interest>> {
        meetups = MutableLiveData()
        meetups.value = repo.loadMeetups()
        return meetups
    }

    fun getEvents(): LiveData<List<Interest>> {
        events = MutableLiveData()
        events.value = repo.loadEvents()
        return events
    }

}