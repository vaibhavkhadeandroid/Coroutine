package com.vk.coroutine.demo.network

import com.vk.coroutine.demo.model.LoginResponce

interface ApiHelper {
    suspend fun getLogin(userid:String,password:String): LoginResponce
  //  suspend fun getLogin(userid:String,password:String) = apiService.getLogin("password",userid,password)
}