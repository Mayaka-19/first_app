package com.example.mayaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class assignment : AppCompatActivity() {
    var ButtonNext:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment)
        ButtonNext=findViewById(R.id.Btn_Nxt)

        ButtonNext!!.setOnClickListener {
            val assign= Intent(this,image::class.java)
            startActivity(assign)
        }
    }
}