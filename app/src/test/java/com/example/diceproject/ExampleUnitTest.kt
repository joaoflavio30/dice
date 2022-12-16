package com.example.diceproject

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
      @Test
      fun generates_number(){
          val dice  = Dice(6)
          val rollResult = dice.rollDice()
          assertTrue("The value of rollResult isn't not between 1 and 6",rollResult in 1..6)
      }
}