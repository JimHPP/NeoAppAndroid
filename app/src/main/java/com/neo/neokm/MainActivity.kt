package com.neo.neokm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnEnviar = findViewById<AppCompatButton>(R.id.btnEnviar)
        val eTName = findViewById<AppCompatEditText>(R.id.eTName)
        btnEnviar.setOnClickListener {
            if(eTName.text.toString().isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", eTName.text.toString())
                startActivity(intent)
            }
        }
    }
}