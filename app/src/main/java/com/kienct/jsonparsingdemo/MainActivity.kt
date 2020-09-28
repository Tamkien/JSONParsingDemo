package com.kienct.jsonparsingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jsonFileString: String = Utils.getJsonFromAssets(
            applicationContext, "demo.json"
        )
        val gson = Gson()
        val listUserType = object : TypeToken<List<Post?>?>() {}.type
        val posts: List<Post> = gson.fromJson(jsonFileString, listUserType)
        val postAdapter = PostAdapter(posts)
        post_view.layoutManager = LinearLayoutManager(this)
        post_view.adapter = postAdapter
    }
}