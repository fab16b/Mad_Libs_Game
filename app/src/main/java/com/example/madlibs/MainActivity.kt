package com.example.madlibs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE1 = "com.example.madlibs.MESSAGE1"
const val EXTRA_MESSAGE2 = "com.example.madlib2.MESSAGE2"
const val EXTRA_MESSAGE3 = "com.example.madlibs.MESSAGE3"
const val EXTRA_MESSAGE4 = "com.example.madlibs.MESSAGE4"
const val EXTRA_MESSAGE5 = "com.example.madlibs.MESSAGE5"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)
        val editText5 = findViewById<EditText>(R.id.editText5)

        val message1= editText1.text.toString()
        val message2 = editText2.text.toString()
        val message3 = editText3.text.toString()
        val message4 = editText4.text.toString()
        val message5 = editText5.text.toString()

        val intent1 = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE1, message1)
            putExtra(EXTRA_MESSAGE2, message2)
            putExtra(EXTRA_MESSAGE3, message3)
            putExtra(EXTRA_MESSAGE4, message4)
            putExtra(EXTRA_MESSAGE5, message5)
        }
        startActivity(intent1)

    }
}

