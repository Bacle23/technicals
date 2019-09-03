package com.crystals.mvvmplayground.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


open class BaseViewmodel(application: Application = Application()) : AndroidViewModel(application) {
    protected fun launch(block: suspend () -> Unit): Job {
        return viewModelScope.launch {
            block()
        }
    }
}