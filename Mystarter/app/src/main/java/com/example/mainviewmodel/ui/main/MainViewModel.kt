package com.example.mainviewmodel.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO 2
    private val rate = 0.8f
    private var dollarText = ""
    private var result: Float = 0f

    fun setAmount(value: String){
        this.dollarText = value
        result = value.toFloat() * rate
    }

    fun getResult (): Float {
        return result
    }
}