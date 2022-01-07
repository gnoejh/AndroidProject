package com.example.mainviewmodel.ui.main

import androidx.lifecycle.ViewModel
//TODO 10
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // TODO 2
    private val rate = 0.8f
    private var dollarText = ""
    //TODO 11
//    private var result: Float = 0f
    private var result: MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String){
        this.dollarText = value
        //TODO 12
//        result = value.toFloat() * rate
        result.setValue(value.toFloat() * rate)
    }

    //TODO 13
//    fun getResult (): Float {
    fun getResult(): MutableLiveData<Float>{
        return result
    }
}