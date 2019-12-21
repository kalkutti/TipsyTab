package com.mix.tipsytab.ui.base

import androidx.lifecycle.MutableLiveData
import com.mix.tipsytab.ui.base.abstractModels.ABaseViewModel
import com.mix.tipsytab.ui.base.abstractModels.IRcmp

class BaseViewModel : ABaseViewModel() {

    private var categoriesOuterM: CategoryOuter = CategoryOuter() //CategoryOuter implements IRcmp interface
    private var userDataM: Rcmp = Rcmp()                          //Rcmp implements IRcmp interface

    override fun dataInitMutable() {
        var categoryData = MutableLiveData<IRcmp>()
        categoryData.setValue(categoriesOuterM)
        drinks.add(categoryData)
        var userData = MutableLiveData<IRcmp>()
        userData.setValue(userDataM)
        drinks.add(userData)
    }
}
