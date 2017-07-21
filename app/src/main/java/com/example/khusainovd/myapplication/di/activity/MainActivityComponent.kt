package com.example.khusainovd.myapplication.di.activity

import com.example.khusainovd.myapplication.MainActivity
import com.example.khusainovd.myapplication.SomethingWithActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector



/**
 * Created by khusainov.d on 21.07.2017.
 */
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    fun inject(s: SomethingWithActivity)
}