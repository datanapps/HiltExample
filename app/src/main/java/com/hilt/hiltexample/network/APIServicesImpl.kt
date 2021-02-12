package com.hilt.hiltexample.network

import com.hilt.hiltexample.models.base.BaseUser
import javax.inject.Inject

class APIServicesImpl
    @Inject constructor(private val apiServices: APIServices) {

    suspend fun getUserList(): BaseUser = apiServices.getUser()

}