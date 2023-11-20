package com.example.reciclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewexample.adapter.CocheAdapter
import com.example.reciclerviewexample.CocheProvider
import com.example.reciclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        binding.recyclerCoches.layoutManager = manager
        binding.recyclerCoches.adapter = CocheAdapter(CocheProvider.cocheList) { coche ->
            onItemSelected(
                coche
            )
        } //le paso un objeto coche
    }

    fun onItemSelected(coche: Coche){
        Toast.makeText(this, coche.coche, Toast.LENGTH_SHORT).show()
    }
}