package com.crystals.mvvmplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.crystals.mvvmplayground.fragment.HomeFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager
        fragmentTransaction.beginTransaction()
            .replace(R.id.fl_container, HomeFragment())
            .commit()

    }
}
