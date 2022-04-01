package com.anye.lossaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        var btnSalir= findViewById<Button>(R.id.salir)
        btnSalir.setOnClickListener{onClicka()}
    }
    private fun onClicka() {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}