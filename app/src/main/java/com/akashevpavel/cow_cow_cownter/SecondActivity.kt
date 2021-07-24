package com.akashevpavel.cow_cow_cownter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mTextView = findViewById(R.id.second_textview)
        mTextView.text = intent.getStringExtra(EXTRA_COW)
    }
}