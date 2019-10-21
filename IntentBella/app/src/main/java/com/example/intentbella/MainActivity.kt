  package com.example.intentbella

  import android.content.Intent
  import androidx.appcompat.app.AppCompatActivity
  import android.os.Bundle
  import android.widget.Button
  import android.widget.EditText
  import kotlinx.android.synthetic.main.activity_main.*

  class MainActivity : AppCompatActivity() {

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

          val Nama  = findViewById<EditText>(R.id.Nama)
          val nim   = findViewById<EditText>(R.id.nim)
          val nilai =findViewById<EditText>(R.id.nilai)


          val save=findViewById<Button>(R.id.btn_back)

          save.setOnClickListener {
              val name  = Nama.text.toString()
              val nim    = nim.text.toString()
              val value : Int = Integer.parseInt(nilai.text.toString())




              val intent =  Intent(this@MainActivity, ActivityKedua::class.java)
              intent.putExtra("Nama", name)
              intent.putExtra("Npm", nim)
              intent.putExtra("Nilai", value)
              startActivity(intent)

          }
      }
  }

