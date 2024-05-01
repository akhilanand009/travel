package com.example.travel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travel.databinding.TravelMainBinding

class TravelActivity : AppCompatActivity(R.layout.travel_main) {
    private lateinit var binding: TravelMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TravelMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener {
                val intent = Intent(this@TravelActivity, SecondActivity::class.java)

                startActivity(intent)
            }
        }

    }
}