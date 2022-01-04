package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button2 callback
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            //long version
            val toast = Toast.makeText(applicationContext,"Hello Toast!",Toast.LENGTH_LONG)
            toast.show()

            //sleep
            sleep(5000)

            //short version
            Toast.makeText(applicationContext,"Hello Toast 2!",Toast.LENGTH_LONG).show()
        }
    }

    //part of activity, diable the above button.setOnClickListner
    fun onClickButton(v:View){
        Toast.makeText(applicationContext,"Hello Toast 3",Toast.LENGTH_LONG).show()
    }
}