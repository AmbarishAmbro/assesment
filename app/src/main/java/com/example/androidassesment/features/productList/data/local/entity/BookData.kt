package com.example.androidassesment.features.productList.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book (
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val bookTitle: String?,
    val description: String?,
    val availableLanguage: List<String>?,
    val pageCount : Int?,
    val price :Int?,
    val squareImage:String?,
    val wideImage:String?,
    val rating : Int?,
    val discount : Int?


)