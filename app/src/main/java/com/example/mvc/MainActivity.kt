package com.example.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        txt=findViewById(R.id.txt)

    }

    fun increment(view:View) {
        mainViewModel.increment()
        setText()
    }

    fun setText() {
        txt.text =mainViewModel.count.toString()
    }

    fun decrement(view: View) {
        mainViewModel.decrement()
        setText()
    }


}