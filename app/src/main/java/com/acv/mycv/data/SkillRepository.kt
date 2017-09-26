package com.acv.mycv.data

import com.acv.mycv.data.cache.SkillCache


class SkillRepository(
        private val cache: SkillCache
) {
    fun loadSkillDetail(idSkill: String) = cache.getSkillDetail(idSkill)
    fun loadSkills() = cache.getAll()
    fun loadSkill(idSkill: String) = cache.getBy(idSkill)
}