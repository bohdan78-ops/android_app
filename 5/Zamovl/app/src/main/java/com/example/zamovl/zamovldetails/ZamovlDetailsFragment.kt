package com.example.zamovl.zamovldetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.zamovl.R
import com.example.zamovl.databinding.FragmentZamovlDetailsBinding


class ZamovlDetailsFragment: Fragment() {
    private lateinit var binding: FragmentZamovlDetailsBinding
    private lateinit var viewModel: ZamovlDetailsViewModel
    private lateinit var viewModelFactory: ZamovlDetailsViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_zamovl_details,
                container,
                false
        )

        viewModelFactory = ZamovlDetailsViewModelFactory()
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ZamovlDetailsViewModel::class.java)

        binding.zamovlDetailsViewModel = viewModel
        binding.setLifecycleOwner(this)

        return  binding.root
    }
}