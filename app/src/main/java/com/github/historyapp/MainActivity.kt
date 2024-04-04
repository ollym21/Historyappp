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
    private lateinit var searchbutton: Button
    private lateinit var clearbutton: Button
    private lateinit var ageInput: EditText
    private lateinit var resultTextView: TextView


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





            //since ages should range between 20 and 100
            if (age != null && age in 20..100) {
                //when age 54 display Luther vandross when 25 display Amy when...ect.

                val celebrityName = when (age) {
                    68 -> "Mbogeni Ngema." +
                            "He was nominated for 4 Tony" +
                            " Awards. His musical work " +
                            "'Circle of Life' earned him" +
                            "a Gramy Award."
                    54 -> "Luther Vandross. Luther began playing" +
                            " piano at the age of 3. During the" +
                            " 1980s Vandross had two singles reach" +
                            " the Billboard R&B chart."
                    76 -> "Carl Weathers." +
                            "In 2021 Carl received an Emmy nomination " +
                            "for outstanding guest actor in a drama serie." +
                            " In 1970 Carl played football in NFL with the " +
                            "Oakland Raiders for one season."
                    25 -> "Tupac Shaku" +
                            "In 1992 Tupac founded Tupac Amura Shakur Foundation" +
                            " to provide communities with adequate resources, skills" +
                            " and a gateway to complete wellness as he believed that youth" +
                            " should take an active role in decision making for their community."
                    36 -> "Princess Dianna" +
                            "During her marriage Diana was involved in the official " +
                            "duties of the Royal Family and was patron to over 100 charities." +
                            "She did her best to publicise work on the behalf of homeless," +
                            " disabled people and children."
                    34 -> "Ricky Ricky" +
                            "Was raised by his maternal granmother after his parents" +
                            " divorced when he was a child. In 2019 he brought a barbershop" +
                            "with his wife which is situated in Midrand, Johannesburg."
                    47 -> "Shona Ferguson." +
                            "Shona was part of a team that produced some of the " +
                            "best selling and award winning South African films and " +
                            "television shows.His first job in the entertainment world" +
                            " was in 1992 as a club Dj. "
                    50 -> "Miachael Jackson." +
                            "Under his father encouragement Jackson's music career began at the" +
                            " age of 5. Jackson notched 38 Grammy Award nominations" +
                            " and 13 wins."
                    27 -> "Amy Whinehouse." +
                            "Two months after her death, Amy Winehouse Foundation was" +
                            " launched by her family to assist the youth on making informed " +
                            "decisions about drugs. Ever since her death the foundation has " +
                            "'established itself as one of the UK's leading charities" +
                            " working with young peopl.' "
                    92 -> "Raymond Ackermans. Raymond founded Pick n Pay in 1962." +
                            " He was known for his multiple campaigns against monopolies."
                    else -> null
                }
                val message = if (celebrityName != null) "$celebrityName"
                else "no celebrities are found under this age "
                resultTextView.text = message


            } else {

                resultTextView.text = "invalid input, please enter a age between 20 and 100."
            }

            clearbutton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }
    }
}