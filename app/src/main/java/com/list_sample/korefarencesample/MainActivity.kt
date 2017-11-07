package com.list_sample.korefarencesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doSomething()
    }

    private fun doSomething() {
        val pref = MyPreferences(this)

        pref.name = "akuji31"
        pref.age = 28

        Log.d(TAG, "name is ${pref.name}")
        Log.d(TAG, "age is ${pref.age}")
    }
}
