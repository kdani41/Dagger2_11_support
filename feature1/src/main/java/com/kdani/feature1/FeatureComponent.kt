package com.kdani.feature1

import com.kdani.core.CoreComponent
import com.kdani.core.FeatureScope
import dagger.Component

@Component(
    modules = [FeatureModule::class],
    dependencies = [CoreComponent::class]
)
@FeatureScope
interface FeatureComponent {

    fun inject(activity: FeatureActivity)
}