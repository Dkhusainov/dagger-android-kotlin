package com.example.khusainovd.myapplication.di

import android.util.Log
import com.example.khusainovd.myapplication.SomethingWithContext
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

/**
 * Created by khusainov.d on 21.07.2017.
 */
class App: DaggerApplication() {

    @Inject lateinit var a: SomethingWithContext

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
                .builder()
                .application(this)
                .build().apply { inject(this@App) }
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("App", a.toString())
    }
}

