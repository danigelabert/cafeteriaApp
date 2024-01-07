package com.danigelabert.cafeteriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.danigelabert.cafeteriaapp.databinding.FragmentMenjarBinding

class menjarFragment : Fragment() {

    private lateinit var binding: FragmentMenjarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenjarBinding.inflate(inflater)
        initRecyclerView()
        return binding.root
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, manager.orientation)
        val recyclerView = binding.recyclerMenjar
        recyclerView.layoutManager = manager
        recyclerView.adapter = FoodAdapter(FoodProvider.foodList)
        binding.recyclerMenjar.addItemDecoration(decoration)

    }

}