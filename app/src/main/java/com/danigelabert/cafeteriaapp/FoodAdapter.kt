package com.danigelabert.cafeteriaapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList:List<Food>): RecyclerView.Adapter<FoodHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FoodHolder(layoutInflater.inflate(R.layout.item_food, parent, false))
    }

    override fun getItemCount(): Int = foodList.size

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        val item = foodList[position]
        holder.render(item)

    }
}