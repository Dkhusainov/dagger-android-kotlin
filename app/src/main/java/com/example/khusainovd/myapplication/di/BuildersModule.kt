package com.example.khusainovd.myapplication.di

import com.example.khusainovd.myapplication.MainActivity
import com.example.khusainovd.myapplication.di.activity.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector



/**
 * Created by khusainov.d on 21.07.2017.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun mainActivity(): MainActivity

}