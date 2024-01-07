package com.danigelabert.cafeteriaapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danigelabert.cafeteriaapp.databinding.ItemFoodBinding

class FoodHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemFoodBinding.bind(view)

    fun render(foodModel: Food){
        binding.tvFoodName.text = foodModel.mejar
        binding.tvPrice.text = foodModel.preu
        Glide.with(binding.ivFood.context).load(foodModel.imatge).into(binding.ivFood)

        binding.ivFood.setOnClickListener{Toast.makeText(
            binding.ivFood.context,
            "Click",
            Toast.LENGTH_SHORT
        ).show()}

        itemView.setOnClickListener{Toast.makeText(
            binding.ivFood.context,
            "Click",
            Toast.LENGTH_SHORT
        ).show()}
    }

}