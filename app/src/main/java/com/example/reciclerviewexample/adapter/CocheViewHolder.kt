package com.example.reciclerviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.reciclerviewexample.Coche
import com.example.reciclerviewexample.R

class CocheViewHolder(view:View):RecyclerView.ViewHolder(view){

    val coche = view.findViewById<TextView>(R.id.tvCoche)
    val marca = view.findViewById<TextView>(R.id.tvMarcaCoche)
    val photo = view.findViewById<ImageView>(R.id.ivCoche)
    fun render(cocheModel:Coche){
        coche.text = cocheModel.coche
        marca.text = cocheModel.marca

    }
}