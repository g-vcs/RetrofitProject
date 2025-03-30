package com.guilherme.retrofitproject.data.network

interface CountryRepository {
    suspend fun getCountries(): List<Country>
}

class NetworkCountryRepository(private val countryService: CountryService) : CountryRepository {
    override suspend fun getCountries(): List<Country> {
        return countryService.getCountries()
    }
}