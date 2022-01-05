package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//TODO comments

//This is a single-line comment
fun main(){
    println("Hello, world!") // This is also a single-line comment
}

/* This is a muli-line comment and it can span
 * as many as lines as you like
 */


/* This is a nested comments consisting of
 *multi-line- and single-line comments
 /* This is a nested comment */
 // Another nested comment
 */