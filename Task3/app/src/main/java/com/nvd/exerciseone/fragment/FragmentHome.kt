package com.nvd.exerciseone.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nvd.exerciseone.MainActivity
import com.nvd.exerciseone.R
import com.nvd.exerciseone.adapter.AdapterHomeCollections
import com.nvd.exerciseone.adapter.AdapterHomeFeatured
import com.nvd.exerciseone.adapter.AdapterHomePopular
import com.nvd.exerciseone.databinding.FragmentHomeBinding
import com.nvd.exerciseone.models.Img

class FragmentHome : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        initRcvFeatured()
        initRcvCollections()
        initRcvPopular()


        return binding.root
    }

    private fun initRcvFeatured() {
        binding.listHomeFeatured.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterFeatured = AdapterHomeFeatured(requireContext(), getData())
        binding.listHomeFeatured.adapter = adapterFeatured
        binding.listHomeFeatured.isNestedScrollingEnabled = false
        binding.listHomeFeatured.isFocusable = false
    }

    private fun initRcvCollections() {
        binding.listHomeCollections.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterCollections = AdapterHomeCollections(requireContext(), getData())
        binding.listHomeCollections.adapter = adapterCollections
        binding.listHomeCollections.isNestedScrollingEnabled = false
        binding.listHomeCollections.isFocusable = false
    }

    private fun initRcvPopular() {
        binding.listHomePopular.layoutManager = GridLayoutManager(requireContext(), 3)
        val adapterPopular = AdapterHomePopular(requireContext(), getDataPopular())
        binding.listHomePopular.adapter = adapterPopular
        binding.listHomePopular.isNestedScrollingEnabled = false
        binding.listHomePopular.isFocusable = false
    }

    private fun getData(): ArrayList<Img> {
        val list = ArrayList<Img>()
        list.add(Img(R.drawable.girl_one))
        list.add(Img(R.drawable.girl_two))
        list.add(Img(R.drawable.girl_three))
        list.add(Img(R.drawable.girl_four))
        list.add(Img(R.drawable.girl_five))
        list.add(Img(R.drawable.girl_six))
        list.add(Img(R.drawable.girl_seven))
        list.add(Img(R.drawable.girl_eight))
        list.add(Img(R.drawable.girl_nine))
        list.add(Img(R.drawable.girl_ten))
        list.add(Img(R.drawable.girl_one))

        return list
    }

    private fun getDataPopular(): ArrayList<Img> {
        val list = ArrayList<Img>()
        list.add(Img(R.drawable.pika_one))
        list.add(Img(R.drawable.pika_two))
        list.add(Img(R.drawable.pika_three))
        list.add(Img(R.drawable.pika_four))
        list.add(Img(R.drawable.pika_five))
        list.add(Img(R.drawable.pika_six))
        list.add(Img(R.drawable.pika_seven))
        list.add(Img(R.drawable.pika_eight))
        list.add(Img(R.drawable.pika_three))
        list.add(Img(R.drawable.girl_eight))
        list.add(Img(R.drawable.girl_nine))
        list.add(Img(R.drawable.girl_ten))
        list.add(Img(R.drawable.girl_one))

        return list
    }
}