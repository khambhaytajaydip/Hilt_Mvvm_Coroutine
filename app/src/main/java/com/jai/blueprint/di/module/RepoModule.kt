package com.jai.blueprint.di.module

import androidx.work.WorkerFactory
import com.jai.blueprint.data.datamanager.DataManager
import com.jai.blueprint.data.source.NetworkCall
import com.jai.blueprint.data.source.dao.PlayerDao
import com.jai.blueprint.data.source.dao.TeamDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * Created by JAI on 12,November,2019
 * JAI KHAMBHAYTA
 */
@Module
@InstallIn(ApplicationComponent::class)
class RepoModule {
    @Provides
    @Singleton
    internal fun provideMovieRepository(
        teamDao: TeamDao,
        palyerDao: PlayerDao,
        neworkCall: NetworkCall
    ): DataManager {
        return DataManager(teamDao, palyerDao, neworkCall)
    }


}