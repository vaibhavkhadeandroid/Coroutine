package com.vk.coroutine.demo.mydatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vk.coroutine.demo.mydatabase.dao.LoginTableDao
import com.vk.coroutine.demo.viewmodels.LoginResponce

@Database(entities = [LoginResponce::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun loginTableDao(): LoginTableDao

//    companion object {
//        private fun buildDatabase(context: Context) = {
//            val db = Room.databaseBuilder(
//                context.applicationContext,
//                AppDatabase::class.java, "database-name"
//            ).build()
//        }
//    }
    companion object {
    // Singleton prevents multiple instances of database opening at the
    // same time.
    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
        // if the INSTANCE is not null, then return it,
        // if it is, then create the database
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "word_database"
            ).build()
            INSTANCE = instance
            // return instance
            instance
        }
    }
}
}


