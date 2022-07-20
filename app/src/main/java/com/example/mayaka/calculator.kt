package com.example.mayaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator : AppCompatActivity() {
    lateinit var ButtonAdd:Button
    lateinit var ButtonSubtract:Button
    lateinit var ButtonMultiply:Button
    lateinit var ButtonDivide:Button
    lateinit var Edt_Num:EditText
    lateinit var Edt_2Num:EditText
    lateinit var Txt_Ans:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        ButtonAdd=findViewById(R.id.Btn_Add)
        ButtonSubtract=findViewById(R.id.Btn_Sub)
        ButtonDivide=findViewById(R.id.Btn_Div)
        ButtonMultiply=findViewById(R.id.Btn_Mult)
        Edt_Num=findViewById(R.id.Edt_Num)
        Edt_2Num=findViewById(R.id.sec_num)
        Txt_Ans=findViewById(R.id.textView)

        ButtonAdd.setOnClickListener {
            var firstnumber=Edt_Num.text.toString()
            var secnumumber=Edt_2Num.text.toString()

            if (firstnumber.isEmpty() && secnumumber.isEmpty()){
                Txt_Ans.text="Please fill in all fields "
            }else{
                var ans=firstnumber.toDouble() + secnumumber.toDouble()
                Txt_Ans.text=ans.toString()
            }
        }

        ButtonSubtract.setOnClickListener {
            var firstnumber=Edt_Num.text.toString()
            var secnumber=Edt_2Num.text.toString()

            if (firstnumber.isEmpty() && secnumber.isEmpty()){
                Txt_Ans.text="Please fill in all fields "
            }else{
                var ans=firstnumber.toDouble() - secnumber.toDouble()
                Txt_Ans.text=ans.toString()
            }
        }

        ButtonDivide.setOnClickListener {
            var firstnumber=Edt_Num.text.toString()
            var secnumber=Edt_2Num.text.toString()

            if (firstnumber.isEmpty() && secnumber.isEmpty()){
                Txt_Ans.text="Please fill in all fields"
            }else{
                var ans=firstnumber.toDouble() / secnumber.toDouble()
                Txt_Ans.text=ans.toString()
            }
        }

        ButtonMultiply.setOnClickListener {
            var firstnumber=Edt_Num.text.toString()
            var secnumber=Edt_2Num.text.toString()

            if (firstnumber.isEmpty() && secnumber.isEmpty()){
                Txt_Ans.text="PLease fill in all fields"
            }else{
                var ans=firstnumber.toDouble() * secnumber.toDouble()
                Txt_Ans.text=ans.toString()
            }
        }
    }
}