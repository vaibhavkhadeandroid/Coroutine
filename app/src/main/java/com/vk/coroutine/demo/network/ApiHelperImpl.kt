package com.vk.coroutine.demo.network

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getLogin(userid: String, password: String)=apiService.getLogin("password",userid,password)
}