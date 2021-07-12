package com.bharathkalyans.dsalgovisualizer.sets

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivitySetsHomePageBinding
import java.util.*

class SetsHomePage : AppCompatActivity() {

    private lateinit var setsbinding: ActivitySetsHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setsbinding = ActivitySetsHomePageBinding.inflate(layoutInflater)

        val hashSet: HashSet<Int> = HashSet<Int>()
        val treeSet: TreeSet<Int> = TreeSet<Int>()

        val hashStringBuilder: StringBuilder = StringBuilder()
        val treeStringBuilder: StringBuilder = StringBuilder()


        setsbinding.btnAddIntoSets.setOnClickListener {

            val value = setsbinding.etSetsValue.text.toString()

            if (value == "") {
                Toast.makeText(this, "Please Fill out all Fields 😇", Toast.LENGTH_SHORT).show()
            } else {
                if (hashSet.contains(value.toInt())) {
                    Toast.makeText(this, "Duplicates not Allowed! 🙁", Toast.LENGTH_SHORT).show()
                } else {

                    //HashSet
                    if (hashSet.size != 0 && hashSet.size > 7) {
                        hashStringBuilder.append("\n")
                    }
                    hashSet.add(value.toInt())
                    hashStringBuilder.clear()
                    hashStringBuilder.append(hashSet.toString())

                    setsbinding.tvCardHashSet.text = hashStringBuilder.toString()

                    //TreeSet
                    if (treeSet.size != 0 && treeSet.size > 7) {
                        treeStringBuilder.append("")
                    }
                    treeSet.add(value.toInt())
                    treeStringBuilder.clear()
                    treeStringBuilder.append(treeSet.toString())

                    setsbinding.tvCardTreeSet.text = treeStringBuilder.toString()
                }
            }


        }

        setContentView(setsbinding.root)
    }
}