package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*  //for synthetic properties

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHello(v: View){
//        var textview: TextView = findViewById(R.id.textView)
        textView.text = "Hello, world!"  //use view object directly
    }
}