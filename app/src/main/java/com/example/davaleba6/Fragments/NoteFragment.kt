package com.example.davaleba6.Fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.davaleba6.R
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class NoteFragment: Fragment(R.layout.fragment_note) {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var button: Button
    private lateinit var editText: TextInputEditText
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences = requireActivity().getSharedPreferences("Note", AppCompatActivity.MODE_PRIVATE)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editText)
        textView = view.findViewById(R.id.textView)
        addnote()
    }
    private fun addnote(){
        button.setOnClickListener{
            val note  = editText.text.toString()
            val text = textView.text.toString()
            val result = note + "\n" + text
            textView.text = result
            sharedPreferences.edit()
                .putString("notetext", result)
                .apply()
            editText.text?.clear()
        }
    }

    override fun onResume() {
        super.onResume()
        textView.text = sharedPreferences.getString("notetext", "")

    }
}