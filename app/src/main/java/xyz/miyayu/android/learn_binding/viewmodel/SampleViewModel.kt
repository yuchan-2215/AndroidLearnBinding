package xyz.miyayu.android.learn_binding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {
    private val _text: MutableLiveData<String> = MutableLiveData<String>("Hello ViewModel")
    val text: LiveData<String> = _text

    fun updateText() {
        _text.value = "Welcome ViewModel"
    }
}