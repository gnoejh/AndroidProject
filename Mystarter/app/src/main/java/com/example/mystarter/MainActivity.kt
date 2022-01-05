package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main()
        main (arrayOf("a","b","c"))

    }
    //entry point
    fun main(){
        var string: String = "Hello, world!!!"
        println("$string")
    }

    //entry point with parameters
    fun main(args: Array<String>){
        for (i in 0..2){
            println(args[i])
        }
    }
}