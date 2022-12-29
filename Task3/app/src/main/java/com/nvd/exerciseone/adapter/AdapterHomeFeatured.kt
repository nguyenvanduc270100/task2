package com.nvd.exerciseone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemHomeFearturedBinding
import com.nvd.exerciseone.models.Img

class AdapterHomeFeatured(val context: Context, var listImg: List<Img>) :
    RecyclerView.Adapter<AdapterHomeFeatured.FeaturedViewHolder>() {

    class FeaturedViewHolder(binding: ItemHomeFearturedBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemHomeFearturedBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturedViewHolder {
        binding = ItemHomeFearturedBinding.inflate(LayoutInflater.from(context), parent, false)
        return FeaturedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeaturedViewHolder, position: Int) {
        val img = listImg.get(position)
        binding.imgHomeFeatured.setImageResource(img.id)
    }

    override fun getItemCount(): Int = listImg.size
}