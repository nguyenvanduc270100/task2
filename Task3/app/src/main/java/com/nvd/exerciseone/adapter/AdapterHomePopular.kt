package com.nvd.exerciseone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemHomeFearturedBinding
import com.nvd.exerciseone.databinding.ItemHomePopularBinding
import com.nvd.exerciseone.models.Img

class AdapterHomePopular(val context: Context, var listImg: List<Img>) :
    RecyclerView.Adapter<AdapterHomePopular.PopularViewHolder>() {

    class PopularViewHolder(binding: ItemHomePopularBinding) : RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemHomePopularBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        binding = ItemHomePopularBinding.inflate(LayoutInflater.from(context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val img = listImg.get(position)
        binding.imgHomePopular.setImageResource(img.id)
    }

    override fun getItemCount(): Int = listImg.size

}