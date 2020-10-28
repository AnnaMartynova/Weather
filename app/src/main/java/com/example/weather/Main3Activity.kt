package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button2.setOnClickListener {
            val m_intent = Intent(this@Main3Activity, Main4Activity::class.java)
            startActivity(m_intent)
        }
        button3.setOnClickListener {
            val m_intent = Intent(this@Main3Activity, Main5Activity::class.java)
            startActivity(m_intent)
        }
    }
}
