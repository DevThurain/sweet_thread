package com.thurainx.sweetthreads.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.widget.ImageView

class TopRoundedImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : androidx.appcompat.widget.AppCompatImageView(context, attrs) {


    var cornerRadius = floatArrayOf(
        80f, 80f,   // Top left radius in px
        80f, 80f,   // Top right radius in px
        0f, 0f,     // Bottom right radius in px
        0f, 0f      // Bottom left radius in px
    )
    var path = Path()


    override fun onDraw(canvas: Canvas?) {
        val rectangle = RectF( 0f,  0f,width.toFloat(),  height.toFloat())
        path.addRoundRect(rectangle,cornerRadius,Path.Direction.CCW)

        canvas?.clipPath(path)
        super.onDraw(canvas)
    }
}