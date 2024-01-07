package com.danigelabert.cafeteriaapp

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danigelabert.cafeteriaapp.databinding.ItemPayBinding

class PayHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemPayBinding.bind(view)

    fun render(payModel: Pay) {
        binding.tvFoodName.text = payModel.mejar
        binding.tvPrice.text = payModel.preu
        Glide.with(binding.ivFood.context).load(payModel.imatge).into(binding.ivFood)
    }
}