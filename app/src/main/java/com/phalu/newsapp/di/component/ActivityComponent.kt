package com.phalu.newsapp.di.component

import dagger.Component
import com.phalu.newsapp.di.ActivityScope
import com.phalu.newsapp.di.module.ActivityModule
import com.phalu.newsapp.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}