package com.comparar.app.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _resultLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = _resultLiveData

    fun compareTexts(text1: String, text2: String) {
        val result = if (text1 == text2) {
            "Las cadenas de caracteres son iguales"
        } else {
            "Las cadenas de caracteres son diferentes"
        }
        _resultLiveData.value = result
    }
}