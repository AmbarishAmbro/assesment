package com.example.androidassesment.features.productList.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ProductDetailsScreen(
    image: String?,
    productTitle: String?,
    price: Int?,
    description: String?,
    discount: Int?,
    onBackPress: () -> Unit = {}
) {
    val colorOffWhite = Color(0xFF9C8F80)
    val colorGrey = Color.White
    val gradientGreenRed = Brush.verticalGradient(0f to colorGrey, 1000f to colorOffWhite)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(gradientGreenRed)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, end = 18.dp, top = 18.dp, bottom = 24.dp)
                .wrapContentHeight(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            AsyncImage(
                modifier = Modifier
                    .border(
                        BorderStroke(.5.dp, Color.LightGray),
                        RoundedCornerShape(5.dp)
                    )
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(1.dp)
                    )
                    .padding(2.dp),
                model = image,
                contentDescription = description,
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 10.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = productTitle.toString(),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    ".$description ",
                    textAlign = TextAlign.Justify,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )

//                Text(
//                    "Languages Available :",
//                    textAlign = TextAlign.Left,
//                    style = MaterialTheme.typography.titleMedium,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Gray
//                )
//                FlowRow {
//                    repeat(stringList.size) {
//                        Text(
//                            text = stringList[it],
//                            textAlign = TextAlign.Left,
//                            style = MaterialTheme.typography.bodyMedium,
//                            color = Color.Black,
//                            maxLines = 2,
//                            overflow = TextOverflow.Ellipsis
//                        )
//                        if (it != stringList.size - 1) {
//                            Text(text = ",")
//                        }
//                    }
//                }

            }
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(1.dp)
                ) {

                    Column(modifier = Modifier.wrapContentSize()) {
                        ProductSpecification("Price", "Rs.$price")
                        DottedUnderlineRow()
                        ProductSpecification("Discount", "Rs.$discount")
                        DottedUnderlineRow()
                    }
                }


            }
        }


    }
}

@Composable
fun DottedUnderlineRow() {
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(5f, 11f), 0f)
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
    ) {
        drawLine(
            color = Color(0xFF9C8F80),
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = pathEffect
        )
    }
}

@Composable
fun ProductSpecification(title: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(
            modifier = Modifier
                .wrapContentSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                textAlign = TextAlign.Left
            )
        }
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black,
            textAlign = TextAlign.Right
        )


    }
}
