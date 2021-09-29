package com.example.atheer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var infoTV:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name=intent.getStringExtra("name")
        var location=intent.getStringExtra("location")
        var mobile= intent.getStringExtra("mobile")

        infoTV=findViewById(R.id.textView2)

        infoTV.setText("$name $location $mobile")

    }
}