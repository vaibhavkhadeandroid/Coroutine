package com.vk.coroutine.demo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class LoginResponce(


    val access_token: String,
  val error_description: String,
    val expires_in: Int,
    val refresh_token: String,
   val token_type: String
){}