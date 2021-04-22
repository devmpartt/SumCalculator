package com.example.sumcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View){
        val n1 = num1.text.toString()
        val n2 = num2.text.toString()

        sum.text = (n1.toInt() + n2.toInt()).toString()
    }

}