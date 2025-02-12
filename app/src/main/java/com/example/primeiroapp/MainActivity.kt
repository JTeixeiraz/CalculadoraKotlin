package com.example.primeiroapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


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
        val numero1 = findViewById<Button>(R.id.btn1);
        val numero2 = findViewById<Button>(R.id.btn2);
        val numero3 = findViewById<Button>(R.id.btn3);
        val numero4 = findViewById<Button>(R.id.btn4);
        val numero5 = findViewById<Button>(R.id.btn5);
        val numero6 = findViewById<Button>(R.id.btn6);
        val numero7 = findViewById<Button>(R.id.btn7);
        val numero8 = findViewById<Button>(R.id.btn8);
        val numero9 = findViewById<Button>(R.id.btn9);
        val numero0 = findViewById<Button>(R.id.btn0);
        val resultado = findViewById<TextView>(R.id.txtResult);

        numero1.setOnClickListener{
           resultado.text = resultado.text.toString() + "1";
        }

    }
}