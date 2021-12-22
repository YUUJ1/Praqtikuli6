package com.example.davaleba6.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba6.Fragments.NoteFragment
import com.example.davaleba6.Fragments.PictureFragment
import com.example.davaleba6.Fragments.SettingFragment
import com.example.davaleba6.MainActivity

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3




    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> NoteFragment()
            1 -> PictureFragment()
            2 -> SettingFragment()
            else -> NoteFragment()
        }
    }
}