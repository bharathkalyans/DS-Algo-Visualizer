package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityHashmapBinding

class Hashmap : AppCompatActivity() {

    private lateinit var hashmapbinding: ActivityHashmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hashmapbinding = ActivityHashmapBinding.inflate(layoutInflater)

        hashmapbinding.btnHashMapAdd.setOnClickListener {

        }

        val listOfValues = mutableListOf(
            KeyValuePair(12,12),
            KeyValuePair(13,14)
        )
        hashmapbinding.hashMapRecyclerView.adapter = MapAdapter(listOfValues, this)
        hashmapbinding.hashMapRecyclerView.layoutManager = LinearLayoutManager(this)

        setContentView(hashmapbinding.root)
    }
}