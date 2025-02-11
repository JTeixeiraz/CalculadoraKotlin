package com.example.primeiroapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBotao: Button = findViewById(R.id.btnBotao)
        val Num1: TextInputEditText = findViewById(R.id.txtNum1) // Alterado para TextInputEditText
        val Num2: TextInputEditText = findViewById(R.id.txtNum2) // Alterado para TextInputEditText
        val Resultado: TextView = findViewById(R.id.txtResultado)

        btnBotao.setOnClickListener {
            val ValorNumero1 = Num1.text?.toString()?.toDoubleOrNull() ?: 0.0 // Removido .editText
            val ValorNumero2 = Num2.text?.toString()?.toDoubleOrNull() ?: 0.0 // Removido .editText
            val Operacao = ValorNumero1 + ValorNumero2
            Resultado.text = "Resultado: ${Operacao}"

        }

    }
}