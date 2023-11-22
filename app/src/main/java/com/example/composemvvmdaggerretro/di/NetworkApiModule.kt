package com.example.composemvvmdaggerretro.di

import com.example.composemvvmdaggerretro.service.ProductApiServices
import com.example.composemvvmdaggerretro.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkApiModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesProductApiServices(retrofit: Retrofit): ProductApiServices{
        return  retrofit.create(ProductApiServices::class.java)
    }
}