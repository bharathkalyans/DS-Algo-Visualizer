package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityHashmapBinding

class Hashmap : AppCompatActivity() {

    private lateinit var hashmapbinding: ActivityHashmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hashmapbinding = ActivityHashmapBinding.inflate(layoutInflater)

        hashmapbinding.btnHashMapAdd.setOnClickListener {

        }

        setContentView(hashmapbinding.root)
    }
}