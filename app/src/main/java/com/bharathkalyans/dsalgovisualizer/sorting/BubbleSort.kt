package com.bharathkalyans.dsalgovisualizer.sorting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityBubbleSortBinding

class BubbleSort : AppCompatActivity() {

    private lateinit var bubblesortbinding: ActivityBubbleSortBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bubblesortbinding = ActivityBubbleSortBinding.inflate(layoutInflater)

        setContentView(bubblesortbinding.root)
    }
}