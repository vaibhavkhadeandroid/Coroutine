package com.vk.coroutine.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.vk.coroutine.demo.mydatabase.AppDatabase
import com.vk.coroutine.demo.mydatabase.DatabaseHelperImpl
import com.vk.coroutine.demo.network.ApiHelperImpl
import com.vk.coroutine.demo.network.RetrofitBuilder
import com.vk.coroutine.demo.utils.Resource
import com.vk.coroutine.demo.utils.ViewModelFactory
import com.vk.coroutine.demo.model.LoginResponce
import com.vk.coroutine.demo.viewmodels.LoginViewModel

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    val model: LoginViewModel by viewModels {ViewModelFactory(
        ApiHelperImpl(RetrofitBuilder.apiService),
        DatabaseHelperImpl(AppDatabase.getDatabase(applicationContext)))
        

    }



    model.getLogin("hcompadmin","Pass@1234").observe(this, Observer<Resource<LoginResponce>> { loginresponce ->
        Log.e("diiw",""+ loginresponce.status)
        loginresponce.data?.also {
            Log.e("checking","datta${it.access_token}")



        }
        loginresponce.status

        // update UI
    })




    }


}






