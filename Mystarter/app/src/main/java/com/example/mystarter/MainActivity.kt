package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.mystarter.databinding.ActivityMainBinding
//TODO 1
import android.view.GestureDetector
import android.view.GestureDetector.OnDoubleTapListener
//TODO 2
import android.view.MotionEvent
//TODO 5
import androidx.core.view.GestureDetectorCompat
//TODO 3
class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, OnDoubleTapListener {

    private lateinit var binding: ActivityMainBinding
    //TODO 6
    var gDetector: GestureDetectorCompat? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO 7
        this.gDetector = GestureDetectorCompat(this, this)
        //TODO 8
        gDetector?.setOnDoubleTapListener(this)
    }
    //TODO 4 Alt+Shift+Enter
    override fun onDown(p0: MotionEvent?): Boolean {
        binding.textView.text = "onDown"
        return true                                         //The event has been consumed by the method and
    }                                                       //does not need to be passed to the next event handler in the stack.

    override fun onShowPress(p0: MotionEvent?) {
        binding.textView.text = "onShowPress"
//        return true
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        binding.textView.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        binding.textView.text = "onScroll"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        binding.textView.text = "onLongPress"
//        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        binding.textView.text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        binding.textView.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        binding.textView.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        binding.textView.text = "onDoubleTapEvent"
        return true
    }
    //TODO 9
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}