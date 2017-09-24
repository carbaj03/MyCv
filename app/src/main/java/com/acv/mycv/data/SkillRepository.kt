package com.acv.mycv.data

import com.acv.mycv.data.cache.SkillCache


class SkillRepository(
        private val cache: SkillCache
) {
    fun loadSkillDetail(login: String) = cache.loadSkillDetail(login)
}