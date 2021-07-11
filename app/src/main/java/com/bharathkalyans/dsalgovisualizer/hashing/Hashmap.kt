package com.bharathkalyans.dsalgovisualizer.hashing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bharathkalyans.dsalgovisualizer.R
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityHashmapBinding

class Hashmap : AppCompatActivity() {

    private lateinit var hashmapbinding : ActivityHashmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hashmapbinding = ActivityHashmapBinding.inflate(layoutInflater)

        setContentView(hashmapbinding.root)
    }
}