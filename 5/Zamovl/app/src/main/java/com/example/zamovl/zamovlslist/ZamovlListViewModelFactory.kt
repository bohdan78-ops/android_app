package com.example.zamovl.zamovlslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ZamovlListViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ZamovlListViewModel::class.java)) {
            return ZamovlListViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}