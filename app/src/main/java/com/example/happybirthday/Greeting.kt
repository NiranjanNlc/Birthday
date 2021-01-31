package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting.*

class Greeting : AppCompatActivity() {

 companion object
 {
     const val boy ="birthdayBoy"
 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val namme= intent.getStringExtra(boy)
        birthdayBoy.setText(namme);
    }
}
