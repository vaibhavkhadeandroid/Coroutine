package com.vk.coroutine.demo.mydatabase

import com.vk.coroutine.demo.model.LoginResponce
import com.vk.coroutine.demo.mydatabase.databasemodel.LoginResponce_db

interface DatabaseHelper {

    suspend fun getUsers(): LoginResponce_db

    suspend fun insertAll(users: LoginResponce_db)

}