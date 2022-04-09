package com.vk.coroutine.demo.network

import com.vk.coroutine.demo.viewmodels.LoginResponce

interface ApiHelper {
    suspend fun getLogin(userid:String,password:String): LoginResponce
  //  suspend fun getLogin(userid:String,password:String) = apiService.getLogin("password",userid,password)
}