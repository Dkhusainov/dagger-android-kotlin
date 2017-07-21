package com.example.khusainovd.myapplication

import android.app.Activity

/**
 * Created by khusainov.d on 21.07.2017.
 */
class SomethingWithActivity(val act: Activity) {

    override fun toString(): String {
        return "SomethingWithActivity(act=$${act.componentName})"
    }
}