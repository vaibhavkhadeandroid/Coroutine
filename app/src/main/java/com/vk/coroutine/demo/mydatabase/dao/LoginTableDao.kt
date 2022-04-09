package com.vk.coroutine.demo.mydatabase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.vk.coroutine.demo.viewmodels.LoginResponce

@Dao()
interface LoginTableDao  {

    @Query("select * from LoginResponce")
    fun getAll():LoginResponce
    @Insert
    fun insertAll(vararg users : LoginResponce)

    @Delete
    fun delete(user: LoginResponce)
}