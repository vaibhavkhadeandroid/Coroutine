package com.vk.coroutine.demo.viewmodels

import androidx.annotation.WorkerThread
import com.vk.coroutine.demo.mydatabase.dao.LoginTableDao
class LoginRepository(private val wordDao: LoginTableDao) {

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: LoginResponce) {
        wordDao.insertAll(word)
    }
}