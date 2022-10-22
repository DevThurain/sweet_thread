package com.thurainx.sweetthreads.mvp.models

import com.thurainx.sweetthreads.mvp.vos.CategoryVO
import io.reactivex.rxjava3.core.Observable

interface SweetThreadsModel {
    fun getCategoryList(onSuccess: (List<CategoryVO>) -> Unit, onFail: (String) -> Unit)
}