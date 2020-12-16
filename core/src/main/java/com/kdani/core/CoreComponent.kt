package com.kdani.core

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface CoreComponent {

    fun providerContext(): Context

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance applicationContext: Context
        ): CoreComponent
    }
}