package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityTreemapBinding

class Treemap : AppCompatActivity() {

    private lateinit var treemapbinding: ActivityTreemapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        treemapbinding = ActivityTreemapBinding.inflate(layoutInflater)

        val listOfValues = mutableListOf(
            KeyValuePair(12, 12),
            KeyValuePair(13, 14)
        )

        treemapbinding.treeMapRecyclerView.adapter = MapAdapter(listOfValues, this)
        treemapbinding.treeMapRecyclerView.layoutManager = LinearLayoutManager(this)

        treemapbinding.btnTreeMapAdd.setOnClickListener {

        }

        setContentView(treemapbinding.root)
    }
}