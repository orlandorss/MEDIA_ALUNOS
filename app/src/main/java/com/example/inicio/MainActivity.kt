package com.example.inicio

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalculate = button
        val result = result

        btCalculate.setOnClickListener(){
            val  nota1 = Integer.parseInt(nota1.text.toString())
            val  nota2 = Integer.parseInt(nota2.text.toString())
            val  media = (nota1 + nota2)/2
            val  faults = Integer.parseInt(faltas.text.toString())

            if(media>=6 && faults <= 10 ){
                result.setText("Aluno foi Aprovado! "+ "\n" + "Média Final: "+media + "\n" + "Faltas: "+faults)
                result.setTextColor(Color.GREEN)
            }else{
                result.setText("Aluno foi Reprovado! "+ "\n" + "Média Final: "+media + "\n" + "Faltas: "+faults)
                result.setTextColor(Color.RED)

            }
        }
    }
}
