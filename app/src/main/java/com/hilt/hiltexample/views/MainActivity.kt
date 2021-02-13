package com.hilt.hiltexample.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.hilt.hiltexample.R
import com.hilt.hiltexample.models.User
import com.hilt.hiltexample.viewmodels.MainViewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModels by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.userResponse.observe(this, Observer {
            Log.d("asd", "----------- :: "+it.userlist!!.get(0))
        })

    }



    fun setAdapterInRecycleView(userList: List<User>){

    }
}