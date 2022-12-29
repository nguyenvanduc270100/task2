package com.nvd.exerciseone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nvd.exerciseone.R
import com.nvd.exerciseone.adapter.categories.AdapeterCategoriesIdeas
import com.nvd.exerciseone.adapter.categories.AdapterCategories
import com.nvd.exerciseone.adapter.categories.AdapterCategoriesColors
import com.nvd.exerciseone.adapter.categories.AdapterCategoriesSearches
import com.nvd.exerciseone.databinding.FragmentCategoriesBinding
import com.nvd.exerciseone.models.Img

class FragmentCategories : Fragment() {

    lateinit var binding: FragmentCategoriesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        initRcvSearches()
        initRcvColors()
        initRcvIdeal()
        initRcvCategories()
        return binding.root
    }

    private fun initRcvSearches() {
        binding.listCategoriesSearches.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterSearch = AdapterCategoriesSearches(requireContext(), getData())
        binding.listCategoriesSearches.adapter = adapterSearch
        binding.listCategoriesSearches.isNestedScrollingEnabled = false
        binding.listCategoriesSearches.isFocusable = false
    }

    private fun initRcvColors() {
        binding.listCategoriesColors.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterColor = AdapterCategoriesColors(requireContext(), getData())
        binding.listCategoriesColors.adapter = adapterColor
        binding.listCategoriesColors.isNestedScrollingEnabled = false
        binding.listCategoriesColors.isFocusable = false
    }

    private fun initRcvIdeal() {
        binding.listCategoriesIdeas.layoutManager = LinearLayoutManager(requireContext())
        val adapterIdea = AdapeterCategoriesIdeas(requireContext(), getData())
        binding.listCategoriesIdeas.adapter = adapterIdea
        binding.listCategoriesIdeas.isNestedScrollingEnabled = false
        binding.listCategoriesIdeas.isFocusable = false
    }

    private fun initRcvCategories() {
        binding.listCategoriesCategory.layoutManager = GridLayoutManager(requireContext(), 2)
        val adapterCategories = AdapterCategories(requireContext(), getDataPopular())
        binding.listCategoriesCategory.adapter = adapterCategories
        binding.listCategoriesCategory.isNestedScrollingEnabled = false
        binding.listCategoriesCategory.isFocusable = false
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