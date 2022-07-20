package com.example.mayaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc:Button ?=null
    var ButtonIntent:Button ?=null
    var ButtonWeb:Button ?=null
    var ButtonAssignment:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.calculator)
        ButtonIntent=findViewById(R.id.intent)
        ButtonWeb=findViewById(R.id.web)
        ButtonAssignment=findViewById(R.id.assign)


        ButtonCalc!!.setOnClickListener {
            val intent=Intent(this,calculator::class.java)
            startActivity(intent)
        }
        ButtonIntent!!.setOnClickListener {
            val maya=Intent(this,com.example.mayaka.intent::class.java)
            startActivity(maya)
        }
        ButtonAssignment!!.setOnClickListener {
            val assign=Intent(this,assignment::class.java)
            startActivity(assign)
        }
        ButtonWeb!!.setOnClickListener {
            val web=Intent(this,web::class.java)
            startActivity(web)
        }
    }
}