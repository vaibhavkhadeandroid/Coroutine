package com.vk.coroutine.demo.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.vk.coroutine.demo.mydatabase.DatabaseHelper
import com.vk.coroutine.demo.network.ApiHelper
import com.vk.coroutine.demo.utils.Resource
import kotlinx.coroutines.Dispatchers

class LoginViewModel ( val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper): ViewModel() {

     fun getLogin(userid:String,password:String) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {

            val usersFromDb = dbHelper.getUsers()
            if (usersFromDb.access_token.equals("")) {
                var usersFromApi = apiHelper.getLogin(userid,password)


                dbHelper.insertAll(usersFromApi)
                }


         // var datta:LoginResponce = apiHelper.getLogin(userid,password)

            emit(Resource.success(data = apiHelper.getLogin(userid,password)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}


