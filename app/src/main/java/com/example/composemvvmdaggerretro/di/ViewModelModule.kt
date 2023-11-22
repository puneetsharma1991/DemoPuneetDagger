package com.example.composemvvmdaggerretro.di

import androidx.lifecycle.ViewModelProvider
import com.example.composemvvmdaggerretro.viewmodels.EcommerceViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * Module for providing [CheckoutViewModelFactory] provider
 *
 */
@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: EcommerceViewModelFactory): ViewModelProvider.Factory
}
