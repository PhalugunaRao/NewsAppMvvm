package com.phalu.newsapp.di.component

import android.content.Context
import com.phalu.newsapp.NewsApplication
import com.phalu.newsapp.data.api.NetworkService
import com.phalu.newsapp.data.repository.TopHeadlineRepository
import dagger.Component
import com.phalu.newsapp.di.ApplicationContext
import com.phalu.newsapp.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}