package com.example.calcularareacirculo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        btnCalcular.setOnClickListener {
            calcular();
        }
    }
    fun calcular(){
        val edt_raio = findViewById<EditText>(R.id.edt_raio)
        val txtArea = findViewById<TextView>(R.id.txt_area)


        val raio = edt_raio.text.toString().toFloat() * 3.14;
        txtArea.setText("O valor da área é: ${raio}")
    }
}