package com.example.paintgan

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.example.paintgan.MainActivity.Companion.paintBrush
import com.example.paintgan.MainActivity.Companion.path
import com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
import java.nio.file.Path

class painnttview : View{
    var params : ViewGroup.LayoutParams? = null

    companion object{
        var pathList = ArrayList<Path>()
        var colorlist = ArrayList<Int>()
        var currentBrush = Color.BLACK;
        }
    constructor(context: Context) : this(context, null){
        iniit()
    }
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0){
        iniit()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        iniit()

    }

    private fun iniit(){
        paintBrush.isAntiAlias = true
        paintBrush.color = currentBrush
        paintBrush.style= Paint.Style.STROKE
        paintBrush.strokeJoin = Paint.Join.ROUND
        paintBrush.strokeWidth = 8f

        params = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var x = event.x
        var y =event.y

        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                path.moveTo(x,y)
                return true
            }
            MotionEvent.ACTION_MOVE ->{
                path.lineTo(x,y)
                pathList.add(path)
                colorlist.add(currentBrush)
            }
            else -> return false
        }
        postInvalidate()
        return false;
    }

    override fun onDraw(canvas: Canvas) {
        for(i in pathList.indices){
            paintBrush.setColor(colorlist[i])
            canvas.drawPath(PathListener[i], paintBrush)
            invalidate()
        }
    }

}
