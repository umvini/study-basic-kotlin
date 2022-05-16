package com.umvini.studybasickotlin.phase.twocodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.umvini.studybasickotlin.R

class TwoCodeLabActivity : AppCompatActivity() {

    lateinit var tvNumber: TextView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_code_lab)

        initViews()
        initClicks()
    }

    private fun initViews() {
        tvNumber = findViewById(R.id.tv_number)
        rollButton = findViewById(R.id.bt_roll)
    }

    private fun initClicks() {
        rollButton.setOnClickListener {
            tvNumber.text = (1..6).random().toString()
        }
    }
}