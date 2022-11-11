package com.example.password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    private lateinit var phone:EditText
    private lateinit var sms:EditText
    private lateinit var pas1:EditText
    private lateinit var pas2:EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        phone=findViewById(R.id.phone)
        sms=findViewById(R.id.sms)
        pas1=findViewById(R.id.pas1)
        pas2=findViewById(R.id.pas2)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            if (!phone.text.toString().isDigitsOnly() || phone.text.toString()==""||phone.text.toString().length!=9
                ||phone.text.toString()[0].toString()!="5"){
                Toast.makeText(this, "ნომერი არასწორია", Toast.LENGTH_SHORT).show()
            }else if (!sms.text.toString().isDigitsOnly()||sms.text.toString()==""||sms.text.toString().length!=4){
                Toast.makeText(this, "sms კოდი არასწორია", Toast.LENGTH_SHORT).show()
            }else if (pas1.text.toString()=="" || pas2.text.toString()=="" || pas1.text.toString()!=pas2.text.toString()
                ||pas1.text.toString().length<8){
                Toast.makeText(this, "პაროლი არასწორია", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "შეამოწმეთ E-mail", Toast.LENGTH_SHORT).show()
            }
        }

    }
}