package com.vk.coroutine.demo.mydatabase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.vk.coroutine.demo.model.LoginResponce
import com.vk.coroutine.demo.mydatabase.databasemodel.LoginResponce_db

@Dao()
interface LoginTableDao  {

    @Query("select * from LoginResponce_db")
    fun getAll(): LoginResponce_db
    @Insert
    fun insertAll(vararg users : LoginResponce_db)

    @Delete
    fun delete(user: LoginResponce_db)
}