package com.neo.neokm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAnalytics = Firebase.analytics
        val btnEnviar = findViewById<AppCompatButton>(R.id.btnEnviar)
        val eTName = findViewById<AppCompatEditText>(R.id.eTName)
        btnEnviar.setOnClickListener {
            firebaseAnalytics.logEvent("virtualEventApp") {
                param("Zona", "Inicio")
                param("TipoEvento", "Click")
                param("TipoElemento", "Botón")
                param("Valor", btnEnviar.text.toString())
            }
            if(eTName.text.toString().isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", eTName.text.toString())
                startActivity(intent)
            }
        }
    }
}