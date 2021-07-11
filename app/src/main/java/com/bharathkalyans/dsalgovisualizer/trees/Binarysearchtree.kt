package com.bharathkalyans.dsalgovisualizer.trees

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityBinarysearchtreeBinding

class Binarysearchtree : AppCompatActivity() {

    private lateinit var bsearchtreebinding: ActivityBinarysearchtreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        bsearchtreebinding = ActivityBinarysearchtreeBinding.inflate(layoutInflater)

        bsearchtreebinding.btnBSTAdd.setOnClickListener {

        }

        setContentView(bsearchtreebinding.root)
    }
}