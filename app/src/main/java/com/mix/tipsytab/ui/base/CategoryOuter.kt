package com.mix.tipsytab.ui.base

import com.mix.tipsytab.ui.base.abstractModels.IRcmp

class CategoryOuter : IRcmp {
    private var categories: MutableList<CategInternal>? = null  // CategInternal wraps fundamental class CategDetail

    fun getCategory() : MutableList<CategInternal>?{
        return categories
    }

    fun setCategory(categories: MutableList<CategInternal>){
        this.categories = categories
    }

}