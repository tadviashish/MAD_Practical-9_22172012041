package com.example.mad_practical_9_22172012041

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() ,AnimationListener{
    lateinit var logoanimation: AnimationDrawable
    lateinit var tweenanimation:Animation

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var logoimg: ImageView = findViewById(R.id.logo)
        logoimg.setBackgroundResource(R.drawable.logo_animation_list)
        logoanimation = logoimg.background as AnimationDrawable

        tweenanimation = AnimationUtils.loadAnimation(this,R.anim.tween_animation)
        tweenanimation.setAnimationListener(this)
        logoimg.startAnimation(tweenanimation)

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus)
        {
           logoanimation.start()

        }
        else
        {
            logoanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        //intent
        Intent(this,SplashActivity::class.java).also { startActivity(it) }
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}