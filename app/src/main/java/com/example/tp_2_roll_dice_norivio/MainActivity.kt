package com.example.tp_2_roll_dice_norivio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btRoll)

        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val dice2 = Dice(6)

        val diceRoll = dice.roll()
        val diceRoll2 = dice2.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.txtDice)
        resultTextView.text = diceRoll.toString()

        val resulTextView2: TextView = findViewById(R.id.txtDice2)
        resulTextView2.text = diceRoll2.toString()

        if(diceRoll == diceRoll2){
            val toast = Toast.makeText(this, "Félicitation! Vous avez gagné", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}

class Dice(private val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}