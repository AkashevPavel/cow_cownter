package com.akashevpavel.cow_cow_cownter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


const val EXTRA_COW = "moo-moo"

class MainActivity : AppCompatActivity() {

    private lateinit var mCounter: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCounter = findViewById(R.id.counter)
    }

    fun incrementCow(view: View) {
        count++
        mCounter.text = count.toString()
    }
    fun showTotal(view: View) {
        startActivity(Intent(applicationContext, SecondActivity::class.java).putExtra(EXTRA_COW, mCounter.text.toString()))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("cow", count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("cow")
        mCounter.text = count.toString()


    }
}