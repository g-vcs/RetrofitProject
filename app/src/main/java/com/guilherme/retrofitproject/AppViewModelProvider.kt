package com.guilherme.retrofitproject

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.guilherme.retrofitproject.ui.screen.CountryViewModel

object AppViewModelProvider {
    val Factory: ViewModelProvider.Factory = viewModelFactory {

        //initializer for CountryViewModel
        initializer {
            val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as CountryApplication)
            val countryRepository = application.container.countryRepository
            CountryViewModel(countryRepository = countryRepository)
        }

    }
}