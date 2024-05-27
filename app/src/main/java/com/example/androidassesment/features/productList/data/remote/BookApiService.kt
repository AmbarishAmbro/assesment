package com.example.androidassesment.features.productList.data.remote

import com.example.androidassesment.features.productList.data.remote.models.BookResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url


interface BookApiService {
        @GET
        suspend fun fetchBookList(
            @Url url: String
        ): BookResponse
    }
