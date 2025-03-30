package com.guilherme.retrofitproject.data.network

data class Country(
    val name: CountryName,
    val capital: List<String>?,
    val region: String,
    val population: Long
)

data class CountryName(
    val common: String,
    val official: String
)

