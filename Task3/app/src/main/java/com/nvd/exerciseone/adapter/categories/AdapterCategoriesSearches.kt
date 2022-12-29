package com.nvd.exerciseone.adapter.categories

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemCategoriesPopularSearchBinding
import com.nvd.exerciseone.models.Img

class AdapterCategoriesSearches(val context: Context, val list: List<Img>) :
    RecyclerView.Adapter<AdapterCategoriesSearches.CategoriesSearchViewHolder>() {

    class CategoriesSearchViewHolder(binding: ItemCategoriesPopularSearchBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemCategoriesPopularSearchBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesSearchViewHolder {
        binding =
            ItemCategoriesPopularSearchBinding.inflate(LayoutInflater.from(context), parent, false)
        return CategoriesSearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoriesSearchViewHolder, position: Int) {
        val img = list.get(position)
        binding.imgCategoriesSearches.setImageResource(img.id)
    }

    override fun getItemCount(): Int = list.size

}