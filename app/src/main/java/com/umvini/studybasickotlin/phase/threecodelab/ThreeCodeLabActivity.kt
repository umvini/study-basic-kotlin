package com.umvini.studybasickotlin.phase.threecodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import com.umvini.studybasickotlin.R

class ThreeCodeLabActivity : AppCompatActivity() {

    lateinit var ivDiceImage: ImageView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_code_lab)

        setActionBar()
        initViews()
        initClicks()
    }

    private fun setActionBar() {
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.title = "Three CodeLab"
    }

    private fun initViews() {
        ivDiceImage = findViewById(R.id.iv_dice_image)
        rollButton = findViewById(R.id.bt_roll)
    }

    private fun initClicks() {
        rollButton.setOnClickListener {
            siteDiceImage()
        }
    }

    private fun siteDiceImage() {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        ivDiceImage.setImageResource(drawableResource)
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