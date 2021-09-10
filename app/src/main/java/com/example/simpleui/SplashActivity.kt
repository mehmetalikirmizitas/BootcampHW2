package com.example.simpleui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleui.ui.OnBoardActivity
import com.example.simpleui.util.startActivity
import java.util.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /**
         * Start onboard screen after 3 seconds
         */
        Timer().schedule(object : TimerTask() {
            override fun run() {

                startActivity<OnBoardActivity> {
                }
            }
        }, 3000)
    }
}