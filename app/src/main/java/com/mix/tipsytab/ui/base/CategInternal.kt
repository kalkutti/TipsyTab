package com.mix.tipsytab.ui.base

class CategInternal{
    private var categories = CategDetail() //CategDetail is a fundamental class with getters and setter

    fun getCategory() : CategDetail{
        return categories
    }

    fun setCategory(categories: CategDetail){
        this.categories = categories
    }
            
}