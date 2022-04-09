package com.vk.coroutine.demo.mydatabase

import com.vk.coroutine.demo.viewmodels.LoginResponce


class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getUsers(): LoginResponce = appDatabase.loginTableDao().getAll()
    override suspend fun insertAll(users: LoginResponce) = appDatabase.loginTableDao().insertAll(users)


}