package com.example.googlemap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.googlemap.ui.lesson1.AddMapActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickAction()
    }

    private fun onClickAction() {
        findViewById<Button>(R.id.btnGMap1).setOnClickListener {
            val intent = Intent(this, AddMapActivity::class.java)
            startActivity(intent)
        }
    }
}