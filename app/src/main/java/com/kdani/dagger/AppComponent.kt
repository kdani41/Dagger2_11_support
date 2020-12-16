package com.kdani.dagger

import com.kdani.core.AppScope
import com.kdani.core.CoreComponent
import dagger.Component

@AppScope
@Component(dependencies = [CoreComponent::class])
interface AppComponent {

    fun inject(app: MainApp)

    @Component.Factory
    interface Factory {
        fun create(
            coreComponent: CoreComponent
        ): AppComponent
    }
}