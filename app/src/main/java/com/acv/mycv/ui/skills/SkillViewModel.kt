package com.acv.mycv.ui.skills

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.acv.mycv.data.SkillRepository
import com.acv.mycv.data.cache.SkillCache
import com.acv.mycv.ui.skills.detail.SkillDetailItem

class SkillViewModel(
        private val repo: SkillRepository = SkillRepository(SkillCache())
) : ViewModel() {
    private lateinit var skills: MutableLiveData<List<Skill>>

    fun getSkillDetail(): LiveData<List<Skill>> {
        skills = MutableLiveData()
        skills.value = repo.loadSkills()
        return skills
    }
}