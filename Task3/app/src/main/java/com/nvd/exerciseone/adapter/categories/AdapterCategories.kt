package com.nvd.exerciseone.adapter.categories

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemCategoriesCategoryBinding
import com.nvd.exerciseone.models.Img

class AdapterCategories(val context: Context, val list: List<Img>) :
    RecyclerView.Adapter<AdapterCategories.CategoriesViewHolder>() {

    class CategoriesViewHolder(binding: ItemCategoriesCategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemCategoriesCategoryBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        binding = ItemCategoriesCategoryBinding.inflate(LayoutInflater.from(context), parent, false)
        return CategoriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val img = list.get(position)
        binding.imgCategoriesCategory.setImageResource(img.id)
    }

    override fun getItemCount(): Int = list.size

}