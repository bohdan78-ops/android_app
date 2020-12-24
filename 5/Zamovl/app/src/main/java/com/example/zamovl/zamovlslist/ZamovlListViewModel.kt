package com.example.zamovl.zamovlslist

import androidx.lifecycle.ViewModel
import timber.log.Timber

class ZamovlListViewModel : ViewModel() {

    var tovar = arrayOf( "1 замовлення", "2 замовлення", "3 замовлення", "4 замовлення", "5 замовлення")

    init {
        Timber.i("ZamovlListViewModel");
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("ZamovlListViewModel destroyed");
    }
}