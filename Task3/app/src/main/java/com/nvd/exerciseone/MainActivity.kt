package com.nvd.exerciseone

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.nvd.exerciseone.adapter.viewpager.ViewPagerAdapter
import com.nvd.exerciseone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPagerAdapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = viewPagerAdapter
        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = resources.getString(R.string.home)
                    1 -> tab.text = resources.getString(R.string.categories)
                }
            }).attach()
        binding.viewPager.isUserInputEnabled = false

        binding.openSearch.setOnClickListener {
            binding.layoutToolbarNormal.visibility = View.GONE
            binding.layoutToolbarSearch.visibility = View.VISIBLE
        }
        binding.imgBack.setOnClickListener {
            binding.layoutToolbarSearch.visibility = View.GONE
            binding.layoutToolbarNormal.visibility = View.VISIBLE
        }

        binding.layoutPopup.imgClear.setOnClickListener {
            binding.layoutPopup.root.visibility = View.GONE
        }

        binding.layoutPopup.layoutMonth.setOnClickListener {
            val selected = ContextCompat.getColor(this, R.color.bling)
            val unSelected = ContextCompat.getColor(this, R.color.Grey)
            it.setBackgroundColor(selected)
            binding.layoutPopup.layoutYear.setBackgroundColor(unSelected)
        }

        binding.layoutPopup.layoutYear.setOnClickListener {
            val selected = ContextCompat.getColor(this, R.color.bling)
            val unSelected = ContextCompat.getColor(this, R.color.Grey)
            it.setBackgroundColor(selected)
            binding.layoutPopup.layoutMonth.setBackgroundColor(unSelected)
        }

        binding.openMenuLeft.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.layoutPopup.root.visibility = View.VISIBLE
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}