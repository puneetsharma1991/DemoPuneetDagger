package com.example.composemvvmdaggerretro

import android.app.Application
import com.example.composemvvmdaggerretro.di.ApplicationComponent
import com.example.composemvvmdaggerretro.di.DaggerApplicationComponent

class EcommereceApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()

    }
}