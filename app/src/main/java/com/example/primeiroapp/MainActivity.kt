package com.example.primeiroapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.roundToInt


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

        val limpa = findViewById<Button>(R.id.btnClear)
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
        val visuresul = findViewById<TextView>(R.id.lblResultadosCalc);
        val Mais = findViewById<Button>(R.id.btnMais);
        var Menos = findViewById<Button>(R.id.btnMenos);
        var Vezes = findViewById<Button>(R.id.btnVezes);
        var Dividido = findViewById<Button>(R.id.btnDiv);
        val Igual = findViewById<Button>(R.id.btnIgual);
        var ValorAdd1 = 0.0;
        var ValorAdd2 = 0.0;
        var option = 0;
        //1 para Mais, 2 para Menos, 3 para Multiplicação, 4 para Divisao
            Menos.setOnClickListener {
                ValorAdd1 = resultado.text.toString().toDoubleOrNull() ?:0.0;
                resultado.text = "";
                visuresul.text = ValorAdd1.toString() + "-";
                option = 2;
            }

            Vezes.setOnClickListener {
                ValorAdd1 = resultado.text.toString().toDoubleOrNull()?:0.0;
                resultado.text = "";
                visuresul.text = ValorAdd1.toString() + "x";
                option = 3;
            }

            Dividido.setOnClickListener {
                ValorAdd1 = resultado.text.toString().toDoubleOrNull()?:0.0;
                resultado.text = "";
                visuresul.text = ValorAdd1.toString() + "/";
                option = 4;
            }

            Mais.setOnClickListener{
                ValorAdd1 = resultado.text.toString().toDoubleOrNull() ?:0.0;
                resultado.text = "";
                visuresul.text = ValorAdd1.toString() + "+";
                option = 1;
            }
            Igual.setOnClickListener {
                    var resultadoconta = 0.0;
                    ValorAdd2 = resultado.text.toString().toDoubleOrNull() ?:0.0;
                    when(option){
                        1 -> resultadoconta = ValorAdd1 + ValorAdd2;
                        2-> resultadoconta = ValorAdd1 - ValorAdd2;
                        3-> resultadoconta = ValorAdd1 * ValorAdd2;
                        4-> resultadoconta = ValorAdd1 / ValorAdd2;
                    }
                    visuresul.text = "";
                    resultado.text = resultadoconta.toString();
                    resultadoconta = 0.0;
            }



            numero1.setOnClickListener{
                resultado.text = resultado.text.toString() + "1";
            }
            numero2.setOnClickListener{

                resultado.text = resultado.text.toString() + "2";
            }
            numero3.setOnClickListener{

                resultado.text = resultado.text.toString() + "3";
            }
            numero4.setOnClickListener{

                resultado.text = resultado.text.toString() + "4";
            }
            numero5.setOnClickListener{

                resultado.text = resultado.text.toString() + "5";
            }
            numero6.setOnClickListener{

                resultado.text = resultado.text.toString() + "6";
            }
            numero7.setOnClickListener{

                resultado.text = resultado.text.toString() + "7";
            }
            numero8.setOnClickListener{

                resultado.text = resultado.text.toString() + "8";
            }
            numero9.setOnClickListener{

                resultado.text = resultado.text.toString() + "9";
            }
            numero0.setOnClickListener{

                resultado.text = resultado.text.toString() + "0";
            }
            limpa.setOnClickListener{
                resultado.text = "";
                visuresul.text = "";

                ValorAdd1 = 0.0;
                ValorAdd2 =0.0;
            }


    }
}