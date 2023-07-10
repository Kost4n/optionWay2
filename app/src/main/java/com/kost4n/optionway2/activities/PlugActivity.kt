package com.kost4n.optionway2.activities

import android.content.Context
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kost4n.optionway2.databinding.ActivityPlugBinding
import com.kost4n.optionway2.utilits.RVAdapter
import com.kost4n.optionway2.utilits.RecycleItemDecoration
import com.kost4n.optionway2.viewModels.PlugViewModel

class PlugActivity: AppCompatActivity() {
    private lateinit var binding: ActivityPlugBinding
    private lateinit var adapter: RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val plugViewModel = ViewModelProvider(this)[PlugViewModel::class.java]

        binding = ActivityPlugBinding.inflate(layoutInflater)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)

        setRecyclerView(binding.root.context)
        setFacts(plugViewModel)
    }

    private fun setFacts(plugViewModel: PlugViewModel) {
        adapter.update(plugViewModel.getFacts().toMutableList())
    }

    private fun setRecyclerView(context: Context) {
        val recyclerView = binding.recyclerView
        adapter =  RVAdapter()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        val recycleItemDecorations = RecycleItemDecoration(0)
        recyclerView.addItemDecoration(recycleItemDecorations)

        recyclerView.adapter = adapter
    }
}