package com.example.davaleba6

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.davaleba6.adapter.ViewPagerFragmentAdapter
import com.example.davaleba6.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        binding.ViewPager.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(binding.Tabs, binding.ViewPager){tab,position ->
           when (position){
               0 -> tab.setIcon(R.drawable.ic_baseline_home_24)
               1 -> tab.setIcon(R.drawable.ic_baseline_image_24)
               2 -> tab.setIcon(R.drawable.ic_baseline_settings_24)
           }
        }.attach()
    }

}

