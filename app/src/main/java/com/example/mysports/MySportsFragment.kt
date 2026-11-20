package com.example.mysports

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MySportsFragment : Fragment(R.layout.fragment_my_sports) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_football).setOnClickListener {
            val bundle = bundleOf("sportName" to "Football")
            findNavController().navigate(R.id.action_my_sports_to_detail, bundle)
        }

        view.findViewById<Button>(R.id.btn_basketball).setOnClickListener {
            val bundle = bundleOf("sportName" to "Basketball")
            findNavController().navigate(R.id.action_my_sports_to_detail, bundle)
        }
    }
}