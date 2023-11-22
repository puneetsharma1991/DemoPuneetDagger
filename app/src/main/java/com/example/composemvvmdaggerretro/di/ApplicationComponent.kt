package com.example.composemvvmdaggerretro.di

import com.example.composemvvmdaggerretro.MainActivity
import dagger.Component
import javax.inject.Singleton

// it has a scope object that is why we declare it singlton
@Singleton
@Component(modules = [NetworkApiModule::class, ViewModelModule::class, ProductModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}