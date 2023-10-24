package com.neo.neokm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tVResult = findViewById<TextView>(R.id.tVResult)
        val name : String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tVResult.text = "¡Bienvenido ${name}!"
    }
}