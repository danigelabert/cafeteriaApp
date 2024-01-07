package com.danigelabert.cafeteriaapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DrinkAdapter(private val drinkList:List<Drink>): RecyclerView.Adapter<DrinkHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DrinkHolder(layoutInflater.inflate(R.layout.item_drink, parent, false))
    }

    override fun getItemCount(): Int = drinkList.size

    override fun onBindViewHolder(holder: DrinkHolder, position: Int) {
        val item = drinkList[position]
        holder.render(item)

    }
}