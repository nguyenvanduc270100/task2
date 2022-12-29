package com.nvd.exerciseone.adapter.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nvd.exerciseone.fragment.FragmentCategories
import com.nvd.exerciseone.fragment.FragmentHome

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHome()
            1 -> FragmentCategories()
            else -> FragmentHome()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}