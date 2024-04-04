package com.github.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

//ST10456560
//Olwethu Mbele
// guithub link: https://github.com/ollym21/History-App


class MainActivity : AppCompatActivity() {

    //declaring variables
    lateinit var searchbutton: Button
    lateinit var clearbutton: Button
    lateinit var ageInput: EditText
    lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialising buttons
        searchbutton = findViewById(R.id.searchbutton)
        clearbutton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextview)


        //enabling buttons to be clicked on
        searchbutton.setOnClickListener {
            //create variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            //since ages should range between 20 and 50
            if (age != null && age in 20..100) {
                //when age 54 display Luther vandross when 25 display Amy when...ect.

                val celebrityName = when (age) {
                    68 -> "Mbogeni Ngema"
                    54 -> "Luther Vandross"
                    76 -> "Carl Weathers"
                    25 -> "Tupac Shaku"
                    36 -> "Princess Dianna." +
                            ""
                    34 -> "Ricky Ricky"
                    47 -> "Shona Ferguson"
                    50 -> "Miachael Jackson"
                    27 -> "Amy Whinehouse." +
                            ""
                    92 -> "Raymond Ackermans"
                    else -> null
                }
                val message = if (celebrityName != null) "$celebrityName"
                else "no celebrities are found under this age "
                resultTextView.text = message


            } else {

                resultTextView.text = "invalid input, please enter a age between 20 and 50."
            }

            clearbutton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }
    }
}