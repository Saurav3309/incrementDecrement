package com.example.mvc

import androidx.lifecycle.ViewModel


class MainViewModel(var initial: Int) : ViewModel() {
    var count: Int = initial

    fun increment() {
        count++
    }
    fun decrement(){
        count--
    }
}