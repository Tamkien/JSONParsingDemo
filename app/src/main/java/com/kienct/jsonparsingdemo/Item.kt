package com.kienct.jsonparsingdemo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item(
    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("label")
    @Expose
    var label: String?
)