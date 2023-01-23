package com.example.lottie_animation_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationPurpleBro = findViewById<LottieAnimationView>(R.id.purple_bro_id)

        GlobalScope.launch {
            animationPurpleBro.playAnimation()
        }

    }
}
