package com.danigelabert.cafeteriaapp

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danigelabert.cafeteriaapp.databinding.ItemDrinkBinding

class DrinkHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemDrinkBinding.bind(view)

    fun render(foodModel: Drink){
        binding.tvDrinkName.text = foodModel.mejar
        binding.tvPrice.text = foodModel.preu
        Glide.with(binding.ivDrink.context).load(foodModel.imatge).into(binding.ivDrink)

        binding.ivDrink.setOnClickListener{
            Toast.makeText(
            binding.ivDrink.context,
            "Click",
            Toast.LENGTH_SHORT
        ).show()}

        itemView.setOnClickListener{
            Toast.makeText(
            binding.ivDrink.context,
            "Click",
            Toast.LENGTH_SHORT
        ).show()}
    }

}