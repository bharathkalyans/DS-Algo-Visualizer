package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityTreemapBinding
import java.util.*

class Treemap : AppCompatActivity() {

    private lateinit var treemapbinding: ActivityTreemapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        treemapbinding = ActivityTreemapBinding.inflate(layoutInflater)

        val adapter = MapAdapter()
        treemapbinding.treeMapRecyclerView.adapter = adapter
        treemapbinding.treeMapRecyclerView.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        val map = TreeMap<Int, Int>()

        treemapbinding.btnTreeMapAdd.setOnClickListener {

            val key = treemapbinding.etTreeMapKey.text.toString()
            val value = treemapbinding.etTreeMapValue.text.toString()
            val listOfValues = mutableListOf<KeyValuePair>()

            if (key == "" || value == "") {
                Toast.makeText(applicationContext, "Please Fill all Fields 😇", Toast.LENGTH_SHORT)
                    .show()
            } else {
                map[key.toInt()] = value.toInt()

                for (m in map) {
                    val pair = KeyValuePair(m.key, m.value)
                    if (!listOfValues.contains(pair))
                        listOfValues.add(pair)
                }

                Log.d("TREEMAP", map.toString())

                adapter.updateData(listOfValues)
            }

        }

        setContentView(treemapbinding.root)
    }
}