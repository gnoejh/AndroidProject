package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.mystarter.databinding.ActivityMainBinding    //2 notice the name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //method 1
        binding.button.setOnClickListener {
            binding.textView.text = "Hello, world!"
        }
    }

    //method 2
    fun sayHello(v: View){
        binding.textView.text = "Hello, world!!"
    }
}