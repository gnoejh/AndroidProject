package com.example.mystarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //part of activity, diable the above button.setOnClickListner
    fun onClickButton(v:View){

        var edit_text:EditText = findViewById(R.id.editText)
        var text_view:TextView = findViewById(R.id.textView)
        if (edit_text.text.isNotEmpty()){
            val dollarValue = edit_text.text.toString().toFloat()
            val euroValue = dollarValue * 0.85f
            text_view.text = euroValue.toString()
        }
        else {
            text_view.text = "No value"
        }



    }
}

<!-- TODO use findViewById  -->