package com.nvd.exerciseone.adapter.categories

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemCategoriesColorsBinding
import com.nvd.exerciseone.models.Img

class AdapterCategoriesColors(val context: Context, val list: List<Img>) :
    RecyclerView.Adapter<AdapterCategoriesColors.ColorsViewHolder>() {

    class ColorsViewHolder(binding: ItemCategoriesColorsBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemCategoriesColorsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorsViewHolder {
        binding = ItemCategoriesColorsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ColorsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ColorsViewHolder, position: Int) {
        val img = list.get(position)
        binding.imgCategoriesColors.setImageResource(img.id)
    }

    override fun getItemCount(): Int = list.size

}