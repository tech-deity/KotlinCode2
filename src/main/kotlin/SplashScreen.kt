package com.example.firstappnov

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

const val EXTRA_MESSAGE = "com.example.myfirstappnov.MESSAGE"

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()
        val message = "NETFlix"
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this,MainActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE,message)
                        }
                startActivity(i)
                finish() } , 3000)

    }
}