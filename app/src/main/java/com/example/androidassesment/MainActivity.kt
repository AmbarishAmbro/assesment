package com.example.androidassesment

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androidassesment.features.productList.presentation.component.ProductListItem
import com.example.androidassesment.features.productList.presentation.nav.Nav
import com.example.androidassesment.features.productList.presentation.viewModel.BookViewModel
import com.example.androidassesment.ui.theme.AndroidAssesmentTheme
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class MainActivity : ComponentActivity() {
    private val viewModel: BookViewModel by viewModels()


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAssesmentTheme {

                // A surface container using the 'background' color from the theme
                Scaffold(topBar = {TopAppBar(title = { Text(text = "Book Bazaar") })}) {
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(it),
                        color = MaterialTheme.colorScheme.background
                    ) {

                   Nav()

                    }
                }
            }
        }


    }
}


@Composable
fun BookItem(navController: NavHostController) {
    val viewModel:BookViewModel = BookViewModel()
    val book by viewModel.bookFlow.collectAsState()


    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        LazyColumn(
            contentPadding = PaddingValues(15.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(book?.size?:0) {
                val currentBook = book?.getOrNull(it)
                ProductListItem(
                    image = book.getOrNull(it)?.imagePath?.square,
                    productTitle = book.getOrNull(it)?.name,
                    price = book.getOrNull(it)?.price,
                    languageCount = book.getOrNull(it)?.availableLanguages?.size,
                    discount = book.getOrNull(it)?.discount, onItemClick = {
                        val imageUrl = Uri.encode(currentBook?.imagePath?.square.orEmpty())
                        val productTitle = Uri.encode(currentBook?.name.orEmpty())
                        val price = currentBook?.price ?: 0
                        val description = Uri.encode(currentBook?.description.orEmpty())
                        val discount = currentBook?.discount ?: 0
                        val route = "ProductDetails?image=$imageUrl&productTitle=$productTitle&price=$price&description=$description&discount=$discount"
                        navController.navigate(route)
                    }
                )
            }
        }
    }
}