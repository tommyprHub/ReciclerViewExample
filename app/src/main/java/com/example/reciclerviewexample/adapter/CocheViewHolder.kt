package com.example.reciclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewexample.Coche
import com.example.reciclerviewexample.databinding.ItemCocheBinding

class CocheViewHolder(val view:View):RecyclerView.ViewHolder(view){
    val binding = ItemCocheBinding.bind(view)

    fun render(cocheModel:Coche, onClickListener:(Coche) -> Unit){
        binding.tvCoche.text = cocheModel.coche
        binding.tvMarcaCoche.text = cocheModel.marca
        Glide.with(binding.ivCoche.context).load(cocheModel.photo).into(binding.ivCoche)

        itemView.setOnClickListener{
            onClickListener(cocheModel)
        }

    }
}