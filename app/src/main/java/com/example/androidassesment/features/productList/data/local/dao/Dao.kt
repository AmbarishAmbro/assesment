package com.example.androidassesment.features.productList.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.androidassesment.features.productList.data.local.entity.Book

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE) //if some data is same/conflict, it'll be replace with new data.
    suspend fun insertBook(note: Book)



    @Query("SELECT * FROM book_table")
    fun getAllBooks(): List<Book>



}