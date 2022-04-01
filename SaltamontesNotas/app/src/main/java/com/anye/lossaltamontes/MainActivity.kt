package com.anye.lossaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val duracion: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoS =findViewById<ImageView>(R.id.Logo)

        cambiarActivityS()
    }
    private fun cambiarActivityS(){
        Handler().postDelayed(Runnable {
            startActivity(Intent(this,MenuActivity::class.java))
        },duracion)
    }

}