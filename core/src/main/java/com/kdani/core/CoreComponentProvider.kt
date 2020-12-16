package com.kdani.core

import android.app.Activity
import android.content.Context

interface CoreComponentProvider {

    fun provideCoreComponent(): CoreComponent
}

fun Activity.provideCoreComponent(): CoreComponent {
    return provideCoreComponent(applicationContext)
}

private fun provideCoreComponent(applicationContext: Context): CoreComponent {
    return if (applicationContext is CoreComponentProvider) {
        (applicationContext as CoreComponentProvider).provideCoreComponent()
    } else {
        throw IllegalStateException("The application context you have passed does not implement CoreComponentProvider")
    }
}
