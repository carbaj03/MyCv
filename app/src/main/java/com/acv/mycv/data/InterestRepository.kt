package com.acv.mycv.data

import com.acv.mycv.data.cache.InterestCache

class InterestRepository(
        private val cache: InterestCache
) {
    fun loadMeetups() = cache.getMeetups()
    fun loadEvents() = cache.getEvents()
}