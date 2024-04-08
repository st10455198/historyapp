package com.example.historyapp

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calculateAge = findViewById<Button>(R.id.calculateAge)
        var ageEt= findViewById<EditText>(R.id.ageEt)
        var mageTv= findViewById<TextView>(R.id.myAgeTv)
        //handle button click
        calculateAge.setOnClickListener {
            //get age from EditText
            val userDOB=ageEt.text.toString().trim()//.trim() removes space from start and end of text
            //get age of the current Year
            val year:Int= Calendar.getInstance().get(Calendar.YEAR)
            //validate
            if (userDOB==""){
                Toast.makeText(this, "please enter year", Toast.LENGTH_SHORT).show()

            }
            else if (userDOB>year.toString()){//Enter Year between 1924=2004>Current Year
                Toast.makeText(this,"Entered year should be  between 1924-2004",Toast.LENGTH_SHORT).show()
            }
            else{
                //1924 - 1996
                val myAge= year - userDOB.toInt()//year is int value,but userDOB was string Value so it should be converted into int
                //set the value of myAge to Textview
                mageTv.text = "Age is"+ myAge+ "Years president Nelson mandela is granted a divorce from Winnie Mandela"
            }

        }

        }
    }
