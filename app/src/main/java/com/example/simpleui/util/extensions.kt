package com.example.simpleui.util

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

/**
 * extension function for navigate between activities
 */
inline fun <reified T : AppCompatActivity> Context.startActivity(block: Intent.() -> Unit = {}) {

    val intent = Intent(this, T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}

/**
 * extension function for navigate from activity to fragment
 */

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    val fragmentTransaction = beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
}