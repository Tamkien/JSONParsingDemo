package com.kienct.jsonparsingdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.item_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_main)
        val jsonFileString: String = Utils.getJsonFromAssets(
            this, "data.json"
        )
        val gson = Gson()
        val x: X = gson.fromJson(jsonFileString, X::class.java)
        tvHeader.text = x.data?.header ?: "abc"
        val items = x.data?.item
        if (items != null) {
            Log.d("Size", items.size.toString())
        } else Log.d("Size", "Null list")
        val itemAdapter = ItemAdapter(items ?: listOf())
        itemViewer.layoutManager = GridLayoutManager(this, 2)
        itemViewer.adapter = itemAdapter
    }
}
