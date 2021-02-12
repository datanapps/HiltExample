package com.hilt.hiltexample.models.base

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import com.hilt.hiltexample.models.User


class BaseUser {
    @SerializedName("userlist")
    @Expose
    var userlist: List<User>? = null

    @SerializedName("totalrecords")
    @Expose
    var totalrecords: Int? = null

    @SerializedName("message")
    @Expose
    var message: String? = null
}