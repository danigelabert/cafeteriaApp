package com.danigelabert.cafeteriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danigelabert.cafeteriaapp.databinding.FragmentBegudaBinding

class begudaFragment : Fragment() {

    private lateinit var binding: FragmentBegudaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBegudaBinding.inflate(inflater)
        return binding.root
    }

}