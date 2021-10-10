package com.lbj23.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "mlW2TxpgLkK98Azm"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}