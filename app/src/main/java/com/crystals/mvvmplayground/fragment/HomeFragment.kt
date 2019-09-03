package com.crystals.mvvmplayground.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.crystals.mvvmplayground.databinding.FragmentHomeBinding
import com.crystals.mvvmplayground.viewmodel.HomeViewmodel


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeBinding =
            DataBindingUtil.inflate(
                inflater, com.crystals.mvvmplayground.R.layout.fragment_home,
                container, false
            )

        binding.model = HomeViewmodel()
        return binding.root
    }

}
