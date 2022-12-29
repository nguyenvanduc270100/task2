package com.nvd.exerciseone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nvd.exerciseone.databinding.ItemHomeFearturedBinding
import com.nvd.exerciseone.databinding.ItemHomePopularCollectionsBinding
import com.nvd.exerciseone.models.Img

class AdapterHomeCollections(val context: Context, var listImg: List<Img>) :
    RecyclerView.Adapter<AdapterHomeCollections.CollectionViewHolder>() {

    class CollectionViewHolder(binding: ItemHomePopularCollectionsBinding) :
        RecyclerView.ViewHolder(binding.root)

    lateinit var binding: ItemHomePopularCollectionsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        binding =
            ItemHomePopularCollectionsBinding.inflate(LayoutInflater.from(context), parent, false)
        return CollectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        val img = listImg.get(position)
        binding.imgHomeCollections.setImageResource(img.id)
    }

    override fun getItemCount(): Int = listImg.size
}