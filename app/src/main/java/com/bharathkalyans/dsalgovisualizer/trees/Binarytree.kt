package com.bharathkalyans.dsalgovisualizer.trees

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityBinarytreeBinding

class Binarytree : AppCompatActivity() {

    private lateinit var btreebinding: ActivityBinarytreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btreebinding = ActivityBinarytreeBinding.inflate(layoutInflater)

        btreebinding.btnBTAdd.setOnClickListener {

        }

        setContentView(btreebinding.root)

    }
}