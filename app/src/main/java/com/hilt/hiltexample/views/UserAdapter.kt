package com.hilt.hiltexample.views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hilt.hiltexample.R
import com.hilt.hiltexample.models.User


class UserAdapter (val userList:List<User>, val context: Context): RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        return UserViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_user, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = userList.size



}

class UserViewHolder(view:View): RecyclerView.ViewHolder(view){

}