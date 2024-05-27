package com.example.androidassesment.features.productList.data.local.appDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.androidassesment.features.productList.data.local.dao.BookDao
import com.example.androidassesment.features.productList.data.local.entity.Book

@Database(entities = [Book::class], exportSchema = true, version = 1)
abstract class AppDatabase :RoomDatabase() {
    abstract fun getBookDao(): BookDao

    companion object {
        private const val DB_NAME = "book_database.db"
        @Volatile
        private var instance: AppDatabase? = null


        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            DB_NAME
        ).build()
    }
}