package com.nvd.exerciseone.adapter.categories

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemCategoriesIdealsForYouBinding
import com.nvd.exerciseone.models.Img

class AdapeterCategoriesIdeas(val context: Context, val list: List<Img>) :
    RecyclerView.Adapter<AdapeterCategoriesIdeas.IdeasViewHolder>() {

    class IdeasViewHolder(binding: ItemCategoriesIdealsForYouBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemCategoriesIdealsForYouBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdeasViewHolder {
        binding =
            ItemCategoriesIdealsForYouBinding.inflate(LayoutInflater.from(context), parent, false)
        return IdeasViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IdeasViewHolder, position: Int) {
        val img = list.get(position)
        binding.imgCategoriesIdeas.setImageResource(img.id)
    }

    override fun getItemCount(): Int = list.size

}