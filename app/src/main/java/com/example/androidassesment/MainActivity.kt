package com.example.androidassesment

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidassesment.features.productList.presentation.component.ProductListItem
import com.example.androidassesment.features.productList.presentation.viewModel.BookViewModel
import com.example.androidassesment.ui.theme.AndroidAssesmentTheme

class MainActivity : ComponentActivity() {
    private val viewModel: BookViewModel by viewModels()


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAssesmentTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(topBar = {TopAppBar(title = { Text(text = "Book List") })}) {
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(it),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        BookItem(viewModel)

                    }
                }
            }
        }


    }
}


@Composable
fun BookItem(viewModel: BookViewModel) {
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
                ProductListItem(
                    image = book.getOrNull(it)?.imagePath?.square,
                    productTitle = book.getOrNull(it)?.name,
                    price = book.getOrNull(it)?.price,
                    languageCount = book.getOrNull(it)?.availableLanguages?.size,
                    discount = book.getOrNull(it)?.discount,
                )
            }
        }
    }
}