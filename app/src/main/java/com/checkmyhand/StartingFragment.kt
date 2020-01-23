package com.checkmyhand

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.checkmyhand.databinding.FragmentStartingBinding


class StartingFragment : Fragment() {
    private lateinit var fragmentBinding: FragmentStartingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        DataBindingUtil.inflate<FragmentStartingBinding>(inflater, R.layout.fragment_starting,
            container, false)
        return fragmentBinding.root
    }
}
