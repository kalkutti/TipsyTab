package com.mix.tipsytab.ui.base

import com.mix.tipsytab.ui.base.abstractModels.IRcmp

class CategoryOuter : IRcmp {
    private var categories: MutableList<CategDetail>? = null

    fun getCategories() : MutableList<CategDetail>?{
        return categories
    }

    fun setCategories(categories: MutableList<CategDetail>){
        this.categories = categories
    }

}