package com.luizafmartinez.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luizafmartinez.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        with(binding) {

           rollButton.text = "Let's Roll"

            rollButton.setOnClickListener {
                rollButton.text = "ROLL!!"
                Toast.makeText(this@MainActivity,
                    "HELLO",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

