package com.guilherme.retrofitproject.ui.screen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guilherme.retrofitproject.data.network.Country
import com.guilherme.retrofitproject.data.network.CountryRepository
import kotlinx.coroutines.launch


class CountryViewModel(private val countryRepository: CountryRepository) : ViewModel() {
    private val _countries = mutableStateOf<List<Country>>(emptyList())
    val countries: State<List<Country>> = _countries

    private val _errorMessage = mutableStateOf<String?>(null)
    val errorMessage: State<String?> = _errorMessage

    init {
        getCountries()
    }

    fun getCountries() {
        viewModelScope.launch {
            try {
                val result = countryRepository.getCountries()
                _countries.value = result
                Log.d("COUNTRIES", "Countries: ${result.get(0)}")

            } catch (e: Exception) {
                _errorMessage.value = "Failed to load countries: ${e.localizedMessage}"
            }
        }
    }
}