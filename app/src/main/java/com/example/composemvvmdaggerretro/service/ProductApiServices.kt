package com.example.composemvvmdaggerretro.service

import com.example.composemvvmdaggerretro.model.Product
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ProductApiServices {


    @GET("products")
   suspend fun getProducts(): Response<List<Product>>
}