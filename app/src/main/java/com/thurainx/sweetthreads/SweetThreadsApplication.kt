package com.thurainx.sweetthreads

import android.app.Application
import com.thurainx.sweetthreads.mvp.models.SweetThreadsModel
import com.thurainx.sweetthreads.mvp.models.SweetThreadsModelImpl

class SweetThreadsApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        SweetThreadsModelImpl.initFirestore()
    }
}