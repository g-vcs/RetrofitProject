package com.guilherme.retrofitproject.data.network

import android.content.Context

interface AppContainer {
    val countryRepository: CountryRepository
}

class DefaultAppContainer(private val context: Context) : AppContainer {

    override val countryRepository: CountryRepository by lazy {
        NetworkCountryRepository(RetrofitInstance.api)
    }
}
