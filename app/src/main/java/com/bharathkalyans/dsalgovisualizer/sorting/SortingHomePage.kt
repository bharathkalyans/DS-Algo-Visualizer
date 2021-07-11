package com.bharathkalyans.dsalgovisualizer.sorting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivitySortingHomePageBinding

class SortingHomePage : AppCompatActivity() {

    private lateinit var sbinding: ActivitySortingHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sbinding = ActivitySortingHomePageBinding.inflate(layoutInflater)

        sbinding.cardBubbleSort.setOnClickListener {
            Intent(this, BubbleSort::class.java).apply {
                startActivity(this)
            }
        }

        sbinding.cardInsertionSort.setOnClickListener {
            Intent(this, InsertionSort::class.java).apply {
                startActivity(this)
            }
        }

        sbinding.cardMergeSort.setOnClickListener {
            Intent(this, MergeSort::class.java).apply {
                startActivity(this)
            }
        }

        sbinding.cardQuickSort.setOnClickListener {
            Intent(this, QuickSort::class.java).apply {
                startActivity(this)
            }
        }


        sbinding.cardSelectionSort.setOnClickListener {
            Intent(this, SelectionSort::class.java).apply {
                startActivity(this)
            }
        }

        setContentView(sbinding.root)

    }
}