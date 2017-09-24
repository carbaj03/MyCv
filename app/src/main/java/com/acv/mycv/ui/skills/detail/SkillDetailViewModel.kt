package com.acv.mycv.ui.skills.detail

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.acv.mycv.data.SkillRepository
import com.acv.mycv.data.cache.SkillCache

class SkillDetailViewModel(
        private val repo: SkillRepository = SkillRepository(SkillCache())
) : ViewModel() {
    private lateinit var skills: MutableLiveData<List<SkillDetailItem>>

    fun getSkillDetail(idSkill: String): LiveData<List<SkillDetailItem>> {
        skills = MutableLiveData()
        skills.value = repo.loadSkillDetail(idSkill)
        return skills
    }
}