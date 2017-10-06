package com.acv.mycv.ui.others.referent

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.acv.mycv.data.ReferentRepository
import com.acv.mycv.data.cache.ReferentCache
import com.acv.mycv.ui.others.interest.Interest

class ReferentViewModel(
        private val repo: ReferentRepository = ReferentRepository(ReferentCache())
) : ViewModel() {
    private lateinit var androiders: MutableLiveData<List<Referent>>
    private lateinit var crafters: MutableLiveData<List<Referent>>
    private lateinit var softs: MutableLiveData<List<Referent>>

    fun getAndroids(): LiveData<List<Referent>> {
        androiders = MutableLiveData()
        androiders.value = repo.loadAndroiders()
        return androiders
    }

    fun getCrafters(): LiveData<List<Referent>> {
        crafters = MutableLiveData()
        crafters.value = repo.loadCrafters()
        return crafters
    }

    fun getSofts(): LiveData<List<Referent>> {
        softs = MutableLiveData()
        softs.value = repo.loadSofts()
        return softs
    }

}