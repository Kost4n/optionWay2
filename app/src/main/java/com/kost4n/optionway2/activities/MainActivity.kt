package com.kost4n.optionway2.activities

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.kost4n.optionway2.databinding.ActivityMainBinding
import com.kost4n.optionway2.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)

        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        startActivity(mainViewModel.getIntent())
    }

}