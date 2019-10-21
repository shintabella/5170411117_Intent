package com.example.intentbella


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityKedua : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = intent
        val Nama = intent.getStringExtra("Nama")
        val nim  = intent.getStringExtra("Npm")
        val value = intent.getIntExtra("Jumlah smile",100)
        val ket:String

        if (value >=80){
            ket="A"
        }
        else if (value >=60){
            ket="B"
        }
        else if (value >=40){
            ket="C"
        }
        else if (value >=20){
            ket="D"
        }
        else {
            ket="E"
        }

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NPM      : " + nim+"\nNama    : " + Nama+"\nNilai      : " +value+"\nKeterangan Nilai: "+ket

    }
}