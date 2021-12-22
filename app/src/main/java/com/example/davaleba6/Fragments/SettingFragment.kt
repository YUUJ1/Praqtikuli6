package com.example.davaleba6.Fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.davaleba6.R

class SettingFragment: Fragment(R.layout.fragment_setting) {
    private lateinit var delbutton : Button
    private lateinit var sharedPreferences: SharedPreferences
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        delbutton = view.findViewById(R.id.button2)
        sharedPreferences = requireActivity().getSharedPreferences("Note", AppCompatActivity.MODE_PRIVATE)
        delbutton.setOnClickListener{
            sharedPreferences.edit().remove("notetext").commit()
        }
    }

}