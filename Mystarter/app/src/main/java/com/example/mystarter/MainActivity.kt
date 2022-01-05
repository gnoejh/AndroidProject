package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.mystarter.databinding.ActivityMainBinding    //2 notice the name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding           //3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)   //4

//        setContentView(R.layout.activity_main)
        setContentView(binding.root)                            //5


    }

    fun sayHello(v: View){
//        var textview: TextView = findViewById(R.id.textView)
//        textView.text = "Hello, world!"  //use view object directly
        binding.textView.text = "Hello, world!"                 //6
    }
}