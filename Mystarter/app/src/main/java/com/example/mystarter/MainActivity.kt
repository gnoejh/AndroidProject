package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }
    //TODO main()
    fun main(){
        //print vs println
        print("Hello, "); print("world!")
        println("")
        println("Hello, world!!")

        //print arguments
        println(200)
        println("200")
        println(5 + 3*7 + 10/2)

        //semicolon
        println("I'm without semi-colon")
        println("I'm with semicolon");
    }
}