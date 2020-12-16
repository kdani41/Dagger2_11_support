package com.kdani.feature1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kdani.core.provideCoreComponent
import com.kdani.core.scopedComponent
import javax.inject.Inject

class FeatureActivity : AppCompatActivity() {

    private val component: FeatureComponent by scopedComponent {
        DaggerFeatureComponent.builder().coreComponent(provideCoreComponent()).build()
    }

    @Inject
    lateinit var vm: FeatureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
    }
}