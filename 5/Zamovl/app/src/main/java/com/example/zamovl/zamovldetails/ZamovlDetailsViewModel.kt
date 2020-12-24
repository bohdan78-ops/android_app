package com.example.zamovl.zamovldetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ZamovlDetailsViewModel : ViewModel() {

    private val _product = MutableLiveData<String>()
    val product : LiveData<String>
        get() = _product

    private val _price  = MutableLiveData<String>()
    val price : LiveData<String>
        get() = _price

    private val _count = MutableLiveData<String>()
    val count : LiveData<String>
        get() = _count



    init {
        Timber.i("ZamovlDetailsViewModel Created");
        _product.value = "Стейк"
        _price.value = " 250"
        _count.value = " 2 "
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("AddZamovlViewModel destroyed");
    }
}