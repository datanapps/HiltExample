package com.hilt.hiltexample.network


import com.hilt.hiltexample.models.base.BaseUser
import retrofit2.Call
import retrofit2.http.GET

interface APIServices {

    //https://datanapps.com/DNARestAPIs/getUserLists

    @GET("getUserLists")
   suspend fun getUser() : BaseUser

}