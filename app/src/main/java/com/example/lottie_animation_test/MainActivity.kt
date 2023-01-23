package com.example.lottie_animation_test

import android.animation.Animator.AnimatorListener
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
        val animationButton = findViewById<LottieAnimationView>(R.id.button_animate_id)

        GlobalScope.launch {
            animationPurpleBro.playAnimation()
        }

        animationButton.setOnClickListener {
            animationButton.speed=0.8f
            animationButton.playAnimation()
        }

    }
}
