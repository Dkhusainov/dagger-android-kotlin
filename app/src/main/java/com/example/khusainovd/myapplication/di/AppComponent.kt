package com.example.khusainovd.myapplication.di

import com.example.khusainovd.myapplication.di.activity.MainActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by khusainov.d on 21.07.2017.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class,
        BuildersModule::class,
        MainActivityModule::class))
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: App): Builder
        fun build(): AppComponent
    }
}