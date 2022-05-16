package com.umvini.studybasickotlin.phase.twocodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.umvini.studybasickotlin.R

class TwoCodeLabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_code_lab)

        val tvNumber: TextView = findViewById(R.id.tv_number)
        val rollButton: Button = findViewById(R.id.bt_roll)

        rollButton.setOnClickListener {
            tvNumber.text = (1..6).random().toString()
        }
    }
}