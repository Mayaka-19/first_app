package com.example.mayaka

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


lateinit var Buttonsms:Button
lateinit var Buttoncall:Button
lateinit var Buttonemail:Button
lateinit var Buttonstk:Button
lateinit var Buttoncamera:Button
lateinit var Buttonshare:Button
lateinit var Buttondial:Button


class intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.Btn_Sms)
        Buttoncall=findViewById(R.id.Btn_Call)
        Buttonemail=findViewById(R.id.Btn_Email)
        Buttoncamera=findViewById(R.id.Btn_Camera)
        Buttonstk=findViewById(R.id.Btn_Stk)
        Buttonshare=findViewById(R.id.Btn_Share)
        Buttondial=findViewById(R.id.Btn_Dial)

        Buttonsms.setOnClickListener {
            val uri = Uri.parse("smsto:0705779938")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello World" ,"How is today's weather")

            startActivity(intent)
        }

        Buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)
        }

        Buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }

        Buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }

        Buttonstk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }

        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@intent,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@intent,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }

        Buttondial.setOnClickListener {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }


    }
}









