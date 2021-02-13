package com.hilt.hiltexample.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hilt.hiltexample.models.base.BaseUser
import com.hilt.hiltexample.repository.UserRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.catch
import javax.inject.Inject


@HiltViewModel
class MainViewModels

@Inject constructor(userRepositoryImpl: UserRepositoryImpl):ViewModel(){

    var userResponse : LiveData<BaseUser> = userRepositoryImpl.getUserList()
        .catch { exception-> Log.d("asd", "Exception ${exception.message}") }
        .asLiveData()





}

