package com.nguyencodervn.klad09_coordinatorlayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar


class ScrollingToolbarFragment : Fragment(R.layout.fragment_scrolling_toolbar) {
    private lateinit var materialToolbar: MaterialToolbar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        materialToolbar = view.findViewById(R.id.materialToolbar)

        (activity as AppCompatActivity).setSupportActionBar(materialToolbar)
    }
}