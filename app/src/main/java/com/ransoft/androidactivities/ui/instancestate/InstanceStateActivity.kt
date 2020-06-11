// ref: https://www.youtube.com/watch?v=TcTgbVudLyQ

package com.ransoft.androidactivities.ui.instancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ransoft.androidactivities.R

class InstanceStateActivity : AppCompatActivity() {
    lateinit var btnDecrement: Button
    lateinit var btnIncrement: Button
    lateinit var tvCount: TextView

    var currentScore: Int = 0
    var currentLevel: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instance_state)

        btnDecrement = findViewById(R.id.btn_decrement)
        btnIncrement = findViewById(R.id.btn_increment)
        tvCount = findViewById(R.id.tv_count)

        tvCount.text = "currentScore = ${currentScore} ,currentLevel = ${currentLevel}"

        btnDecrement.setOnClickListener {
            currentScore--
            currentLevel--
            tvCount.text = "Score = ${currentScore} , Level = ${currentLevel}"
        }

        btnIncrement.setOnClickListener {
            currentScore++
            currentLevel++
            tvCount.text = "Score = ${currentScore} , Level = ${currentLevel}"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // save the current state
        outState?.run {
            putInt(STATE_SCORE, currentScore)
            putInt(STATE_LEVEL, currentLevel)
        }

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState)

        // Restore state members from saved instance
        savedInstanceState?.run {
            currentScore = getInt(STATE_SCORE)
            currentLevel = getInt(STATE_LEVEL)
        }
        tvCount.text = "Score = ${currentScore} , Level = ${currentLevel}"
    }

    companion object {
        val STATE_SCORE = "playerScore"
        val STATE_LEVEL = "playerLevel"
    }
}
