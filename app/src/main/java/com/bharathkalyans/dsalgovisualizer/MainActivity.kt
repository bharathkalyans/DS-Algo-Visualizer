package com.bharathkalyans.dsalgovisualizer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityMainBinding
import com.bharathkalyans.dsalgovisualizer.hashing.HashingHomePage
import com.bharathkalyans.dsalgovisualizer.sets.SetsHomePage
import com.bharathkalyans.dsalgovisualizer.sorting.SortingHomePage
import com.bharathkalyans.dsalgovisualizer.trees.TreeHomePage

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.card1.setOnClickListener {
            Intent(this, SortingHomePage::class.java).apply {
                startActivity(this)
            }
        }

        binding.card2.setOnClickListener {
            Intent(this, SetsHomePage::class.java).apply {
                startActivity(this)
            }
        }

        binding.card3.setOnClickListener {
            Intent(this, HashingHomePage::class.java).apply {
                startActivity(this)
            }
        }

        binding.card4.setOnClickListener {
            Intent(this, TreeHomePage::class.java).apply {
                startActivity(this)
            }
        }

        setContentView(binding.root)

    }
}