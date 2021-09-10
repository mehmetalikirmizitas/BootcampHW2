package com.example.simpleui.ui

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleui.R
import com.example.simpleui.util.startActivity
import kotlinx.android.synthetic.main.activity_test_screen.*

class TestScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_screen)

        /**
         * initializes the question word from the other page to ui
         */
        val headerWord = intent.getStringExtra("Word")
        header_word.text = headerWord
        initViews()
    }

    private fun initViews() {

        /**
         * initializes the answers array from the other page to ui by id
         */
        card_view_top_left_text.text = intent.getStringArrayExtra("Array")?.get(0)
        card_view_top_right_text.text = intent.getStringArrayExtra("Array")?.get(1)
        card_view_bottom_left_text.text = intent.getStringArrayExtra("Array")?.get(2)
        card_view_bottom_right_text.text = intent.getStringArrayExtra("Array")?.get(3)

        /**
         * Updating progress Status by time
         */
        var progressStatus = 0
        val handler = Handler()

        progressBar.progress = 0

        /**
         * set maximum range of progress
         * type: millisecond 20 * 100 = 2000
         */
        progressBar.max = 2000

        /**
         * loop for progress status update every 10 millisecond
         */
        Thread {
            while (progressStatus < 2000) {
                progressStatus += 1
                Thread.sleep(10)
                handler.post {
                    progressBar.progress = progressStatus
                    progress_circular_text_view.text = "${20 - (progressStatus / 100)}"
                }
            }
        }.start()

        close_img_button.setOnClickListener {
            startActivity<OnBoardActivity> {}
            finish()
        }
    }
}