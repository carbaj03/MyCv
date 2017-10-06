package com.acv.mycv.data

import com.acv.mycv.data.cache.ReferentCache

class ReferentRepository(
        private val cache: ReferentCache
) {
    fun loadAndroiders() = cache.getAndroiders()
    fun loadCrafters() = cache.getCrafters()
    fun loadSofts() = cache.getSoftSkills()
}