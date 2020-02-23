package com.example.binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainVM: ViewModel() {
 val age = MutableLiveData<Int>()
    init {
        age.value = 0
    }

    fun inc() {
        age.value = age.value?.plus(1)
    }

    val ageString: LiveData<String> = Transformations.map(age) {
       it.toString()
    }
}