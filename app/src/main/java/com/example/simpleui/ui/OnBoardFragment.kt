package com.example.simpleui.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.simpleui.R
import kotlinx.android.synthetic.main.fragment_on_board.*

class OnBoardFragment : Fragment(R.layout.fragment_on_board) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * Array of Answers and question word created to send to TestScreenActivity
         */
        val answersArray: Array<String> = arrayOf("Görselleştirmek", "Altında", "Bağış", "Ensülin")
        /**
         * Calling Click Listener for navigating TestScreenActivity
         */
        start_button?.setOnClickListener {
            val intent = Intent(activity, TestScreenActivity::class.java).apply {
                putExtra("Word", "Visualize")
                putExtra("Array", answersArray)
            }
            activity?.startActivity(intent)
        }
    }

}