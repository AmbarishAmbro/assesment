package com.example.androidassesment.features.productList.presentation.nav

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.androidassesment.BookItem
import com.example.androidassesment.features.productList.presentation.component.ProductDetailsScreen

@Composable
fun Nav() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){

         BookItem(navController)

        }
        composable("ProductDetails?image={image}&productTitle={productTitle}&price={price}&description={description}&discount={discount}",
            arguments = listOf( navArgument("image") { type = NavType.StringType },
                navArgument("productTitle") { type = NavType.StringType },
                navArgument("price") { type = NavType.IntType },
                navArgument("description") { type = NavType.StringType },
                navArgument("discount") { type = NavType.IntType })
            ){
            ProductDetailsScreen(
                image = it.arguments?.getString("image"),
                productTitle = it.arguments?.getString("productTitle"),
                price = it.arguments?.getInt("price"),
                description = it.arguments?.getString("description"),
                discount = it.arguments?.getInt("discount"),
                onBackPress = { navController.popBackStack() }
            )


        }
    }
}

@Composable
fun Sample(){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "Ambarish")
    }
}