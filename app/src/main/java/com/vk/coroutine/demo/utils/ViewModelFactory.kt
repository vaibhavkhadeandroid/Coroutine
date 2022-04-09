package com.vk.coroutine.demo.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vk.coroutine.demo.mydatabase.DatabaseHelper
import com.vk.coroutine.demo.network.ApiHelper
import com.vk.coroutine.demo.viewmodels.LoginViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(apiHelper,dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}