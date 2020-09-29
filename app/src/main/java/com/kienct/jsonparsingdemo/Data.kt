package com.kienct.jsonparsingdemo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("header")
    @Expose
    var header: String?,

    @SerializedName("items")
    @Expose
    var item: List<Item>?
)