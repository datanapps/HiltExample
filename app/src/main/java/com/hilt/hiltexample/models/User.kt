package com.hilt.hiltexample.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User {
    @SerializedName("id")
    @Expose
    private var id: String?= null

    @SerializedName("FirstName")
    @Expose
    private var firstName: String?= null
    @SerializedName("LastName")
    @Expose
    private var lastName: String?= null
    @SerializedName("Email")
    @Expose
    private var email: String?= null
    @SerializedName("ContactNo")
    @Expose
    private var contactNo: String?= null
    @SerializedName("DOB")
    @Expose
    private var dOB: String?= null
    @SerializedName("Image")
    @Expose
    private var image: String?= null


}