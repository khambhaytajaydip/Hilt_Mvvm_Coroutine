package com.jai.blueprint.di.module.activity

import androidx.lifecycle.ViewModelProvider
import com.jai.blueprint.data.datamanager.DataManager
import com.jai.blueprint.ui.activity.main.MainViewModel
import com.jai.blueprint.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by JAI on 11,November,2019
 * JAI KHAMBHAYTA
 */

@Module
@InstallIn(ApplicationComponent::class)
class MainActivityModule {

    @Provides
    internal fun provideMainViewModel(dataManager: DataManager): MainViewModel {
        return MainViewModel(dataManager)
    }

    @Provides
    internal fun mainActivityModelProvider(MainActivity: MainViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(MainActivity)
    }

}