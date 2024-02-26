package com.example.hilt_experiment

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.hilt_experiment.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    var viewModelState = ""

    init {
        viewModelState = mainRepository.getText()
        Log.d("gawahtest", mainRepository.getText())
    }
}