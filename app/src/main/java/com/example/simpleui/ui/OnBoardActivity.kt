package com.example.simpleui.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleui.R
import com.example.simpleui.ui.OnBoardFragment
import com.example.simpleui.util.inTransaction

class OnBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)

        /**
         * Calling extension function
         */
        supportFragmentManager.inTransaction {
            add(R.id.mainFragmentContainer, OnBoardFragment())
        }
    }
}