package com.bharathkalyans.dsalgovisualizer.trees

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityTreeHomePageBinding

class TreeHomePage : AppCompatActivity() {

    private lateinit var tbinding: ActivityTreeHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tbinding = ActivityTreeHomePageBinding.inflate(layoutInflater)

        tbinding.cardBinaryTree.setOnClickListener {
            Intent(this, Binarytree::class.java).apply {
                startActivity(this)
            }
        }

        tbinding.cardBinarySearchTree.setOnClickListener {
            Intent(this, Binarysearchtree::class.java).apply {
                startActivity(this)
            }
        }

        setContentView(tbinding.root)
    }
}