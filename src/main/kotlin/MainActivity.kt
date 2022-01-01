package com.example.firstappnov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        textView.text = message
        password_rgt.setOnTouchListener(View.OnTouchListener
        { view, event ->
            
        })
    }
}