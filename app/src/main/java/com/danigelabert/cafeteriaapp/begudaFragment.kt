package com.danigelabert.cafeteriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.danigelabert.cafeteriaapp.databinding.FragmentBegudaBinding

class begudaFragment : Fragment() {

    private lateinit var binding: FragmentBegudaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBegudaBinding.inflate(inflater)
        initRecyclerView()
        return binding.root
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, manager.orientation)
        val recyclerView = binding.recyclerDrink
        recyclerView.layoutManager = manager
        recyclerView.adapter = DrinkAdapter(DrinkProvider.drinkList)
        binding.recyclerDrink.addItemDecoration(decoration)

    }

}