package com.kost4n.optionway2.activities

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.kost4n.optionway2.databinding.ActivityMainBinding
import com.kost4n.optionway2.databinding.ActivityNoInternetBinding

class NoInternetActivity: AppCompatActivity() {
    private lateinit var binding: ActivityNoInternetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoInternetBinding.inflate(layoutInflater)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)

        binding.buttonRestartInternet.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}