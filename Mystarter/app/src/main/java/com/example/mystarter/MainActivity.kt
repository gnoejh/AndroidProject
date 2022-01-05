package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    fun main(){
        //variables
        val age = 19            //non-mutable variable
        var name = "Hong Jeong"     //mutable variable

        //variable reference
        println(name)
        println(age)

        println("Name = $name")
        println("Age = $age")

        //mutable and non-mutable variables
//        age = 20
        name = "Jeong Hong"

        //Explicit variable types
        val ages: Int = 22
        var names: String = "HJ"
    }
}

//Kotlin variables
/* Kotlin variables are created using either var or val keywords and then
 * an equal sign = is used to assign a value to those created variables.
 */
/*
1. Kotlin variable names can contain letters, digits, underscores, and dollar signs.

2. Kotlin variable names should start with a letter, $ or underscores

3. Kotlin variables are case sensitive which means Zara and ZARA are two different variables.

4. Kotlin variable can not have any white space or other control characters.

5. Kotlin variable can not have names like var, val, String, Int because they are reserved keywords in Kotlin.
 */