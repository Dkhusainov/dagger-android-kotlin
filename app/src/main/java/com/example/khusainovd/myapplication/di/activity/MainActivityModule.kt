package com.example.khusainovd.myapplication.di.activity

import android.app.Activity
import android.util.Log
import com.example.khusainovd.myapplication.MainActivity
import com.example.khusainovd.myapplication.SomethingWithActivity
import dagger.Binds
import dagger.Module
import dagger.Provides




/**
 * Created by khusainov.d on 21.07.2017.
 */
@Module
abstract class MainActivityModule {

    @Binds internal abstract fun bindActivity(activity: MainActivity): Activity

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provactivity(act: MainActivity): SomethingWithActivity {
            Log.d("MainActivityModule", "provactivity")
            return SomethingWithActivity(act)
        }
    }
}