package com.thurainx.sweetthreads.mvp.models

import android.util.Log
import com.thurainx.sweetthreads.mvp.vos.CategoryVO
import durdinapps.rxfirebase2.RxFirestore
import io.reactivex.rxjava3.core.Observable


object SweetThreadsModelImpl : BasedModel(), SweetThreadsModel {
    override fun getCategoryList(onSuccess: (List<CategoryVO>) -> Unit, onFail: (String) -> Unit) {
        firestore?.collection("categories")?.get()?.addOnSuccessListener{ snapShotList ->
            snapShotList.forEach { snapShot ->
                Log.d("category_name", snapShot.data["name"].toString())
            }
        }
    }

}