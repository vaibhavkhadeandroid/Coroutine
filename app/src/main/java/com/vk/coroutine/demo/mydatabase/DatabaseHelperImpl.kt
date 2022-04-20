package com.vk.coroutine.demo.mydatabase

import com.vk.coroutine.demo.model.LoginResponce
import com.vk.coroutine.demo.mydatabase.databasemodel.LoginResponce_db


class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getUsers(): LoginResponce_db = appDatabase.loginTableDao().getAll()
    override suspend fun insertAll(users: LoginResponce_db) = appDatabase.loginTableDao().insertAll(users)


}