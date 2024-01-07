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

        itemView.setOnClickListener{

                var pay =  Pay(foodModel.mejar, foodModel.preu, foodModel.imatge)
                PayProvider.payList.add(PayProvider.payList.size, pay)
        }
    }

}