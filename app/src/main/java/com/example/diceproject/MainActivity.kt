package com.example.diceproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

            //update the screen with a rolled dice
            val diceImage : ImageView = findViewById(R.id.imageView)
            val drawableResource = when(diceRoll){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            //definition of content description to accessibility
            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription = diceRoll.toString()
        }
        //open the app with initial image in screen
        val diceImage : ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_6)
    }


}


class Dice(private val numSides: Int) {
    fun rollDice(): Int {
        return (1..numSides).random()
    }
}