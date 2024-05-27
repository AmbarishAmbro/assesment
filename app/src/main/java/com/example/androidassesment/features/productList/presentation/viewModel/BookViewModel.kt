package com.example.androidassesment.features.productList.presentation.viewModel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidassesment.core.remote.RetrofitInstance
import com.example.androidassesment.features.productList.data.local.entity.Book
import com.example.androidassesment.features.productList.data.remote.model.Response.BookExpectedResponce
import com.example.androidassesment.features.productList.data.remote.model.Response.Product

import com.example.androidassesment.features.productList.data.remote.models.BookResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.math.log

class BookViewModel :ViewModel() {
    private val _bookFlow = MutableStateFlow<List<Product?>>(emptyList<Product>())
    val bookFlow: StateFlow<List<Product?>> = _bookFlow

    private val apiService = RetrofitInstance.api
    init {
         viewModelScope.launch (Dispatchers.IO){
        var book_responce =  apiService.fetchBookList("https://apps.clickastro.com/test/products.php")

             _bookFlow.value = listOf(
                 Product.fromBP(book_responce.products.BP),
                 (Product.fromED(book_responce.products.ED)),
                 (Product.fromCp(book_responce.products.CP)),
                 (Product.fromGm(book_responce.products.GM)),
                 (Product.fromLi(book_responce.products.LI)),
                 (Product.fromMp(book_responce.products.MP)),
                 (Product.fromMr(book_responce.products.MR)),
                 (Product.fromWl(book_responce.products.WL)),
                 (Product.fromPcol(book_responce.products.PCOL)),
                 (Product.fromPpol(book_responce.products.PPOL)),
                 (Product.fromYg(book_responce.products.YG))
             )




        }


    }

}