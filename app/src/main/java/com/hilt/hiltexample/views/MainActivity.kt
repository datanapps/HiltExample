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
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModels by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.userResponse.observe(this, Observer {
            Log.d("asd", "----------- :: "+it.userlist!!.get(0).firstName)
            setAdapterInRecycleView(it.userlist!!)
        })
    }

    fun setAdapterInRecycleView(userList: List<User>){
        rv_user_list.adapter = UserAdapter(userList, this)
    }
}