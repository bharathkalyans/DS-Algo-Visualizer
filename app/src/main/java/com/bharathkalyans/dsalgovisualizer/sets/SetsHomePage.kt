package com.bharathkalyans.dsalgovisualizer.sets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivitySetsHomePageBinding

class SetsHomePage : AppCompatActivity() {

    private lateinit var setsbinding: ActivitySetsHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setsbinding = ActivitySetsHomePageBinding.inflate(layoutInflater)

        setContentView(setsbinding.root)
    }
}