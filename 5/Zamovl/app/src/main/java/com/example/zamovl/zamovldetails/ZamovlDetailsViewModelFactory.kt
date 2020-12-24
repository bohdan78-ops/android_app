package com.example.zamovl.zamovldetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ZamovlDetailsViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ZamovlDetailsViewModel::class.java)) {
            return ZamovlDetailsViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}