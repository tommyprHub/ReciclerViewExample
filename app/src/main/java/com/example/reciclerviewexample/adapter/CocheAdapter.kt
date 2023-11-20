package com.example.reciclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewexample.Coche
import com.example.reciclerviewexample.R

class CocheAdapter(private val cocheList:List<Coche>) : RecyclerView.Adapter<CocheViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocheViewHolder {
        //aquí le paso el item (el layout que va a modificar)
        val layoutInflater = LayoutInflater.from(parent.context)
        return CocheViewHolder(layoutInflater.inflate(R.layout.item_coche, parent, false))
    }

    override fun getItemCount(): Int = cocheList.size

    override fun onBindViewHolder(holder: CocheViewHolder, position: Int) {
        val item = cocheList[position]
        holder.render(item)
    }
}