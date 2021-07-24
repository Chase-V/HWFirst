package com.example.hwfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var currentButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentButton = findViewById(R.id.button1)
        currentButton.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button1 ->{
                setContentView(R.layout.activity_main_two)
                currentButton = findViewById(R.id.button2)
                currentButton.setOnClickListener(this)
            } R.id.button2 ->{
                setContentView(R.layout.activity_main)
                currentButton = findViewById(R.id.button1)
                currentButton.setOnClickListener(this)
            }
        }
    }

}