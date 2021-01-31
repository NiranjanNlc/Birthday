package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wish.setOnClickListener{
            val name = birthdayBoy.editableText.toString();
            Toast.makeText(this,"Happy Birthday ",Toast.LENGTH_LONG)
            val intent =  Intent(this,Greeting::class.java)
            intent.putExtra(Greeting.boy,name)
            startActivity(intent)
        }
    }
}


