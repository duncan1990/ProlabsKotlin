package com.ahmety.kotlinmvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ArticleEntity::class], version = 1)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}