package com.danigelabert.cafeteriaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danigelabert.cafeteriaapp.databinding.FragmentPagarBinding

class pagarFragment : Fragment() {

    private lateinit var binding: FragmentPagarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPagarBinding.inflate(inflater)

        return binding.root
    }

}