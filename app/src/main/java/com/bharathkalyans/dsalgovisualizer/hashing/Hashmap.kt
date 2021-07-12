package com.bharathkalyans.dsalgovisualizer.hashing

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityHashmapBinding
import java.util.*

class Hashmap : AppCompatActivity() {

    private lateinit var hashmapbinding: ActivityHashmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hashmapbinding = ActivityHashmapBinding.inflate(layoutInflater)

        val map = HashMap<Int, Int>()

        hashmapbinding.btnHashMapAdd.setOnClickListener {


            val key = hashmapbinding.etHashMapKey.text.toString()
            val value = hashmapbinding.etHashMapName.text.toString()
            val listOfValues = mutableListOf<KeyValuePair>()


            val adapter = MapAdapter()
            hashmapbinding.hashMapRecyclerView.adapter = adapter
            hashmapbinding.hashMapRecyclerView.layoutManager =
                LinearLayoutManager(this, RecyclerView.VERTICAL, false)


            if (key == "" || value == "") {
                Toast.makeText(applicationContext, "Null Key / Null Value", Toast.LENGTH_SHORT)
                    .show()
            } else {
                map[key.toInt()] = value.toInt()

                for (m in map) {
                    if (!listOfValues.contains(KeyValuePair(m.key, m.value)))
                        listOfValues.add(KeyValuePair(m.key, m.value))
                }
                adapter.updateData(listOfValues)
            }
        }
        setContentView(hashmapbinding.root)
    }
}