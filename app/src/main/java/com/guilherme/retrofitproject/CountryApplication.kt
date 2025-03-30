package com.guilherme.retrofitproject

import android.app.Application
import com.guilherme.retrofitproject.data.network.AppContainer
import com.guilherme.retrofitproject.data.network.DefaultAppContainer

class CountryApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}