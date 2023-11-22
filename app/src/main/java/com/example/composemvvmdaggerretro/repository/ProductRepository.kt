package com.example.composemvvmdaggerretro.repository

import com.example.composemvvmdaggerretro.model.Product
import com.example.composemvvmdaggerretro.service.ProductApiServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class ProductRepository @Inject constructor(private val productApiServices: ProductApiServices) {

    val productList = mutableListOf<Product>()

    suspend fun getProducts(): Response<List<Product>> {
      return  productApiServices.getProducts()

    }

   /* suspend fun getProducts(): List<Product>{
        productApiServices.getProducts().enqueue(object :Callback<List<Product>>{
            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })

    }*/
}