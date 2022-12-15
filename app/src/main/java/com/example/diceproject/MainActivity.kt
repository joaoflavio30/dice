package com.example.diceproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * this activity allow your app rolls a dice
 * and show what number was rolled
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // instance a class of dice and roll the dice
            val dice = Dice(6)
            val diceRoll = dice.rollDice()
            val secondDice = Dice(4)
            val secondDiceRoll = secondDice.rollDice()

            //update the screen of a number sorted
            val resultTextView: TextView = findViewById(R.id.hello)
            resultTextView.text = diceRoll.toString()
            val secondTextView : TextView = findViewById(R.id.secondTextView)
            secondTextView.text = secondDiceRoll.toString()
        }
    }


}


class Dice(private val numSides: Int) {
    fun rollDice(): Int {
        return (1..numSides).random()
    }
}