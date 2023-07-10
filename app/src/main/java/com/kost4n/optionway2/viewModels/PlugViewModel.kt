package com.kost4n.optionway2.viewModels

import androidx.lifecycle.ViewModel
import com.kost4n.optionway2.repositories.FactRepository
import com.kost4n.optionway2.utilits.Fact
import kotlinx.coroutines.flow.Flow

class PlugViewModel: ViewModel() {
    private val factRepository = FactRepository()

    fun getFacts(): List<Fact> = factRepository.getFacts()
}