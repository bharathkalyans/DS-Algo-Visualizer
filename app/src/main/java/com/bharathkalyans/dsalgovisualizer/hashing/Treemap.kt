package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.R
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityTreemapBinding

class Treemap : AppCompatActivity() {
    private lateinit var treemapbinding : ActivityTreemapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        treemapbinding = ActivityTreemapBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_treemap)
    }
}