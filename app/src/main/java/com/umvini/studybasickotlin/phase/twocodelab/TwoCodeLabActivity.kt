package com.umvini.studybasickotlin.phase.twocodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.umvini.studybasickotlin.R

class TwoCodeLabActivity : AppCompatActivity() {

    lateinit var tvNumber: TextView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_code_lab)

        setActionBar()
        initViews()
        initClicks()

        if(tvNumber.text == "Hello World") {
            tvNumber.text = "1"
        }
    }

    private fun setActionBar() {
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun initViews() {
        tvNumber = findViewById(R.id.tv_number)
        rollButton = findViewById(R.id.bt_roll)
    }

    private fun initClicks() {
        rollButton.setOnClickListener {
            if (tvNumber.text != "6")
                tvNumber.text = (1..6).random().toString()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}