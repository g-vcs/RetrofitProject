package com.guilherme.retrofitproject.data.network

import retrofit2.http.GET

interface CountryService {
    @GET("all")
    suspend fun getCountries(): List<Country>
}