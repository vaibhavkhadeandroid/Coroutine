package com.vk.coroutine.demo.network

import com.vk.coroutine.demo.model.LoginResponce
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ApiService {



    @FormUrlEncoded
    @POST("token")
  suspend  fun getLogin(@Field("grant_type") grant_type: String,@Field("Userid") userid: String,@Field("Password") password: String): LoginResponce




}