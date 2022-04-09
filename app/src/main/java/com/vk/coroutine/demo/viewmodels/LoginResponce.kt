package com.vk.coroutine.demo.viewmodels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
@Entity

data class LoginResponce(


    @PrimaryKey(autoGenerate = true) val id: Int=0,
    @ColumnInfo(name = "access_token") val access_token: String,
    @Ignore @ColumnInfo(name = "error_description")val error_description: String,
    @Ignore @ColumnInfo(name = "expires_in")val expires_in: Int,
    @Ignore @ColumnInfo(name = "refresh_token")val refresh_token: String,
    @ColumnInfo(name = "token_type")val token_type: String
)