package com.vk.coroutine.demo.mydatabase.databasemodel

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
@Entity
class LoginResponce_db(

    @PrimaryKey(autoGenerate = true) val id: Int=0  ,
    @ColumnInfo(name = "access_token") val access_token: String,
   ){

}