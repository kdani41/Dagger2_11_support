package com.kdani.feature1

import com.kdani.core.scopedComponent
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {

    @Provides
    fun provideVM(activity: FeatureActivity): FeatureViewModel {
        val vm by activity.scopedComponent {
            FeatureViewModel()
        }
        return vm
    }
}