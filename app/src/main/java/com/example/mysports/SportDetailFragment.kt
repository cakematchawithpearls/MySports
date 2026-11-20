package com.example.mysports

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class SportDetailFragment : Fragment(R.layout.fragment_sport_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sportName = arguments?.getString("sportName") ?: "Sport"
        view.findViewById<TextView>(R.id.text_sport_detail).text = "$sportName Page"
    }
}