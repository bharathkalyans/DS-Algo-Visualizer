package com.bharathkalyans.dsalgovisualizer.hashing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityHashingHomePageBinding

class HashingHomePage : AppCompatActivity() {

    private lateinit var hbinding: ActivityHashingHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hbinding = ActivityHashingHomePageBinding.inflate(layoutInflater)

        hbinding.cardHashMap.setOnClickListener {
            Intent(this, Hashmap::class.java).apply {
                startActivity(this)
            }
        }

        hbinding.cardTreeMap.setOnClickListener {
            Intent(this, Treemap::class.java).apply {
                startActivity(this)
            }
        }
        setContentView(hbinding.root)
    }
}