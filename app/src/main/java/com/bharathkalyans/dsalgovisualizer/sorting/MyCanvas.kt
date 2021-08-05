package com.bharathkalyans.dsalgovisualizer.sorting

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import java.util.*


//Check once on arr and progressBarLength after successful compilation!

class MyCanvas : View {

    var paint = Paint()
    var rectangle = Rect()
    var canvas: Canvas? = null
    private var progressBarLength: Int = 40
    var a = IntArray(1)
    var arr: IntArray = IntArray(progressBarLength)

    companion object {
        var k = -1
        var l = -1
    }

    constructor(context: Context?, progress: Int) : super(context) {
        progressBarLength = progress
    }

    constructor(context: Context?, progress: Int, bb_ar: IntArray) : super(context) {
        progressBarLength = progress
        a = IntArray(bb_ar.size)

        for (i in bb_ar.indices)
            a[i] = bb_ar[i]
    }

    constructor(
        context: Context?,
        progress: Int,
        bb_ar: IntArray,
        f: Int,
        s: Int
    ) : super(context) {
        progressBarLength = progress
        a = IntArray(bb_ar.size)
        for (i in bb_ar.indices) a[i] = bb_ar[i]
        k = f
        l = s
    }

    constructor(context: Context?) : super(context)

    override fun onDraw(canvas: Canvas) {

        super.onDraw(canvas)

        this.canvas = canvas
        paint.color = Color.RED
        paint.style = Paint.Style.FILL

        if (a.size == 1 && k == -1 && l == -1) {
            randomize()
            draw()
        } else if (a.size != 1 && k == -1 && l == -1) b_draw(a) else {
            change_draw(a, k, l)
            k = -1
            l = -1
        }
    }

    fun change_draw(a: IntArray, f: Int, l: Int) {
        val width = canvas!!.width / a.size
        var w = 0
        for (i in a.indices) {
            if (i == f || i == l) paint.color = Color.BLACK else paint.color =
                Color.RED
            rectangle[w, 10, w + width] = a[i] * 10
            canvas!!.drawRect(rectangle, paint)
            w = w + width + 1
        }
    }

    fun randomize() {
        arr = IntArray(canvas!!.width / progressBarLength)
//        arr = Array(canvas!!.width / progressBarLength){ it ->1}
        val rand = Random()
        for (i in arr.indices) {
            val num = rand.nextInt(canvas!!.height / 15) + 1
            arr[i] = num
        }
    }

    fun b_draw(bb_a: IntArray) {
        val width = canvas!!.width / bb_a.size
        paint.color = Color.RED
        var w = 0
        for (i in bb_a.indices) {
            rectangle[w, 10, w + width] = bb_a[i] * 10
            canvas!!.drawRect(rectangle, paint)
            w += width + 1
        }
    }

    fun draw() {
        val width = canvas!!.width / arr.size
        var w = 0
        for (i in arr.indices) {
            rectangle[w, 10, w + width] = arr[i] * 10
            canvas!!.drawRect(rectangle, paint)
            w += width + 1
        }
    }


}