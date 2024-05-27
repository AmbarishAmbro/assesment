package com.example.androidassesment.features.productList.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProductListItem(image: String?, productTitle: String?, price: Int?, languageCount: Int?, discount:Int?, onItemClick: () -> Unit = {}) {
    Card(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth().clickable(onClick = { onItemClick() })
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White), verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                modifier = Modifier.padding(10.dp),
                model = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                filterQuality = FilterQuality.High,
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(productTitle.orEmpty(), style = MaterialTheme.typography.titleLarge, color = Color.Black)
                Text("Rs.$price ", style = MaterialTheme.typography.bodyMedium, color = Color.Black)
                Text(
                    "Languages : $languageCount",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black
                )

            }
        }
    }
}