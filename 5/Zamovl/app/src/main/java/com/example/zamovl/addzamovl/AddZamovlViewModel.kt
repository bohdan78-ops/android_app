package com.example.zamovl.addzamovl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class AddZamovlViewModel : ViewModel() {

    private val _product = MutableLiveData<String>()
    val name_product : LiveData<String>
        get() = _product

    private val _price = MutableLiveData<String>()
    val price : LiveData<String>
        get() = _price

    private val _count = MutableLiveData<String>()
    val count : LiveData<String>
        get() = _count


    init {
        Timber.i("AddZamovlViewModel Created");
        _product.value = ""
        _price.value = ""
        _count.value = ""
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("AddZamovlViewModel destroyed");
    }
}