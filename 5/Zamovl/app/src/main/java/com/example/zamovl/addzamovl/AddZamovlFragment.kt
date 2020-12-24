package com.example.zamovl.addzamovl;

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.zamovl.R
import com.example.zamovl.databinding.FragmentAddZamovlBinding
import timber.log.Timber


class AddZamovlFragment : Fragment() {

    private lateinit var binding: FragmentAddZamovlBinding
    private lateinit var viewModel: AddZamovlViewModel
    private lateinit var viewModelFactory: AddZamovlViewModelFactory

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

            binding = DataBindingUtil.inflate(
                    inflater,
                    R.layout.fragment_add_zamovl,
                    container,
                    false
            )

            Timber.i("Called ViewModelProviders.of!");

            viewModelFactory = AddZamovlViewModelFactory()
            viewModel = ViewModelProviders.of(this, viewModelFactory).get(AddZamovlViewModel::class.java)

            binding.addZamovlViewModel = viewModel
            binding.setLifecycleOwner(this)

        return binding.root;
    }
}