package com.kdani.dagger

import android.app.Application
import com.kdani.core.CoreComponent
import com.kdani.core.CoreComponentProvider
import com.kdani.core.DaggerCoreComponent

class MainApp : Application(), CoreComponentProvider {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(this)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory()
            .create(coreComponent = coreComponent)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    override fun provideCoreComponent(): CoreComponent {
        return coreComponent
    }
}