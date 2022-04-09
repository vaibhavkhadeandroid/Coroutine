package com.vk.coroutine.demo.mydatabase

import com.vk.coroutine.demo.viewmodels.LoginResponce

interface DatabaseHelper {

    suspend fun getUsers(): LoginResponce

    suspend fun insertAll(users: LoginResponce)

}