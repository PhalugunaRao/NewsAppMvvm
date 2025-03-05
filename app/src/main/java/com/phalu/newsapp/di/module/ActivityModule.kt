package com.phalu.newsapp.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.phalu.newsapp.data.repository.TopHeadlineRepository
import dagger.Module
import dagger.Provides
import com.phalu.newsapp.di.ActivityContext
import com.phalu.newsapp.ui.base.ViewModelProviderFactory
import com.phalu.newsapp.ui.topheadline.TopHeadlineAdapter
import com.phalu.newsapp.ui.topheadline.TopHeadlineViewModel

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideNewsListViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}