package com.example.khusainovd.myapplication

import android.content.Context

class SomethingWithContext(val ctx: Context) {
    override fun toString(): String {
        return "SomethingWithContext(ctx=$${ctx.packageName})"
    }
}