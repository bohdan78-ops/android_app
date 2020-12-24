package com.example.zamovl.addzamovl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class AddZamovlViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel ?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddZamovlViewModel::class.java)) {
            return AddZamovlViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}