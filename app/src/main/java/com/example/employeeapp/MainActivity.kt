package com.example.employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var getcode=findViewById<EditText>(R.id.code)
        var getname=findViewById<EditText>(R.id.name)
        var getdesig=findViewById<EditText>(R.id.desig)
        var getplace=findViewById<EditText>(R.id.place)
        var getcmpny=findViewById<EditText>(R.id.cmpny)
        Toast.makeText(this,getcode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getplace.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getdesig.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcmpny.text.toString(),Toast.LENGTH_LONG).show()
    }
}