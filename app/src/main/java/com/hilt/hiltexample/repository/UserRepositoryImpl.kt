package com.hilt.hiltexample.repository

import com.hilt.hiltexample.models.base.BaseUser
import com.hilt.hiltexample.network.APIServicesImpl
import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class UserRepositoryImpl

@Inject constructor(private var apiServicesImpl: APIServicesImpl){

    fun getUserList(): Flow<BaseUser>  = flow{

        var response = apiServicesImpl.getUserList()
        emit(response)
    }.flowOn(Dispatchers.IO)

}