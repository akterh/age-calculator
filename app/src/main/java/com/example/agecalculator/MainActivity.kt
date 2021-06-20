package com.example.agecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Error
import java.lang.reflect.Type
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var editYear:EditText
    lateinit var editMonth:EditText
    lateinit var editDay:EditText
    lateinit var viewAge:TextView
    lateinit var btnCalculator:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewInit()


            btnCalculator.setOnClickListener {



                    ageCalculator()



            }







    }
    fun viewInit(){
        editYear = findViewById(R.id.editYearText)
        editMonth = findViewById(R.id.editMonthText)
        editDay = findViewById(R.id.editDayText)
        viewAge = findViewById(R.id.viewAge)
        btnCalculator = findViewById(R.id.btnCalc)

    }


    @SuppressLint("SimpleDateFormat")



    fun ageCalculator(){



        try {


            val year = Integer.parseInt(editYear.text.toString())
            val month = Integer.parseInt(editMonth.text.toString())
            val day = Integer.parseInt(editDay.text.toString())


        val ageYear =  Period.between(
                LocalDate.of(year, month, day),
                LocalDate.now()
            ).years
        val ageMonth =  Period.between(
                LocalDate.of(year, month, day),
                LocalDate.now()
            ).months
        val ageDay =  Period.between(
                LocalDate.of(year, month, day),
                LocalDate.now()
            ).days




            if (year.equals(null) || month.equals(null) || day.equals(null)){
                viewAge.text ="Invalid Date"

            }else{
                viewAge.text = "Your Age is $ageYear Years $ageMonth Months $ageDay Days"


            }


        }catch (error:TypeNotPresentException){

        }





    }

}
