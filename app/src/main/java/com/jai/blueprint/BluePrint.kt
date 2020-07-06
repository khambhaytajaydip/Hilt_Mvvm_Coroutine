package com.jai.blueprint

import android.app.Activity
import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * Created by JAI on 04,juy,2020
 * JAI KHAMBHAYTA
 */

@HiltAndroidApp
class BluePrint : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}
