package com.example.androidassesment.core.remote

import com.example.androidassesment.features.productList.data.remote.BookApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://apps.clickastro.com/test/"
    val api: BookApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(BookApiService::class.java)
    }
}