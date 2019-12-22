package com.mix.tipsytab.ui.base

import androidx.lifecycle.MutableLiveData
import com.mix.tipsytab.ui.base.abstractModels.ABaseViewModel
import com.mix.tipsytab.ui.base.abstractModels.CategoriesFrag
import com.mix.tipsytab.ui.base.abstractModels.IRcmp


class BaseViewModel : ABaseViewModel<CategoriesFrag>() { //var userRepo: CategoryRepo

    private var categoriesOuterM: CategoryOuter = CategoryOuter() //CategoryOuter implements IRcmp interface
    private var userDataM: Rcmp = Rcmp()                          //Rcmp implements IRcmp interface

    override fun dataInitMutable() {
        var categoryData = MutableLiveData<IRcmp>()
        categoryData.setValue(categoriesOuterM)
        categories.add(categoryData)
        var userData = MutableLiveData<IRcmp>()
        userData.setValue(userDataM)
        categories.add(userData)
    }

    override fun handleChangedDataModal(dataModel: IRcmp) {
        if (dataModel is CategoryOuter) {
            mView.updateCategories(dataModel as CategoryOuter)
        } else if (dataModel is Rcmp) {
        }
    }

    fun manipulate() {
        userDataM.name = "new"
        categories.get(0).setValue(userDataM)
    }

    fun handleLoadUserClick(){
        //use
    }
}
