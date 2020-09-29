package com.kienct.jsonparsingdemo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class X(
    @SerializedName("menu")
    @Expose
    var data: Data?
)