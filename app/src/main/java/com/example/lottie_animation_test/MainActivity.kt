package com.example.lottie_animation_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationPurpleBro = findViewById<LottieAnimationView>(R.id.purple_bro_id)

        Handler(Looper.getMainLooper()).postDelayed({
            animationPurpleBro.playAnimation()
        }, 2000)
    }
}