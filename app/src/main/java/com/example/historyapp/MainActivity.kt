package com.example.historyapp

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.view.Display
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

        //get the button message
        //calculate?.setOnClickListener {
        //Toast.makeText(@mainActivity, "Button clicked", Toast.LENGTH_LONG).show()

        //clear?.setOnClickListener {
        //Toast.makeText(@mainActivity, "Button clicked", Toast.LENGTH_LONG).show()

        //for display
        var De_klerk =
        "you are 85 years old,The Age when De klerk  died from complications of the disease in his sleep at his home in Cape Town on 11 November 2021,at the age of 85 "
        val nelson_Mandela=
            "You are 95 years old The Age when The first president of South Africa to be elected in a fully representative democratic election,died at the age of 95"
        val African_nationalism_dominated_South_African_politics=
            "you are 46 years old,At this age South African politics was dominated by Afrikaner nationalism"
        val  Soccer_First_Arrived_In_South_Africa=
            "Your age is 86 years old,at this age soccer first Arrived in South Africa"
        val  Goodwill_Zwelithini=
            "you are 73 years old the age when the kong of the zulu nation Died"
        val  Winnie_Madikizela_Mandela=
            "You are 38 years old it si when Madikizela-Mandela married in 1958"
        val Nelson_Mandela=
            "You are 25 years old when Nelson Mandela studied law at the university of Fort Hare and the University of Witwatersrand before working as a lawyer in Johannesburg"
        val Chris_Hani=
            "you are 51 years old the age when chris Hani was assasinated"
        val brenda_fasie=
            "you are39 years old the age in which brenda fasie was dead"
        val thabo_mbeki=
            "you are 60 years old,the age which Thabo mbeki was the chairperson of the African Union"

        //for clear
        var nothing=""

        //information
        calculateAge?.setOnClickListener {
            val research = ageEt.text.toString()
            if (research.isBlank()) {
                Toast.makeText(this, "Enter a value.", Toast.LENGTH_LONG).show()
            } else if (research.toInt() < 20 || research.toInt() > 100) {
                Toast.makeText(this, "Enter the age between 20 and 100", Toast.LENGTH_LONG).show()
            } else {
                if (research.toInt() == 85)
                    mageTv.text = De_klerk.toString()
                if (research.toInt()==95)
                    mageTv.text=nelson_Mandela
                if (research.toInt()==46)
                    mageTv.text=African_nationalism_dominated_South_African_politics
                if (research.toInt()==86)
                    mageTv.text=Soccer_First_Arrived_In_South_Africa
                if (research.toInt()==73)
                    mageTv.text=Goodwill_Zwelithini
                if (research.toInt()==80)
                    mageTv.text=Winnie_Madikizela_Mandela
                if (research.toInt()==25)
                    mageTv.text=Nelson_Mandela
                if (research.toInt()==51)
                    mageTv.text=Chris_Hani
                if (research.toInt()==39)
                    mageTv.text=brenda_fasie
                if (research.toInt()==60)
                    mageTv.text=thabo_mbeki

                else if (research.toInt()<20|| research.toInt()>100)//The age entered is not represented into the history App
                    Toast.makeText(this,"the year is not represented into the history",Toast.LENGTH_LONG).show()



            }
        }





    }

        }
