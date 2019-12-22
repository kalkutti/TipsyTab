package com.mix.tipsytab.ui.base.abstractModels

import com.mix.tipsytab.ui.base.CategoryOuter

interface CategoriesFrag {

    fun updateCategories(text: CategoryOuter)

    fun showError(text: String)

}