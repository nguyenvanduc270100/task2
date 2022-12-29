package com.nvd.exerciseone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nvd.exerciseone.databinding.FragmentHomeBinding
import com.nvd.exerciseone.databinding.FragmentPopupBinding

class FragmentPopup : Fragment() {

    lateinit var binding : FragmentPopupBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopupBinding.inflate(inflater, container, false)


        return binding.root
    }
}