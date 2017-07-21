package com.example.khusainovd.myapplication.di

import android.content.Context
import com.example.khusainovd.myapplication.SomethingWithContext
import com.example.khusainovd.myapplication.di.activity.MainActivityComponent
import dagger.Module
import dagger.Provides

/**
 * Created by khusainov.d on 21.07.2017.
 */
@Module(subcomponents = arrayOf(MainActivityComponent::class))
class AppModule {
    @Provides fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @Provides fun smoehting(ctx: Context): SomethingWithContext {
        return SomethingWithContext(ctx)
    }
}