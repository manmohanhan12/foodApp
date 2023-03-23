package com.hmanmohan.foodapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hmanmohan.foodapp.R
import com.hmanmohan.foodapp.databinding.ActivityAddUpdateDishBinding

class AddUpdateDishActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAddUpdateDishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}