package com.mix.tipsytab.ui.base.abstractModels

import androidx.lifecycle.*


abstract class ABaseViewModel<V: CategoriesFrag> : ViewModel(), LifecycleObserver {
    protected var categories: MutableList<MutableLiveData<IRcmp>> = mutableListOf()
    protected abstract fun dataInitMutable()
    protected lateinit var mView: V
    protected lateinit var mOwner: LifecycleOwner
    protected abstract fun handleChangedDataModal(data: IRcmp)

    fun addBaseViewModel(owner: LifecycleOwner){
        this.mOwner = owner
        mOwner.getLifecycle().addObserver(this)
    }

    private fun regisView(view: V){
        mView = view
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected fun onCreate() {
        dataInitMutable()
        regisView(mView)
        for (liveData in categories) {
            liveData.observe(mOwner,
                Observer<IRcmp> { dataModel -> handleChangedDataModal(dataModel) })
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected fun onDestroy() {
        for (liveData in categories) {
            liveData.removeObservers(mOwner)
        }
    }

}