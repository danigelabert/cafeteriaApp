package com.danigelabert.cafeteriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.danigelabert.cafeteriaapp.databinding.FragmentPagarBinding

class pagarFragment : Fragment() {

    private lateinit var binding: FragmentPagarBinding

    val combinedList: MutableList<Any> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPagarBinding.inflate(inflater)
        initRecyclerView()
        return binding.root
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, manager.orientation)
        val recyclerView = binding.recyclerPay
        recyclerView.layoutManager = manager
        recyclerView.adapter = PayAdapter(PayProvider.payList)
        binding.recyclerPay.addItemDecoration(decoration)

    }

}