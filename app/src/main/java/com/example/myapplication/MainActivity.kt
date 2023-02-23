package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var btnCal: Button

    private lateinit var builder: AlertDialog.Builder


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("Indice de masa corporal")
        val editTextA=findViewById<EditText>(R.id.editTextAltura)
        val editTextP=findViewById<EditText>(R.id.editTextPeso)
        val btnCal=findViewById<Button>(R.id.btnCalcular)

        builder = AlertDialog.Builder(this)

        btnCal.setOnClickListener {
            val al=(editTextA.text.toString().toFloat()) * (editTextA.text.toString().toFloat())
            val r= editTextP.text.toString().toInt() / al
            if (r <= 18.5){
                builder.setTitle("Clasificacion IMC")
                .setMessage("Bajo peso" + "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }else if(r > 18.5 && r <=24.9) {
                builder.setTitle("Clasificacion IMC")
                    .setMessage("Normal"+ "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }
            else if(r >= 25.0 && r <=29.9){
                builder.setTitle("Clasificacion IMC")
                    .setMessage("Sobrepeso"+ "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }
            else if(r >= 30.0 && r <=34.5){
                builder.setTitle("Clasificacion IMC")
                    .setMessage("Obesidad"+ "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }
            else if(r >= 35.0 && r <=39.9){
                builder.setTitle("Clasificacion IMC")
                    .setMessage("Obesidad grado 2"+ "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }
            else if (r >=40)
            {
                builder.setTitle("Clasificacion IMC")
                    .setMessage("Obesidad grado 3"+ "\n\n "+ r)
                    .setPositiveButton("Ok"){dialogInterface, it ->
                        dialogInterface.cancel()
                    }
                    .show()
            }
        }
}
}