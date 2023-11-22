package com.example.composemvvmdaggerretro.di

import androidx.lifecycle.ViewModel
import com.example.composemvvmdaggerretro.viewmodels.ProductViewModel
import com.example.composemvvmdaggerretro.viewmodels.ViewModelKeyKt
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ProductModule {

    @Binds
    @IntoMap
    @ViewModelKeyKt(ProductViewModel::class)
    abstract fun provideUserAddressVM(productViewModel: ProductViewModel): ViewModel

}
