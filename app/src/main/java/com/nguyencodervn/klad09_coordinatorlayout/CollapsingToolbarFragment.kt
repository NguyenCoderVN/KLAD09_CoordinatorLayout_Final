package com.nguyencodervn.klad09_coordinatorlayout

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton


class CollapsingToolbarFragment : Fragment(R.layout.fragment_collapsing_toolbar) {
    private lateinit var materialToolbar: MaterialToolbar
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        materialToolbar = view.findViewById(R.id.materialToolbar)
        floatingActionButton = view.findViewById(R.id.FloatingActionButton)

        (activity as AppCompatActivity).setSupportActionBar(materialToolbar)
        floatingActionButton.setOnClickListener {
            Toast.makeText(
                context,
                "Clicked FloatingActionButton",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}