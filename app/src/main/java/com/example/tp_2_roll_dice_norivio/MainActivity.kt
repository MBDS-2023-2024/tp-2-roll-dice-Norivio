package com.example.tp_2_roll_dice_norivio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        val rollButton: Button = findViewById(R.id.btRoll)

        rollButton.setOnClickListener {
            /*val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            val resultDice:TextView = findViewById(R.id.txtDice)
            resultDice.text = "6"*/
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.txtDice)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}