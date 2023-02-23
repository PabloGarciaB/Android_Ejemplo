package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

var radioT: RadioGroup? = null
var btn: Button? = null


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioT = findViewById(R.id.RadioGroupT)
        btn = findViewById(R.id.btn)
        var mensaje: String =""


        radioT?.setOnCheckedChangeListener { radioGroup, i -> var radioBtn = findViewById<RadioButton>(i)
            if (radioBtn!=null){
                var textV = findViewById<TextView>(R.id.textViewTamanio)
                textV.setText(radioBtn.text.toString())
                mensaje = radioBtn.text.toString()
            }
        }
        btn?.setOnClickListener { radioT?.clearCheck()
            var textV = findViewById<TextView>(R.id.textViewTamanio)
            textV.setText("Se ha seleccionado: $mensaje")
        }


    }
}