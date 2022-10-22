package com.thurainx.sweetthreads.mvp.models

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

abstract class BasedModel{
    var firestore: FirebaseFirestore? = null

    fun initFirestore(){
        firestore = Firebase.firestore
    }

}