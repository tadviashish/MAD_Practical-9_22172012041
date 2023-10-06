package com.example.mad_practical_9_22172012041

import android.app.AlarmManager
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var img:ImageView = findViewById(R.id.alarimg)
        img.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = img.background as AnimationDrawable
}

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus)
        {
            alarmanimation.start()
        }
        else
        {
            alarmanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}