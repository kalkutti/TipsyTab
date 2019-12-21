package com.mix.tipsytab.ui.base.abstractModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class ABaseViewModel : ViewModel() {
    protected var drinks: MutableList<MutableLiveData<IRcmp>> = mutableListOf()
    protected abstract fun dataInitMutable()
}