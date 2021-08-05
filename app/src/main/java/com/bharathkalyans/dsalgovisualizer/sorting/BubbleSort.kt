package com.bharathkalyans.dsalgovisualizer.sorting

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.LinearLayout
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.bharathkalyans.dsalgovisualizer.databinding.ActivityBubbleSortBinding

class BubbleSort : AppCompatActivity() {

    private lateinit var bubblesortbinding: ActivityBubbleSortBinding

    private lateinit var seekBar: SeekBar
    private lateinit var canvas: MyCanvas
    private lateinit var layout: LinearLayout

    private var temp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bubblesortbinding = ActivityBubbleSortBinding.inflate(layoutInflater)


        seekBar = bubblesortbinding.bubbleSortSeekBar
        canvas = MyCanvas(applicationContext, seekBar.progress)
        layout = bubblesortbinding.bubbleSortLinearLayout


        //Adding MyCanvas View to the Linear Layout!
        bubblesortbinding.bubbleSortLinearLayout.addView(canvas)


        //Randomizing the Values!
        bubblesortbinding.bubbleSortRandomize.setOnClickListener {
            layout.removeView(canvas)
            canvas = MyCanvas(applicationContext, seekBar.progress)
            layout.addView(canvas)
        }

        //Sorting the Values!
        bubblesortbinding.bubbleSortSorting.setOnClickListener {
            for (i in canvas.arr.indices)
                for (j in 0 until canvas.arr.size - i - 1)
                    draw(i, j)
        }



        //Seekbar Change Listener
        bubblesortbinding.bubbleSortSeekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                layout.removeView(canvas)
                if (seekBar != null) {
                    canvas = MyCanvas(applicationContext, seekBar.progress)
                }
                layout.addView(canvas)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })



        setContentView(bubblesortbinding.root)
    }



    //Explicitly attaching/passing of Main UI Thread Looper!
    //Watch Mind Orks Tutorial for Better understanding.
    private val handler = Handler(Looper.getMainLooper())

    private var mil: Long = 100

    private fun draw(i: Int, j: Int) {
        mil += 10
        val runnable = Runnable {
            if (canvas.arr[j] > canvas.arr[j + 1]) {

                layout.removeView(canvas)
                canvas = MyCanvas(applicationContext, seekBar.progress, canvas.arr, j, j + 1)
                layout.invalidate()
                layout.addView(canvas)

                temp = canvas.arr[j]
                canvas.arr[j] = canvas.arr[j + 1]
                canvas.arr[j + 1] = temp

                layout.removeView(canvas)
                canvas = MyCanvas(applicationContext, seekBar.progress, canvas.arr)
                layout.invalidate()
                layout.addView(canvas)

            } else {
                layout.removeView(canvas)
                canvas = MyCanvas(applicationContext, seekBar.progress, canvas.arr)
                layout.invalidate()
                layout.addView(canvas)
            }
        }
        handler.postDelayed(runnable, mil)
    }


}