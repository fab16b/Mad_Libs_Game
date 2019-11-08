package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message1 = intent.getStringExtra(EXTRA_MESSAGE1)
        val message2 = intent.getStringExtra(EXTRA_MESSAGE2)
        val message3 = intent.getStringExtra(EXTRA_MESSAGE3)
        val message4 = intent.getStringExtra(EXTRA_MESSAGE4)
        val message5 = intent.getStringExtra(EXTRA_MESSAGE5)

        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.word1_view).apply {
            text = message1
        }

        findViewById<TextView>(R.id.word2_view).apply {
            text = message2
        }

        findViewById<TextView>(R.id.word3_view).apply {
            text = message3
        }
        findViewById<TextView>(R.id.word4_view).apply {
            text = message4
        }
        findViewById<TextView>(R.id.word5_view).apply {
            text = message5
        }

    }
}