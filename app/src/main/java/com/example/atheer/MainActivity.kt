package com.example.atheer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var nameED:EditText
    lateinit var locationED : EditText
    lateinit var mobileED:EditText
    lateinit var show_infoTV: TextView
    lateinit var toaB: Button
    lateinit var tvB:Button
    lateinit var goB:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameED=findViewById(R.id.editText)
        locationED =findViewById(R.id.editText2)
        mobileED=findViewById(R.id.editText3)

        show_infoTV=findViewById(R.id.textView)//display all info in text view (name,location,mobile)

        toaB = findViewById(R.id.button)// display all info in Toast  (name,location,mobile)
        tvB = findViewById(R.id.button2)//display all info in text view (name,location,mobile)
        goB = findViewById(R.id.button3)//display all info in new Screen (name,location,mobile)


        //Button.setOnClickListener  for all

        toaB.setOnClickListener {

            var name= nameED.text.toString() // فيه طريقتين
           Toast.makeText(applicationContext,"$name ${locationED.text} ${mobileED.text}",Toast.LENGTH_SHORT).show()
        }

        tvB.setOnClickListener {
            show_infoTV.setText("${nameED.text} ${locationED.text} ${mobileED.text}")
        }

         goB.setOnClickListener {

            var intent=Intent(this,MainActivity2 ::class.java)

             intent.putExtra("name",nameED.text.toString())
             intent.putExtra("location",locationED.text.toString())
             intent.putExtra("mobile",mobileED.text.toString())

             startActivity(intent)
         }

    }
}